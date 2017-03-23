/**
 * Copyright (c) 2010, 
 * 
 * @FileName: ISpecificationService.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bo;
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Facet;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Relationtype;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specification;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Specificationmodify;
/**
 * ISpecificationService½Ó¿Ú
 * 
 * @author: yby
 * @Time: 2010-08-31 
 */
public interface ISpecificationService {

	public Specification getById(final String id);

	void modify(final Specification specification);

	void create(final Specification specification);

	void delete(final Specification selectedSpecification);

	public  List<Specification> listAll();

	public ArrayList<Facet> findFacet(String spid);

	public ArrayList<Relationtype> findRelationtype(String spid);

	public Specification findByVersion(final String version);

	public List<Specification> findByNumber(int start, int offset);
	public Set<Relationtype> findcurRelationtype();
	public List<Relationtype> findRelationtypeByNumber(String spid, int start, int offset, int page);

	public List<Specification> listPre();

	public ArrayList<Specificationmodify> listmodify();

}
