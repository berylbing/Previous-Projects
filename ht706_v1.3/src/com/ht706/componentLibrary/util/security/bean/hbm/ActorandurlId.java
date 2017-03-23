package com.ht706.componentLibrary.util.security.bean.hbm;

import com.ht706.componentLibrary.util.security.bean.abstractBean.AbstractActorandurlId;

/**
 * ActorandurlId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class ActorandurlId extends AbstractActorandurlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ActorandurlId() {
	}

	/** minimal constructor */
	public ActorandurlId(Integer actorId, String url) {
		super(actorId, url);
	}

	/** full constructor */
	public ActorandurlId(Integer actorId, String responsibility, String name,
			String url) {
		super(actorId, responsibility, name, url);
	}

}
