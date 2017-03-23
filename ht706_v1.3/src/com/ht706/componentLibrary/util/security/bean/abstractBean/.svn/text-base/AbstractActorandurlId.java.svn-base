package com.ht706.componentLibrary.util.security.bean.abstractBean;

/**
 * AbstractActorandurlId entity provides the base persistence definition of the
 * ActorandurlId entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractActorandurlId implements java.io.Serializable {

	// Fields

	private Integer actorId;
	private String responsibility;
	private String name;
	private String url;

	// Constructors

	/** default constructor */
	public AbstractActorandurlId() {
	}

	/** minimal constructor */
	public AbstractActorandurlId(Integer actorId, String url) {
		this.actorId = actorId;
		this.url = url;
	}

	/** full constructor */
	public AbstractActorandurlId(Integer actorId, String responsibility,
			String name, String url) {
		this.actorId = actorId;
		this.responsibility = responsibility;
		this.name = name;
		this.url = url;
	}

	// Property accessors

	public Integer getActorId() {
		return this.actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public String getResponsibility() {
		return this.responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractActorandurlId))
			return false;
		AbstractActorandurlId castOther = (AbstractActorandurlId) other;

		return ((this.getActorId() == castOther.getActorId()) || (this
				.getActorId() != null
				&& castOther.getActorId() != null && this.getActorId().equals(
				castOther.getActorId())))
				&& ((this.getResponsibility() == castOther.getResponsibility()) || (this
						.getResponsibility() != null
						&& castOther.getResponsibility() != null && this
						.getResponsibility().equals(
								castOther.getResponsibility())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getUrl() == castOther.getUrl()) || (this.getUrl() != null
						&& castOther.getUrl() != null && this.getUrl().equals(
						castOther.getUrl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getActorId() == null ? 0 : this.getActorId().hashCode());
		result = 37
				* result
				+ (getResponsibility() == null ? 0 : this.getResponsibility()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getUrl() == null ? 0 : this.getUrl().hashCode());
		return result;
	}

}