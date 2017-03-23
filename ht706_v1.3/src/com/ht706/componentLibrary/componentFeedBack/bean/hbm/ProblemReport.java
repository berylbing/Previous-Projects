package com.ht706.componentLibrary.componentFeedBack.bean.hbm;

import java.util.Date;
import java.util.Set;

import com.ht706.componentLibrary.componentFeedBack.bean.abstractBean.AbstractProblemreport;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;

/**
 * Problemreport entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ProblemReport extends AbstractProblemreport implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProblemReport() {
	}

	/** minimal constructor */
	public ProblemReport(String recordId) {
		super(recordId);
	}

	/** full constructor */
	public ProblemReport(String recordId, Asset asset, String reportId,
			String reporter, String dept, String project, String background,
			String description, String suggestion, Integer harm,
			Date discoveryDate, Date reportDate, String file, String status,
			Set problemtraces) {
		super(recordId, asset, reportId, reporter, dept, project, background,
				description, suggestion, harm, discoveryDate, reportDate, file,
				status, problemtraces);
	}

}
