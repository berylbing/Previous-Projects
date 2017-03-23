/**
 * Copyright (c) 2010, 
 * 
 * @FileName: AbstractRelationtypeId.java
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
public abstract class AbstractRelationtypeId implements java.io.Serializable {

	// Fields

	private String relationUuid;
	private Specification specification;

	// Constructors

	/** default constructor */
	public AbstractRelationtypeId() {
	}

	/** full constructor */
	public AbstractRelationtypeId(String relationUuid,
			Specification specification) {
		this.relationUuid = relationUuid;
		this.specification = specification;
	}

	// Property accessors

	public String getRelationUuid() {
		return this.relationUuid;
	}

	public void setRelationUuid(String relationUuid) {
		this.relationUuid = relationUuid;
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
		if (!(other instanceof AbstractRelationtypeId))
			return false;
		AbstractRelationtypeId castOther = (AbstractRelationtypeId) other;

		return ((this.getRelationUuid() == castOther.getRelationUuid()) || (this
				.getRelationUuid() != null
				&& castOther.getRelationUuid() != null && this
				.getRelationUuid().equals(castOther.getRelationUuid())))
				&& ((this.getSpecification() == castOther.getSpecification()) || (this
						.getSpecification() != null
						&& castOther.getSpecification() != null && this
						.getSpecification()
						.equals(castOther.getSpecification())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRelationUuid() == null ? 0 : this.getRelationUuid()
						.hashCode());
		result = 37
				* result
				+ (getSpecification() == null ? 0 : this.getSpecification()
						.hashCode());
		return result;
	}

}