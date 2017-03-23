package org.entity.bean.abstractBean;

import java.sql.Timestamp;
/**
 * AbstractTopicsposts entity provides the base persistence definition of the Topicsposts entity.
 * @author huangli
 *
 */
public abstract class AbstractTopicsposts implements java.io.Serializable {


	private Integer tpid;
	private String tid;
	private String topicId;
	private Double similarity;
	private Timestamp clustertime;
	private Double nutrition;
	private String clusterperiod;

	// Constructors

	/** default constructor */
	public AbstractTopicsposts() {
	}

	/** full constructor */
	public AbstractTopicsposts(String tid, String topicId, Double similarity,
			Timestamp clustertime, Double nutrition, String clusterperiod) {
		this.tid = tid;
		this.topicId = topicId;
		this.similarity = similarity;
		this.clustertime = clustertime;
		this.nutrition = nutrition;
		this.clusterperiod = clusterperiod;
	}

	// Property accessors

	public Integer getTpid() {
		return this.tpid;
	}

	public void setTpid(Integer tpid) {
		this.tpid = tpid;
	}


	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public Double getSimilarity() {
		return this.similarity;
	}

	public void setSimilarity(Double similarity) {
		this.similarity = similarity;
	}

	public Timestamp getClustertime() {
		return this.clustertime;
	}

	public void setClustertime(Timestamp clustertime) {
		this.clustertime = clustertime;
	}

	public Double getNutrition() {
		return this.nutrition;
	}

	public void setNutrition(Double nutrition) {
		this.nutrition = nutrition;
	}

	public String getClusterperiod() {
		return clusterperiod;
	}

	public void setClusterperiod(String clusterperiod) {
		this.clusterperiod = clusterperiod;
	}

}