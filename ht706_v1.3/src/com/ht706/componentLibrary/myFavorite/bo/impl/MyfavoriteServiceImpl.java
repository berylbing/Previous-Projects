package com.ht706.componentLibrary.myFavorite.bo.impl;

import java.util.ArrayList;
import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;
import com.ht706.componentLibrary.myFavorite.bo.IMyfavoriteService;
import com.ht706.componentLibrary.myFavorite.dao.IMyfavoriteDAO;

import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;


public class MyfavoriteServiceImpl implements IMyfavoriteService {
	private IMyfavoriteDAO myFavoriteDAO;
	
	public IMyfavoriteDAO getMyFavoriteDAO() {
		return myFavoriteDAO;
	}
	public void setMyFavoriteDAO(IMyfavoriteDAO myFavoriteDAO) {
		this.myFavoriteDAO = myFavoriteDAO;
	}

	//	private TransactionTemplate transactionTemplate;
	private IAssetDAO assetDAO;



//	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//		this.transactionTemplate = transactionTemplate;
//	}
//
//	public TransactionTemplate getTransactionTemplate() {
//		return transactionTemplate;
//	}
	
	
	
	public List<Myfavorite> getMyFavouriteList(String UserId) {
		// TODO Auto-generated method stub
		List<Myfavorite> m=myFavoriteDAO.findByUserId(UserId);
		Myfavorite mf = myFavoriteDAO.findById("1");
		m.add(0, mf);
		return m;
	}



	public List<Asset> searchComponentByAssetUniqueID(String assetUniqueID) {
		// TODO Auto-generated method stub
		return (List<Asset>) assetDAO.findById(assetUniqueID);
	}

	public ArrayList<Facet> showFacetList() {
		// TODO Auto-generated method stub
		return null;
	}
	public void create(Myfavorite myfavorite) {
		myFavoriteDAO.save(myfavorite);
	}
	
	@SuppressWarnings("unchecked")
	public List<Myfavorite> serachMyFavoriteFolds(String UserId){
		List<Myfavorite> list = myFavoriteDAO.findByUserId(UserId);
		List<Myfavorite> folderList = new ArrayList();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getTypeIs().equals("myFavorite"))
				folderList.add(list.get(i));
		}
		List<Myfavorite> mf = myFavoriteDAO.findByParentNode("0");
		folderList.add(0,mf.get(0));
		return folderList;
		
	}
	public void delete(String recordId) {
		Myfavorite m = myFavoriteDAO.findById(recordId);
		if(m!=null){
			myFavoriteDAO.delete(m);
			List<Myfavorite> ml = myFavoriteDAO.findByParentNode(recordId);
			for(int i=0;i<ml.size();i++){
				delete(ml.get(i).getRecordId());
			}
		}
				
			
		}
	public Myfavorite getMyFavorite(String recordId) {
		// TODO Auto-generated method stub
		return myFavoriteDAO.findById(recordId);
	}
	public void update(final Myfavorite myfavorite) {
		// TODO Auto-generated method stub

		myFavoriteDAO.update(myfavorite);
	}
	@SuppressWarnings("unchecked")
	public List<Myfavorite> listCheckedResult(String userID, String name) {
		// TODO Auto-generated method stub
		List<Myfavorite> m = serachMyFavoriteFolds(userID);
		List<Myfavorite> mcheck = new ArrayList();
		for(int i=0;i<m.size();i++){
			if(m.get(i).getNodeName().equals(name))
			{
				mcheck.add(m.get(i));
			}			
		}
		return mcheck;
	}
	@SuppressWarnings("unchecked")
	public List<Myfavorite> serachMyFavoriteModifyFolds(String userID,
			String nodeId) {
		List<Myfavorite> list = myFavoriteDAO.findByUserId(userID);
		List<Myfavorite> folderList = new ArrayList();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getTypeIs().equals("myFavorite")&&list.get(i).getRecordId()!=nodeId)
				folderList.add(list.get(i));
		}
		List<Myfavorite> mf = myFavoriteDAO.findByParentNode("0");
		folderList.add(0,mf.get(0));
		return folderList;
	}
	@SuppressWarnings("unchecked")
	public List<Myfavorite> checkRoot() {
		List<Myfavorite> mf = myFavoriteDAO.findByParentNode("0");
		return mf;
	}	

}
