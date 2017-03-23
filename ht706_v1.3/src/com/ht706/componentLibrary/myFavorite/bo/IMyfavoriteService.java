package com.ht706.componentLibrary.myFavorite.bo;

import java.util.ArrayList;
import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.myFavorite.bean.hbm.Myfavorite;

public interface IMyfavoriteService {
	public List<Myfavorite>getMyFavouriteList(String UserId);
	public ArrayList<Facet> showFacetList();
	public List<Asset> searchComponentByAssetUniqueID(String assetUniqueID);
	public void create(Myfavorite myfavorite);
	public List<Myfavorite> serachMyFavoriteFolds(String UserId);
	
	public void delete(String recordId);
	public Myfavorite getMyFavorite(String recordId);
	public void update(Myfavorite myfavorite);
	public List<Myfavorite> listCheckedResult(String userID, String name);
	public List<Myfavorite> serachMyFavoriteModifyFolds(String userID,
			String nodeId);
	public List<Myfavorite> checkRoot();
}
