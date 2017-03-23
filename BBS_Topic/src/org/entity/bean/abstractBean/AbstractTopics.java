package org.entity.bean.abstractBean;

import java.sql.Timestamp;
/**
 * AbstractTopics entity provides the base persistence definition of the Topics entity
 * @author huangli
 */
public abstract class AbstractTopics implements java.io.Serializable {

	private String tid;
	private Double energy;
	private String vector;
	private Timestamp updatetime;
	private Integer slot;
	private String clusterperiod;


	/** default constructor */
	public AbstractTopics() {
	}

	/** full constructor */
	public AbstractTopics(Double energy, String vector, Timestamp updatetime, Integer slot, String clusterperiod) {
		this.energy = energy;
		this.vector = vector;
		this.updatetime = updatetime;
		this.slot = slot;
		this.clusterperiod = clusterperiod;
	}

	// Property accessors

	
	public Double getEnergy() {
		return this.energy;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public void setEnergy(Double energy) {
		this.energy = energy;
	}

	public String getVector() {
		return this.vector;
	}

	public void setVector(String vector) {
		this.vector = vector;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp timestamp) {
		this.updatetime = timestamp;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public String getClusterperiod() {
		return clusterperiod;
	}

	public void setClusterperiod(String clusterperiod) {
		this.clusterperiod = clusterperiod;
	}

}