package com.ht706.componentLibrary.componentRelease.bo;

import java.util.List;
import java.util.Set;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Element;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Ismadeof;

public interface IComponentElementService {
	public abstract void creatComponentElementService(Element e,String assetid);
	public abstract void editComponentElementService(Element c);
	public abstract void deleteComponentElementService(String id);
	public abstract List<Element> searchComponentElementService(String assetId);
	public abstract Element getElementById(String id);
}
