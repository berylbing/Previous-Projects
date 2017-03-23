/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractFacetId.java
 * @ProjectName: HT_706
 * @PackageName: com.ht706.componentLibrary.componentSpecification.bean.abstractBean
 * @author: yby
 * @Time: 2010-08-31 
 */
package com.ht706.componentLibrary.componentSpecification.bean.abstractBean;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.*;

/**
 * 
 * @Document:
 * @author: yby
 * @Time: 2010-08-31 
 *
 */
public abstract class AbstractFacetId implements java.io.Serializable {

	// Fields

	private String facetUuid;
	private Specification specification;

	// Constructors

	/** default constructor */
	public AbstractFacetId() {
	}

	/** full constructor */
	public AbstractFacetId(String facetUuid, Specification specification) {
		this.facetUuid = facetUuid;
		this.specification = specification;
	}

	// Property accessors

	public String getFacetUuid() {
		return this.facetUuid;
	}

	public void setFacetUuid(String facetUuid) {
		this.facetUuid = facetUuid;
	}

	public Specification getSpecification() {
		return this.specification;
	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFacetId))
			return false;
		AbstractFacetId castOther = (AbstractFacetId) other;

		return ((this.getFacetUuid() == castOther.getFacetUuid()) || (this
				.getFacetUuid() != null
				&& castOther.getFacetUuid() != null && this.getFacetUuid()
				.equals(castOther.getFacetUuid())))
				&& ((this.getSpecification() == castOther.getSpecification()) || (this
						.getSpecification() != null
						&& castOther.getSpecification() != null && this
						.getSpecification()
						.equals(castOther.getSpecification())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFacetUuid() == null ? 0 : this.getFacetUuid().hashCode());
		result = 37
				* result
				+ (getSpecification() == null ? 0 : this.getSpecification()
						.hashCode());
		return result;
	}

}