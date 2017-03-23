package com.ht706.componentLibrary.myFavorite.bean.hbm;

import java.util.Date;

import com.ht706.componentLibrary.myFavorite.bean.abstractBean.AbstractMyfavorite;

/**
 * Myfavorite entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Myfavorite extends AbstractMyfavorite implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Myfavorite() {
	}

	/** minimal constructor */
	public Myfavorite(String recordId, String assetUniqueId, String assetName,
			String url) {
		super(recordId, assetUniqueId, assetName, url);
	}

	/** full constructor */
	public Myfavorite(String recordId, String assetUniqueId, String assetName,
			String url, Date dateOfInformation, String typeIs, String nodeName,
			String parentNode, String description, String userId) {
		super(recordId, assetUniqueId, assetName, url, dateOfInformation,
				typeIs, nodeName, parentNode, description, userId);
	}

}
