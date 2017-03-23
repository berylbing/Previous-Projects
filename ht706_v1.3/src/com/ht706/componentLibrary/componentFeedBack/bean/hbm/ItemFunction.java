/**
 * @FileName	Itemfunction.java
 * @ProjectName HT706
 * @PackageName com.ht706.componentLibrary.componentFeedBack.bean.hbm
 * @author º÷¿÷À…
 * @Time 2010-7-29	16:09
 */
package com.ht706.componentLibrary.componentFeedBack.bean.hbm;

import com.ht706.componentLibrary.componentFeedBack.bean.abstractBean.AbstractItemFunction;


/**
 * Itemfunction entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ItemFunction extends AbstractItemFunction implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItemFunction() {
	}

	/** minimal constructor */
	public ItemFunction(Integer id) {
		super(id);
	}

	/** full constructor */
	public ItemFunction(Integer id, String funcName, String description) {
		super(id, funcName, description);
	}

}
