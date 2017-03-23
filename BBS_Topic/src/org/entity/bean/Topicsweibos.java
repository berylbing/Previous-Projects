package org.entity.bean;

import java.sql.Timestamp;

import org.entity.bean.abstractBean.AbstractTopicsposts;

public class Topicsweibos extends AbstractTopicsposts implements java.io.Serializable {

// Constructors

/** default constructor */
public Topicsweibos() {
}

/** full constructor */
public Topicsweibos(String tid, String topicId, Double similarity,
	Timestamp clustertime, Double nutrition, String clusterperiod) {
super(tid, topicId, similarity, clustertime, nutrition, clusterperiod);
}

}
