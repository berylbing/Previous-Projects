/**
 * @FileName	Feedback.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bean.hbm
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bean.hbm;

import java.util.Date;
import java.util.Set;

import com.ht706.componentLibrary.componentFeedBack.bean.abstractBean.AbstractFeedback;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;

/**
 * Feedback entity. @author MyEclipse Persistence Tools
 */
public class Feedback extends AbstractFeedback implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Feedback() {
	}

	/** minimal constructor */
	public Feedback(String recordId, Asset asset, String registryId) {
		super(recordId, asset, registryId);
	}

	/** full constructor */
	public Feedback(String recordId, Asset asset, String registryId,
			String description, Date dateOfInformation, Integer sfId,
			String provider, String file, String background, String enviroment,
			Integer status, Set<FeedbackItem> feedbackitems) {
		super(recordId, asset, registryId, description, dateOfInformation,
				sfId, provider, file, background, enviroment, status,
				feedbackitems);
	}

}
