package com.ht706.componentLibrary.componentRelease.bean.hbm;

import java.util.Date;
import java.util.Set;

import com.ht706.componentLibrary.componentRelease.bean.abstractBean.AbstractElement;

/**
 * Element entity. @author MyEclipse Persistence Tools
 */
public class Element extends AbstractElement implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Element() {
	}

	/** minimal constructor */
	public Element(String elementUniqueId, String name, String elementType,
			Date dateOfInformation, Integer certificationState, String provider) {
		super(elementUniqueId, name, elementType, dateOfInformation,
				certificationState, provider);
	}

	/** full constructor */
	public Element(String elementUniqueId, String name, String elementType,
			String media, Date dateOfInformation, Integer certificationState,
			String provider, String description, Set elimentfileses,
			Set ismadeofs) {
		super(elementUniqueId, name, elementType, media, dateOfInformation,
				certificationState, provider, description, elimentfileses,
				ismadeofs);
	}

}
