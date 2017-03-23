package com.ht706.componentLibrary.componentSpecification.bo;

import java.util.ArrayList;

import com.ht706.componentLibrary.componentSpecification.bean.hbm.Synonym;

public interface ISynonymService {

	ArrayList<Synonym> findByFacet(String ids, String idf);

	void create(final Synonym synonym);

	Synonym findById(String id);

	void modify(final Synonym s);

	void delete(final Synonym findById);

	ArrayList<Synonym> findBySpec(final String precedeSpec);

}
