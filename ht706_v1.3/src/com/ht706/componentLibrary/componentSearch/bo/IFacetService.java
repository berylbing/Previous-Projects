package com.ht706.componentLibrary.componentSearch.bo;

import java.util.ArrayList;
import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentSearch.actionForm.SearchFilterForm;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;

public interface IFacetService {
	public ArrayList<Facet> showFacetList();
	public List<Asset> searchComponentByFaect(String str[]);
	public List<Asset> serchComponentByFilter(SearchFilterForm f);
	public List<Asset> serchComponentByRelation(String assetId,String relation);
}
