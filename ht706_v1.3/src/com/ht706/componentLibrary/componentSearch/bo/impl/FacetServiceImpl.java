package com.ht706.componentLibrary.componentSearch.bo.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.springframework.transaction.support.TransactionTemplate;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation;
import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;
import com.ht706.componentLibrary.componentRelease.dao.IComponentrelationDAO;
import com.ht706.componentLibrary.componentSearch.actionForm.SearchFilterForm;
import com.ht706.componentLibrary.componentSearch.bean.FacetTreeNode;
import com.ht706.componentLibrary.componentSearch.bo.IFacetService;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.componentSpecification.dao.IFacetDAO;
import com.ht706.componentLibrary.componentSpecification.dao.ISpecificationDAO;

public class FacetServiceImpl implements IFacetService{
	private IFacetDAO facetDAO;
	//private TransactionTemplate transactionTemplate;
	private IClassificationindexDAO classificationindexDAO;
	private IAssetDAO assetDAO;
	private ISpecificationDAO specificationDAO;
	private IComponentrelationDAO  componentrelationDAO;
	public void setFacetDAO(IFacetDAO facetDAO) {
		this.facetDAO = facetDAO;
	}

	public IFacetDAO getFacetDAO() {
		return facetDAO;
	}
	public ArrayList<Facet> showFacetList(){
		ArrayList<Facet> ar=new ArrayList<Facet>();
		ar.addAll(((Specification)(specificationDAO.findByStatus(4).get(0))).getFacets());
		return ar; 
	}
	class Rnode{
		public boolean visited=false;
		public HashSet<String> node=new HashSet<String>();
		public String toString(){
			return "visited: "+visited+"     node:"+node;
		}
	}
//	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//		this.transactionTemplate = transactionTemplate;
//	}
//
//	public TransactionTemplate getTransactionTemplate() {
//		return transactionTemplate;
//	}

	public void setClassificationindexDAO(IClassificationindexDAO classificationindexDAO) {
		this.classificationindexDAO = classificationindexDAO;
	}

	public IClassificationindexDAO getClassificationindexDAO() {
		return classificationindexDAO;
	}

	/**
	 * 按刻面的主键查找刻面对应 的构件
     * @param 		String str[]
     * @return      List<Asset>
     * @exception 	no
     */
	public List<Asset> searchComponentByFaect(String str[]) {
		// TODO Auto-generated method stub
		ArrayList<Asset> list=new ArrayList<Asset>();
		if(str==null) return assetDAO.findAll();
		else{
			HashMap<String,FacetTreeNode> treeMap=new HashMap<String,FacetTreeNode>();
			ArrayList<Facet> ar=new ArrayList<Facet>();
			ar.addAll(((Specification)(specificationDAO.findByStatus(4).get(0))).getFacets());                 //获得所有facet
			FacetTreeNode tmp;
			for(Facet i:ar){
				tmp=new FacetTreeNode();
				tmp.setFacet(i);
				treeMap.put(i.getId().getFacetUuid(), tmp);
			}																		//包装进模型
			
			for(FacetTreeNode i:treeMap.values()){								//ParentNode为-1的是root
					if(treeMap.containsKey(i.getFacet().getParentNode())){
						treeMap.get(i.getFacet().getParentNode()).add(i);
					}		
			}																		//建树
			HashMap<String,HashSet<FacetTreeNode>> classification =new HashMap<String,HashSet<FacetTreeNode>>();
			for(String i:str){
				FacetTreeNode facet=(FacetTreeNode)(treeMap.get(i).getPath()[1]);
				//HashSet<FacetTreeNode> childTreeSet=(HashSet<FacetTreeNode>)treeMap.get(i).getChildTreeSet();
				if(classification.containsKey(facet.getFacet().getId().getFacetUuid())) classification.get(facet.getFacet().getId().getFacetUuid()).add(treeMap.get(i));
				else {
					HashSet<FacetTreeNode> childSet=new HashSet<FacetTreeNode>();
					childSet.add(treeMap.get(i));
					classification.put(facet.getFacet().getId().getFacetUuid(), childSet);
					}
			}
	
			//ArrayList<HashSet<String>> listOfAssetIdSet=new ArrayList<HashSet<String>>();
			String hql="from Asset as a ";
			Iterator i=classification.keySet().iterator();
			if(i.hasNext()) hql+="where ";
			while(i.hasNext()){
				HashSet<FacetTreeNode> set=(HashSet<FacetTreeNode>)classification.get(i.next());
				Iterator j=set.iterator();
				if(j.hasNext()) hql+="a.uniqueId in (select c.asset.uniqueId from Classificationindex as c where ";
				while(j.hasNext()){
					FacetTreeNode node=(FacetTreeNode)j.next();
					hql+=("c.facetUuid='"+node.getFacet().getId().getFacetUuid()+"' ");
					if(j.hasNext())hql+="or ";
				}
				if(i.hasNext())hql+=") and ";
				else hql+=")";
			}
			System.out.println("--------------hql: "+hql);
			
	//		String hql="from Asset as a where";
	//		for(int i=0;i<str.length;i++){
	//			if(treeMap.containsKey(str[i])){
	//				hql+=" (";
	//			}
	//		}
			return assetDAO.findByHQL(hql);
		}
		
	}
	public List<String> serchAssetIdByFacet(String facetId){
		String hql="select Asset from Asset as a,Classificationindex as b where b.asset=a and b.facetUuid='"+facetId+"'";
		List<Asset> tmp=assetDAO.findByHQL(hql);
		LinkedList<String> ids=new LinkedList<String>();
		for(Asset a:tmp){
			ids.add(a.getUniqueId());
		}
		return ids;
	}
	
