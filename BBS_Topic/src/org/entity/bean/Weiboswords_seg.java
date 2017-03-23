package org.entity.bean;

import java.sql.Timestamp;
import org.entity.bean.abstractBean.AbstractPostswords_seg;

public class Weiboswords_seg extends AbstractPostswords_seg implements java.io.Serializable{
	
	public Weiboswords_seg(){
		
	}
	public Weiboswords_seg(Integer pid, String wid, Double weight,
			Timestamp segtime, String position, String sPos, String words, Timestamp issuetime, String topicID) {
		super(pid, wid, weight, segtime, position, sPos, words, issuetime, topicID);
		}
}
