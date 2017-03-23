package com.ht706.componentLibrary.componentFeedBack.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemTrace;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;


/**
 * AbstractProblemreport entity provides the base persistence definition of the
 * Problemreport entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractProblemreport implements java.io.Serializable {

	// Fields

	private String recordId;
	private Asset asset;
	private String reportId;
	private String reporter;
	private String dept;
	private String project;
	private String background;
	private String description;
	private String suggestion;
	private Integer harm;
	private Date discoveryDate;
	private Date reportDate;
	private String file;
	private String status;
	private Set<ProblemTrace> problemtraces = new HashSet<ProblemTrace>(0);

	// Constructors

	/** default constructor */
	public AbstractProblemreport() {
	}

	/** minimal constructor */
	public AbstractProblemreport(String recordId) {
		this.recordId = recordId;
	}

	/** full constructor */
	public AbstractProblemreport(String recordId, Asset asset, String reportId,
			String reporter, String dept, String project, String background,
			String description, String suggestion, Integer harm,
			Date discoveryDate, Date reportDate, String file, String status,
			Set<ProblemTrace> problemtraces) {
		this.recordId = recordId;
		this.asset = asset;
		this.reportId = reportId;
		this.reporter = reporter;
		this.dept = dept;
		this.project = project;
		this.background = background;
		this.description = description;
		this.suggestion = suggestion;
		this.harm = harm;
		this.discoveryDate = discoveryDate;
		this.reportDate = reportDate;
		this.file = file;
		this.status = status;
		this.problemtraces = problemtraces;
	}

	// Property accessors

	

	public Asset getAsset() {
		return this.asset;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReporter() {
		return this.reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getBackground() {
		return this.background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSuggestion() {
		return this.suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public Integer getHarm() {
		return this.harm;
	}

	public void setHarm(Integer harm) {
		this.harm = harm;
	}

	public Date getDiscoveryDate() {
		return this.discoveryDate;
	}

	public void setDiscoveryDate(Date discoveryDate) {
		this.discoveryDate = discoveryDate;
	}

	public Date getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<ProblemTrace> getProblemtraces() {
		return this.problemtraces;
	}

	public void setProblemtraces(Set<ProblemTrace> problemtraces) {
		this.problemtraces = problemtraces;
	}

}