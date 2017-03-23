package org.entity.bean.abstractBean;
import java.sql.Timestamp;

/**
 * AbstractWords entity provides the base persistence definition of the Words entity.
 * @author huangli
 *
 */
public abstract class AbstractWords implements java.io.Serializable {

	// Fields

	private String wid;
	private String spos;
	private String word;
	private Integer feature;
	private Timestamp updatetime;
	private double weight;
	private Integer no;
	private String other;

	// Constructors

	/** default constructor */
	public AbstractWords() {
	}

	/** full constructor */
	public AbstractWords(String spos, String word, Integer feature, Timestamp updatetime, double weight, Integer no, String other) {
		this.spos = spos;
		this.word = word;
		this.feature = feature;
		this.updatetime = updatetime;
		this.weight = weight;
		this.no = no;
		this.other = other;
	}

	// Property accessors

	public String getWid() {
		return this.wid;
	}

	public void setWid(String wid) {
		this.wid = wid;
	}

	public String getSpos() {
		return this.spos;
	}

	public void setSpos(String spos) {
		this.spos = spos;
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getFeature() {
		return this.feature;
	}

	public void setFeature(Integer feature) {
		this.feature = feature;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

}
