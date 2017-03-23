package com.ht706.componentLibrary.componentFeedBack.bean.abstractBean;

import java.util.Date;

import com.ht706.componentLibrary.componentFeedBack.bean.hbm.ProblemReport;

/**
 * AbstractProblemtrace entity provides the base persistence definition of the
 * Problemtrace entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractProblemtrace implements java.io.Serializable {

	// Fields

	private Integer tid;
	private ProblemReport problemreport;
	private String reportId;
	private Integer person;
	private Date dateOfInformation;
	private String content;
	private String status;

	// Constructors

	/** default constructor */
	public AbstractProblemtrace() {
	}

	/** minimal constructor */
	public AbstractProblemtrace(Integer tid) {
		this.tid = tid;
	}

	/** full constructor */
	public AbstractProblemtrace(Integer tid, ProblemReport problemreport,
			String reportId, Integer person, Date dateOfInformation,
			String content, String status) {
		this.tid = tid;
		this.problemreport = problemreport;
		this.reportId = reportId;
		this.person = person;
		this.dateOfInformation = dateOfInformation;
		this.content = content;
		this.status = status;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public ProblemReport getProblemreport() {
		return this.problemreport;
	}

	public void setProblemreport(ProblemReport problemreport) {
		this.problemreport = problemreport;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public Integer getPerson() {
		return this.person;
	}

	public void setPerson(Integer person) {
		this.person = person;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}