package org.entity.bean;
import java.sql.Timestamp;

import org.entity.bean.abstractBean.AbstractComments;
/**
 * comments entity
 * @author yby
 *
 */
public class Replys extends AbstractComments implements java.io.Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -5402294564377410671L;
public Replys(){}
public Replys(String mid, String texts, String source, Timestamp createddate, String author, String id) {
		super(mid, texts, source, createddate, author, id);
}
}
