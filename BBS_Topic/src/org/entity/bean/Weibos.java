package org.entity.bean;
import java.sql.Timestamp;
import org.entity.bean.abstractBean.AbstractWeibos;
/**
 * Weibo entity
 * @author yby
 *
 */
public class Weibos extends AbstractWeibos implements java.io.Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -7112233993965456078L;
public Weibos(){}
public Weibos(String author, Timestamp createddate, String statusid, String mid, String text, String source, String parentid, String inreplytostatusid, String inreplytouserid, Integer repostscount, Integer commentscount) {
		super( author,  createddate,  statusid,  mid,  text,  source,  parentid,  inreplytostatusid,  inreplytouserid,  repostscount,  commentscount);
}
}
