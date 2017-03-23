/**
 * @FileName	Standardfeedbackitem.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bean.hbm
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bean.hbm;

import com.ht706.componentLibrary.componentFeedBack.bean.abstractBean.AbstractStandardFeedbackItem;

/**
 * Standardfeedbackitem entity. @author MyEclipse Persistence Tools
 */
public class StandardFeedbackItem extends AbstractStandardFeedbackItem
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public StandardFeedbackItem() {
	}

	/** minimal constructor */
	public StandardFeedbackItem(Integer itemId,
			StandardFeedback standardfeedback, ItemFunction itemFunction) {
		super(itemId, standardfeedback, itemFunction);
	}

	/** full constructor */
	public StandardFeedbackItem(Integer itemId,
			StandardFeedback standardfeedback, String itemName,
			String scoreStandard, String detail, String description,
			ItemFunction itemFunction) {
		super(itemId, standardfeedback, itemName, scoreStandard, detail,
				description, itemFunction);
	}

}
