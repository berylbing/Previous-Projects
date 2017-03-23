package org.entity.bean.abstractBean;
import java.sql.Timestamp;

/**
 * AbstractWords entity provides the base persistence definition of the Words entity.
 * @author yby
 *
 */
public abstract class AbstractComments implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String mid;
	private String texts;
	private String source;
	private Timestamp createddate;
	private String author;
	private String id;

	// Constructors

	/** default constructor */
	public AbstractComments() {
	}

	/** full constructor */
	public AbstractComments(String mid, String texts, String source, Timestamp createddate, String author, String id) {
		this.mid = mid;
		this.texts = texts;
		this.author = author;
		this.source = source;
		this.createddate = createddate;
		this.id = id;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getTexts() {
		return texts;
	}

	public void setTexts(String texts) {
		this.texts = texts;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Timestamp getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// Property accessors

	

}
