package com.ht706.componentLibrary.componentRelease.bo.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Islocatedin;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Wascreatedby;
import com.ht706.componentLibrary.componentRelease.bo.IComponentService;
import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;
import com.ht706.componentLibrary.componentRelease.dao.IComponentrelationDAO;
import com.ht706.componentLibrary.componentRelease.dao.ICosteffectDAO;
import com.ht706.componentLibrary.componentRelease.dao.IRecommendationDAO;
import com.ht706.componentLibrary.componentRelease.dao.IWascreatedbyDAO;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Classificationindex;
import com.ht706.componentLibrary.componentSpecification.dao.IClassificationindexDAO;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Organization;
import com.ht706.componentLibrary.systemManagement.dao.ILibraryDAO;
import com.ht706.componentLibrary.systemManagement.dao.IOrganizationDAO;

public class ComponentSeverice implements IComponentService, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IAssetDAO assetDAO;
	//private TransactionTemplate transactionTemplate;
	private IComponentrelationDAO  componentrelationDAO;
	private IClassificationindexDAO classificationindexDAO;
	private ICosteffectDAO costeffectDAO;
	private IRecommendationDAO recommendationDAO;
	private IWascreatedbyDAO wascreatedbyDAO;
	private ILibraryDAO libraryDAO;
	private IOrganizationDAO organizationDAO;
	public ILibraryDAO getLibraryDAO() {
		return libraryDAO;
	}

	public void setLibraryDAO(ILibraryDAO libraryDAO) {
		this.libraryDAO = libraryDAO;
	}

	public IComponentrelationDAO getComponentrelationDAO() {
		return componentrelationDAO;
	}

	public void setComponentrelationDAO(IComponentrelationDAO componentrelationDAO) {
		this.componentrelationDAO = componentrelationDAO;
	}

	public ICosteffectDAO getCosteffectDAO() {
		return costeffectDAO;
	}

	public void setCosteffectDAO(ICosteffectDAO costeffectDAO) {
		this.costeffectDAO = costeffectDAO;
	}

	public IRecommendationDAO getRecommendationDAO() {
		return recommendationDAO;
	}

	public void setRecommendationDAO(IRecommendationDAO recommendationDAO) {
		this.recommendationDAO = recommendationDAO;
	}
	
	/**
	 * 新建并保存一个构件
     * @param 		Asset c
     * @return      no
     * @exception 	保存失败 事物回滚
     */ 
	public void creatComponentService(final Asset c) {
		// TODO Auto-generated method stub
//		transactionTemplate.execute(
//				new TransactionCallback() {
//					public Object doInTransaction(TransactionStatus ts) {
//						try {
//							//System.out.println("-------------coste:"+c.getCosteffect().getN()+"  rcmd  "+c.getRecommendation().getUsablity());
//							if(c!=null)assetDAO.save(c);
//							
//						} catch (Exception e) {
//							ts.setRollbackOnly();
//						}
//						return null;
//					}
//				}
//				);
		if(c!=null){
			Library l=(Library)libraryDAO.findAll().get(0);
			Islocatedin i=new Islocatedin();
			i.setAsset(c);
			i.setLibrary(l);
			c.getIslocatedins().add(i);


			Organization o=(Organization)organizationDAO.findByUserName(c.getProvider()).get(0);
			Wascreatedby w=new Wascreatedby();
			w.setOrganization(o);
			w.setAsset(c);
			c.getWascreatedbies().add(w);
			c.setProvider(o.getName());
			assetDAO.save(c);
		}
	}

	/**
	 * 按构件的主键删除一个构件
     * @param 		String id
     * @return      no
     * @exception 	删除失败 事物回滚
     */ 
	public void deleteComponentService(final String id) {
		// TODO Auto-generated method stub
//		transactionTemplate.execute(
//				new TransactionCallback() {
//					public Object doInTransaction(TransactionStatus ts) {
//						try {
//							Asset asset=assetDAO.findById(id);
//							if(asset!=null)assetDAO.delete(asset);
//							
//						} catch (Exception e) {
//							ts.setRollbackOnly();
//						}
//						return null;
//					}
//				}
//				);
		Asset asset=assetDAO.findById(id);
		if(asset!=null)assetDAO.delete(asset);
	}

	/**
	 * 编辑并保存一个构件
     * @param 		Asset c
     * @return      no
     * @exception 	保存失败 事物回滚
     */ 
	public void editComponentService(final Asset c) {
		// TODO Auto-generated method stub
//		transactionTemplate.execute(
//				new TransactionCallback() {
//					public Object doInTransaction(TransactionStatus ts) {
//						try {
//							assetDAO.update(c);
//						} catch (Exception e) {
//							ts.setRollbackOnly();
//						}
//						return null;
//					}
//				}
//				);
		assetDAO.update(c);
	}
	
	/**
	 * 按主键获得一个构件
     * @param 		String id
     * @return      Asset
     * @exception 	no
     */ 
	public Asset ViewComponentService(String id) {
		// TODO Auto-generated method stub
		return assetDAO.findById(id);
	}

	/**
	 * 获得构件列表
     * @param 		String id
     * @return      Asset
     * @exception 	no
     */ 
	public List<Asset> showComponentService(String name) {
		// TODO Auto-generated method stub

		LinkedList<Asset> ar=new LinkedList<Asset>();
		List<Wascreatedby> l=wascreatedbyDAO.findByUserName(name);
		for(Wascreatedby w:l){
			ar.add(w.getAsset());
		}
		return ar;
	}

	/**
	 * 提交构件（到工作流中）
     * @param 		String id
     * @return      Asset
     * @exception 	no
     */
	public void submitComponentService(final String id) {
		// TODO Auto-generated method stub
//		transactionTemplate.execute(
//				new TransactionCallback() {
//					public Object doInTransaction(TransactionStatus ts) {
//						try {
//							Asset asset=assetDAO.findById(id);
//							asset.setApprovedState("已提交");
//							assetDAO.save(asset);
//						} catch (Exception e) {
//							ts.setRollbackOnly();
//						}
//						return null;
//					}
//				}
//				);
		Asset asset=assetDAO.findById(id);
		asset.setApprovedState("已提交");
		assetDAO.save(asset);
	}
	public void creatComponentRelation(Componentrelation r) {
		// TODO Auto-generated method stub
		r.setLastModifiedTime(new Date());
		componentrelationDAO.save(r);
	}
	public void setAssetDAO(IAssetDAO assetDAO) {
		this.assetDAO = assetDAO;
	}

	public IAssetDAO getAssetDAO() {
		return assetDAO;
	}

	public void setWascreatedbyDAO(IWascreatedbyDAO wascreatedbyDAO) {
		this.wascreatedbyDAO = wascreatedbyDAO;
	}

	public IWascreatedbyDAO getWascreatedbyDAO() {
		return wascreatedbyDAO;
	}

	public void setOrganizationDAO(IOrganizationDAO organizationDAO) {
		this.organizationDAO = organizationDAO;
	}

	public IOrganizationDAO getOrganizationDAO() {
		return organizationDAO;
	}

	public List<Componentrelation> searchRelatedAsset(String assetid) {
		// TODO Auto-generated method stub
		ArrayList<Componentrelation> rl=(ArrayList<Componentrelation>)componentrelationDAO.findBySourceAsset(assetid);
		ArrayList<Componentrelation> ll=new ArrayList<Componentrelation>();
		Asset a;
		Componentrelation r;
		for(Componentrelation cr:rl){
			r=new Componentrelation();
			a=assetDAO.findById(cr.getTargetAsset());
			r.setSourceAsset(a.getName());
			r.setTargetAsset(cr.getTargetAsset());
			r.setRelationType(cr.getRelationType());
			ll.add(r);
		}
		return ll;
	}

	public int deleteRelation(String assetid, String[] rassets) {
		// TODO Auto-generated method stub
		return componentrelationDAO.deleteRelation(assetid, rassets);
	}

	public void jbpm_Creat_Classificationindex(String assetid) {
		// TODO Auto-generated method stub
		Asset a=this.ViewComponentService(assetid);
		if(a==null||a.getClassificationMachanism()==null)return ;
		String []str=a.getClassificationMachanism().split(",");
		if(str!=null){
			for(String i:str){
				Classificationindex c=new Classificationindex();
				c.setAsset(a);
				c.setFacetUuid(i);
				c.setVersionDate(new Date());
				c.setAssetName(a.getName());
				c.setProvider(a.getProvider());
				c.setDomain(a.getDomain());
				
				classificationindexDAO.save(c);
			}
		}
		
	}

	public void setClassificationindexDAO(IClassificationindexDAO classificationindexDAO) {
		this.classificationindexDAO = classificationindexDAO;
	}

	public IClassificationindexDAO getClassificationindexDAO() {
		return classificationindexDAO;
	}


	
	public List<Asset> findValidAsset() {
		
		List assetList = assetDAO.findByApprovedState("已批准");
		return assetList;
	}

	public List<Asset> findValidAssetByNumber(int start, int offset) {
		return assetDAO.findValidAssetByNumber(start, offset);
	}
}
