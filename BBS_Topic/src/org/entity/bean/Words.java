package org.entity.bean;

import java.sql.Timestamp;

import org.entity.bean.abstractBean.AbstractWords;
/**
 * words entity
 * @author huangli
 *
 */

public class Words extends AbstractWords implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Words() {
	}

	/** full constructor */
	public Words(String spos, String word, Integer feature, Timestamp updatetime, double weight, Integer no, String other) {
		super(spos, word, feature, updatetime, weight, no, other);
	}

}
