package com.ht706.componentLibrary.componentRelease.bean.abstractBean;

import java.util.Date;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;

/**
 * AbstractCosteffect entity provides the base persistence definition of the
 * Costeffect entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractCosteffect implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Asset asset;
	private Date dateOfInformation;
	private String estimator;
	private Float sr;
	private Integer l;
	private String n;
	private Float cr;
	private Float ta;
	private Float ca;
	private String cm;
	private Float crRisk;
	private Float caRisk;
	private String cmRisk;
	private Integer LRisk;
	private String NRisk;
	private Float i;
	private String unit;
	private String description;
	// Constructors

	/** default constructor */
	public AbstractCosteffect() {
	}

	/** minimal constructor */
	public AbstractCosteffect(Integer rid) {
		this.rid = rid;
	}

	/** full constructor */
	public AbstractCosteffect(Integer rid, Asset asset, Date dateOfInformation,
			String estimator, Float sr, Integer l, String n, Float cr,
			Float ta, Float ca, String cm, Float crRisk, Float caRisk,
			String cmRisk, Integer LRisk, String NRisk, Float i, String unit, String description) {
		this.rid = rid;
		this.asset = asset;
		this.dateOfInformation = dateOfInformation;
		this.estimator = estimator;
		this.sr = sr;
		this.l = l;
		this.n = n;
		this.cr = cr;
		this.ta = ta;
		this.ca = ca;
		this.cm = cm;
		this.crRisk = crRisk;
		this.caRisk = caRisk;
		this.cmRisk = cmRisk;
		this.LRisk = LRisk;
		this.NRisk = NRisk;
		this.i = i;
		this.unit = unit;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getEstimator() {
		return this.estimator;
	}

	public void setEstimator(String estimator) {
		this.estimator = estimator;
	}

	public Float getSr() {
		return this.sr;
	}

	public void setSr(Float sr) {
		this.sr = sr;
	}

	public Integer getL() {
		return this.l;
	}

	public void setL(Integer l) {
		this.l = l;
	}

	public String getN() {
		return this.n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public Float getCr() {
		return this.cr;
	}

	public void setCr(Float cr) {
		this.cr = cr;
	}

	public Float getTa() {
		return this.ta;
	}

	public void setTa(Float ta) {
		this.ta = ta;
	}

	public Float getCa() {
		return this.ca;
	}

	public void setCa(Float ca) {
		this.ca = ca;
	}

	public String getCm() {
		return this.cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public Float getCrRisk() {
		return this.crRisk;
	}

	public void setCrRisk(Float crRisk) {
		this.crRisk = crRisk;
	}

	public Float getCaRisk() {
		return this.caRisk;
	}

	public void setCaRisk(Float caRisk) {
		this.caRisk = caRisk;
	}

	public String getCmRisk() {
		return this.cmRisk;
	}

	public void setCmRisk(String cmRisk) {
		this.cmRisk = cmRisk;
	}

	public Integer getLRisk() {
		return this.LRisk;
	}

	public void setLRisk(Integer LRisk) {
		this.LRisk = LRisk;
	}

	public String getNRisk() {
		return this.NRisk;
	}

	public void setNRisk(String NRisk) {
		this.NRisk = NRisk;
	}

	public Float getI() {
		return this.i;
	}

	public void setI(Float i) {
		this.i = i;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}