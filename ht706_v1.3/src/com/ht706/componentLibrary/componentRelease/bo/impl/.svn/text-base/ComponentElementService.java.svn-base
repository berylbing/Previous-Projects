package com.ht706.componentLibrary.componentRelease.bo.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javassist.bytecode.Descriptor.Iterator;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof;
import com.ht706.componentLibrary.componentRelease.bo.IComponentElementService;
import com.ht706.componentLibrary.componentRelease.dao.IAssetDAO;
import com.ht706.componentLibrary.componentRelease.dao.IElementDAO;
import com.ht706.componentLibrary.componentRelease.dao.IIsmadeofDAO;

public class ComponentElementService implements IComponentElementService {
	private IElementDAO elementDAO;
	//private TransactionTemplate transactionTemplate;
	private IAssetDAO assetDAO;
	private IIsmadeofDAO ismadeofDAO;
	public IElementDAO getElementDAO() {
		return elementDAO;
	}

	public void setElementDAO(IElementDAO elementDAO) {
		this.elementDAO = elementDAO;
	}

//	public TransactionTemplate getTransactionTemplate() {
//		return transactionTemplate;
//	}
//
//	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
//		this.transactionTemplate = transactionTemplate;
//	}

	public IAssetDAO getAssetDAO() {
		return assetDAO;
	}

	public void setAssetDAO(IAssetDAO assetDAO) {
		this.assetDAO = assetDAO;
	}

	public IIsmadeofDAO getIsmadeofDAO() {
		return ismadeofDAO;
	}

	public void setIsmadeofDAO(IIsmadeofDAO ismadeofDAO) {
		this.ismadeofDAO = ismadeofDAO;
	}
	/**
	 * 保存assetid对应的构件的元素
     * @param 		Element e
     * @param 		String assetid
     * @return      no
     * @exception	保存失败  事物回滚
     */ 
	public void creatComponentElementService(final Element e, final String assetid) {
		// TODO Auto-generated method stub
//		transactionTemplate.execute(
//				new TransactionCallback() {
//					public Object doInTransaction(TransactionStatus ts) {
//						try {
//							e.setCertificationState(1);
//							Asset a=assetDAO.findById(assetid);
//							Ismadeof is=new Ismadeof();
//							is.setAsset(a);
//							is.setElement(e);
//							a.getIsmadeofs().add(is);
//							assetDAO.update(a);
//						} catch (Exception e) {
//							ts.setRollbackOnly();
//						}
//						return null;
//					}
//				}
//				);
		e.setCertificationState(1);
		Asset a=assetDAO.findById(assetid);
		Ismadeof is=new Ismadeof();
		is.setAsset(a);
		is.setElement(e);
		a.getIsmadeofs().add(is);
		assetDAO.update(a);
	}

	/**
	 * 删除id对应的构件的元素
     * @param 		String id
     * @return      no
     * @exception 	删除失败  事物回滚
     */ 
	public void deleteComponentElementService(final String id) {
		// TODO Auto-generated method stub
//		transactionTemplate.execute(
//				new TransactionCallback() {
//					public Object doInTransaction(TransactionStatus ts) {
//						try {
//							elementDAO.delete(elementDAO.findById(id));
//						} catch (Exception e) {
//							ts.setRollbackOnly();
//						}
//						return null;
//					}
//				}
//				);
		elementDAO.delete(elementDAO.findById(id));
	}

	/**
	 * 保存编辑后的构件的元素
     * @param 		Element c
     * @return      no
     * @exception 	保存失败  事物回滚
     */ 
	public void editComponentElementService(final Element c) {
		// TODO Auto-generated method stub
//		transactionTemplate.execute(
//				new TransactionCallback() {
//					public Object doInTransaction(TransactionStatus ts) {
//						try {
//							c.setCertificationState(1);
//							elementDAO.update(c);
//						} catch (Exception e) {
//							ts.setRollbackOnly();
//						}
//						return null;
//					}
//				}
//				);
		c.setCertificationState(1);
		elementDAO.update(c);
	}

	/**
	 * 按构件的主键assetId查找相应的构件元素
     * @param 		String assetId
     * @return      List<Element>
     * @exception 	no
     */ 
	public List<Element> searchComponentElementService(String assetId) {
		// TODO Auto-generated method stub
		Asset asset=assetDAO.findById(assetId);
		//java.util.Iterator i=asset.getIsmadeofs().iterator();
		//Ismadeof tmp=new Ismadeof();
		//tmp.setAsset(asset);
		List<Ismadeof> listI=ismadeofDAO.findByAssetId(assetId);
		List<Element> listE=new ArrayList<Element>();
		for(Ismadeof i:listI){
			listE.add(i.getElement());
		}
		
		return listE;
	}
	
	
	/**
	 * 按构件元素的主键assetId构件元素
     * @param 		String assetId
     * @return      Element
     * @exception 	no
     */ 
	public Element getElementById(String id) {
		// TODO Auto-generated method stub
		return elementDAO.findById(id);
	}

	



}
