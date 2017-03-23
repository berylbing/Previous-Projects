package org.entity.bean.abstractBean;
import java.sql.Timestamp;
import java.sql.Date;

/**
 * AbstractWeibo entity provides the base persistence definition of the Weibo entity.
 * @author yby
 *
 */
public abstract class AbstractWeibos implements java.io.Serializable {

	// Fields

	private Integer wid;
	private String author;
	private Timestamp createddate;
	private String statusid;
	private String mid;
	private String text;
	private String source;
	private String parentid;
	private String inreplytostatusid;
	private String inreplytouserid;
	private Integer repostscount;
	private Integer commentscount;

	// Constructors

	/** default constructor */
	public AbstractWeibos() {
	}

	/** full constructor */
	public AbstractWeibos(String author, Timestamp createddate, String statusid, String mid, String text, String source, String parentid, String inreplytostatusid, String inreplytouserid, Integer repostscount, Integer commentscount) {
		this.author = author;
		this.createddate = createddate;
		this.commentscount = commentscount;
		this.source = source;
		this.statusid = statusid;
		this.mid = mid;
		this.text = text;
		this.parentid = parentid;
		this.inreplytostatusid = inreplytostatusid;
		this.inreplytouserid = inreplytouserid;
		this.repostscount = repostscount;
	}

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Timestamp getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Timestamp createat) {
		this.createddate = createat;
	}

	public String getStatusid() {
		return statusid;
	}

	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getInreplytostatusid() {
		return inreplytostatusid;
	}

	public void setInreplytostatusid(String inreplytostatusid) {
		this.inreplytostatusid = inreplytostatusid;
	}

	public String getInreplytouserid() {
		return inreplytouserid;
	}

	public void setInreplytouserid(String inreplytouserid) {
		this.inreplytouserid = inreplytouserid;
	}

	public Integer getRepostscount() {
		return repostscount;
	}

	public void setRepostscount(Integer repostscount) {
		this.repostscount = repostscount;
	}

	public Integer getCommentscount() {
		return commentscount;
	}

	public void setCommentscount(Integer commentscount) {
		this.commentscount = commentscount;
	}

	// Property accessors

	

}
