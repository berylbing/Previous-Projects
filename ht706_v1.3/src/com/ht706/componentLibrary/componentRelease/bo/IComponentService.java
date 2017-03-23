package com.ht706.componentLibrary.componentRelease.bo;

import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Componentrelation;

public interface IComponentService {
	public abstract void creatComponentService(Asset c);
	public abstract void editComponentService(Asset c);
	public abstract void deleteComponentService(String id);
	//public abstract Asset searchComponentByIDService(int id);
	public abstract void submitComponentService(String id);
	public abstract List<Asset> showComponentService(String name);
	public Asset ViewComponentService(String id);
	public void creatComponentRelation(Componentrelation r);
	public List<Componentrelation> searchRelatedAsset(String assetid);
	public int deleteRelation(String assetid,String []rassets);
	public void jbpm_Creat_Classificationindex(String assetid);
	public abstract List<Asset> findValidAsset();
	public abstract List<Asset> findValidAssetByNumber(int start, int offset);
}