	public void setAssetDAO(IAssetDAO assetDAO) {
		this.assetDAO = assetDAO;
	}

	public IAssetDAO getAssetDAO() {
		return assetDAO;
	}

	/**
	 * 按条件查找对应 的构件
     * @param 		SearchFilterForm f
     * @return      List<Asset>
     * @exception 	no
     */
	public List<Asset> serchComponentByFilter(SearchFilterForm f) {
		// TODO Auto-generated method stub
		String hql="from Asset as a";
		boolean isEmpty=false;
		//System.out.println("-----------------------------------------------SearchType:"+f.getSearchType());
		if(f.getSearchType().equals("基于属性值")){
			if(!f.getName().equals("")){
				if(!isEmpty) hql+=" where";
				hql+=" a.name='"+f.getName()+"'";
				isEmpty=true;
			}//System.out.println("-------------------------------------hql: "+hql);
			if(!f.getProvider().equals("")){
				if(!isEmpty) hql+=" where";
				else if(f.getLogicType1().equals("与")) hql+=" and";
				else if(f.getLogicType1().equals("或")) hql+=" or";
				hql+=" a.provider='"+f.getProvider()+"'";
				isEmpty=true;
			}//System.out.println("-------------------------------------hql: "+hql);
			if(!f.getDomain().equals("")){
				if(!isEmpty) hql+=" where";
				else if(f.getLogicType2().equals("与")) hql+=" and";
				else if(f.getLogicType2().equals("或")) hql+=" or";
				hql+=" a.domain='"+f.getDomain()+"'";
				isEmpty=true;
			}//System.out.println("-------------------------------------hql: "+hql);
			if(!f.getDate().equals("")){
				if(!isEmpty) hql+=" where";
				else if(f.getLogicType3().equals("与")) hql+=" and";
				else if(f.getLogicType2().equals("或")) hql+=" or";
				hql+=" a.acceptanceDate";
				if(f.getRelationType2().equals("等于"))hql+="='";
				else if(f.getRelationType2().equals("之前"))hql+="<'";
				else if(f.getRelationType2().equals("之后"))hql+=">'";
				hql+=(f.getDate()+"'");
				isEmpty=true;
			}//System.out.println("-------------------------------------hql: "+hql);
		}else if(f.getSearchType().equals("基于关键词")){
			if(!f.getKeyword().equals("")){
				hql+=(" where a.keyword like '%"+f.getKeyword()+"%'");
			}
		}
		return assetDAO.findByHQL(hql);
	}
	public List<Asset> serchComponentByRelation(String assetId, String relation) {
		// TODO Auto-generated method stub
		//componentrelationDAO.
		List<Componentrelation> cr=componentrelationDAO.findByRelationType(relation);
		
		HashMap<String,Rnode> map=new HashMap<String,Rnode>();
		int num=0;
		Rnode tmp;
		for(Componentrelation c:cr ){
			if(map.containsKey(c.getSourceAsset())){
				map.get(c.getSourceAsset()).node.add(c.getTargetAsset());
			}else {
				tmp=new Rnode();
				tmp.node.add(c.getTargetAsset());
				map.put(c.getSourceAsset(),tmp);
			}
			if(map.containsKey(c.getTargetAsset())){
				;
			}else {
				tmp=new Rnode();
				//tmp.node.add(c.getTargetAsset());
				map.put(c.getTargetAsset(),tmp);
			}
		}
		dfs(map,assetId);
		String hql="from Asset as a ";
		boolean flag=true;
		for(String i:map.keySet()){
			if(map.get(i).visited){
				if(flag){
					hql+=("where a.uniqueId='"+i+"' ");
					flag=false;
				}else{
					hql+=("or a.uniqueId='"+i+"' ");
				}
			}
			
			
		}
		//System.out.println("------------------hql:"+hql);
		if(flag)return new ArrayList<Asset>();
		
		
		return assetDAO.findByHQL(hql);
	}
	private void dfs(HashMap<String,Rnode> a,String v){
		Rnode b=a.get(v);
		if(b==null);
		else{
			b.visited=true;
			for(String i:b.node){
				Rnode c=a.get(i);
				if(c!=null) if(!c.visited)dfs(a,i);
			}
		}
	}
	public void setSpecificationDAO(ISpecificationDAO specificationDAO) {
		this.specificationDAO = specificationDAO;
	}

	public ISpecificationDAO getSpecificationDAO() {
		return specificationDAO;
	}
	public void setComponentrelationDAO(IComponentrelationDAO componentrelationDAO) {
		this.componentrelationDAO = componentrelationDAO;
	}

	public IComponentrelationDAO getComponentrelationDAO() {
		return componentrelationDAO;
	} 
}
