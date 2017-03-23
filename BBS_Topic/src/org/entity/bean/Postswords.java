package org.entity.bean;

import java.sql.Timestamp;

import org.entity.bean.abstractBean.AbstractPostswords;

public class Postswords extends AbstractPostswords implements
java.io.Serializable {

// Constructors

/** default constructor */
public Postswords() {
}

/** full constructor */
public Postswords(Integer pid, String wid, Double weight,
	Timestamp segtime, String position, String word, String topicID, Integer flag, Timestamp issuetime) {
super(pid, wid, weight, segtime, position, word, topicID, flag, issuetime);
}

}