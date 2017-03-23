package com.ht706.componentLibrary.systemManagement.bean.hbm;

import java.util.Date;
import java.util.Set;

import com.ht706.componentLibrary.systemManagement.bean.abstractBean.AbstractLibrary;

/**
 * Library entity. @author MyEclipse Persistence Tools
 */
public class Library extends AbstractLibrary implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Library() {
	}

	/** minimal constructor */
	public Library(String libraryUniqueId, String name) {
		super(libraryUniqueId, name);
	}

	/** full constructor */
	public Library(String libraryUniqueId, String name,
			String certificationMethods, String electronicAddress,
			String contactMethod, String libraryClassificationMechanism,
			String libraryMetrics, String libraryRestrications,
			Date dateOfCreation, Set contactises) {
		super(libraryUniqueId, name, certificationMethods, electronicAddress,
				contactMethod, libraryClassificationMechanism, libraryMetrics,
				libraryRestrications, dateOfCreation, contactises);
	}

}
