package com.ht706.componentLibrary.componentRelease.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.componentRelease.bean.abstractBean.AbstractCosteffect;

/**
 * Costeffect entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Costeffect extends AbstractCosteffect implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Costeffect() {
	}

	/** minimal constructor */
	public Costeffect(Integer rid) {
		super(rid);
	}

	/** full constructor */
	public Costeffect(Integer rid, Asset asset, Date dateOfInformation,
			String estimator, Float sr, Integer l, String n, Float cr,
			Float ta, Float ca, String cm, Float crRisk, Float caRisk,
			String cmRisk, Integer LRisk, String NRisk, Float i, String unit, String description) {
		super(rid, asset, dateOfInformation, estimator, sr, l, n, cr, ta, ca,
				cm, crRisk, caRisk, cmRisk, LRisk, NRisk, i, unit, description);
	}

}
