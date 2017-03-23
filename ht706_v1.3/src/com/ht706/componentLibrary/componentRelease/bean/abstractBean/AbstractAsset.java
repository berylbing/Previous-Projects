package com.ht706.componentLibrary.componentRelease.bean.abstractBean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Costeffect;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Islocatedin;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Recommendation;
import com.ht706.componentLibrary.componentRelease.bean.hbm.Wascreatedby;
import com.ht706.componentLibrary.componentSpecification.bean.hbm.Classificationindex;
import com.ht706.componentLibrary.systemManagement.bean.hbm.Library;

/**
 * AbstractAsset entity provides the base persistence definition of the Asset
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAsset implements java.io.Serializable {

	// Fields

	private String uniqueId;
	private String name;
	private String abstract_;
	private String cost;
	private Date dateOfInformation;
	private String domain;
	private String distributionStatement;
	private String language;
	private String securityClassification;
	private String targetEnvironment;
	private String history;
	private String keyword;
	private String reference;
	private String restriction;
	private Integer transferSize;
	private String version;
	private Date versionDate;
	private String classificationMachanism;
	private Date acceptanceDate;
	private Integer agencyPublicationNumber;
	private String complianceToStandards;
	private String warranties;
	private Integer retrievableExtent;
	private String url;
	private String provider;
	private String approvedState;
	private String certification;
	private String grade;
	private Set costeffects = new HashSet(0);
	private Set ismadeofs = new HashSet(0);
	private Set islocatedins = new HashSet(0);
	private Set feedbacks = new HashSet(0);
	private Set recommendations = new HashSet(0);
	private Set assetmodifyapplications = new HashSet(0);
	private Set wascreatedbies = new HashSet(0);
	private Set classificationindexes = new HashSet(0);
	// Constructors

	/** default constructor */
	public AbstractAsset() {
	}

	/** minimal constructor */
	public AbstractAsset(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	/** full constructor */
	public AbstractAsset(String uniqueId, String name, String abstract_,
			String cost, Date dateOfInformation, String domain,
			String distributionStatement, String language,
			String securityClassification, String targetEnvironment,
			String history, String keyword, String reference,
			String restriction, Integer transferSize, String version,
			Date versionDate, String classificationMachanism,
			Date acceptanceDate, Integer agencyPublicationNumber,
			String complianceToStandards, String warranties,
			Integer retrievableExtent, String url, String provider,
			String approvedState, String certification, String grade,
			Set costeffects, Set ismadeofs, Set islocatedins, Set feedbacks,
			Set recommendations, Set assetmodifyapplications, Set wascreatedbies) {
		this.uniqueId = uniqueId;
		this.name = name;
		this.abstract_ = abstract_;
		this.cost = cost;
		this.dateOfInformation = dateOfInformation;
		this.domain = domain;
		this.distributionStatement = distributionStatement;
		this.language = language;
		this.securityClassification = securityClassification;
		this.targetEnvironment = targetEnvironment;
		this.history = history;
		this.keyword = keyword;
		this.reference = reference;
		this.restriction = restriction;
		this.transferSize = transferSize;
		this.version = version;
		this.versionDate = versionDate;
		this.classificationMachanism = classificationMachanism;
		this.acceptanceDate = acceptanceDate;
		this.agencyPublicationNumber = agencyPublicationNumber;
		this.complianceToStandards = complianceToStandards;
		this.warranties = warranties;
		this.retrievableExtent = retrievableExtent;
		this.url = url;
		this.provider = provider;
		this.approvedState = approvedState;
		this.certification = certification;
		this.grade = grade;
		this.costeffects = costeffects;
		this.ismadeofs = ismadeofs;
		this.islocatedins = islocatedins;
		this.feedbacks = feedbacks;
		this.recommendations = recommendations;
		this.assetmodifyapplications = assetmodifyapplications;
		this.wascreatedbies = wascreatedbies;
	}

	// Property accessors

	public String getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Date getDateOfInformation() {
		return this.dateOfInformation;
	}

	public void setDateOfInformation(Date dateOfInformation) {
		this.dateOfInformation = dateOfInformation;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getDistributionStatement() {
		return this.distributionStatement;
	}

	public void setDistributionStatement(String distributionStatement) {
		this.distributionStatement = distributionStatement;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSecurityClassification() {
		return this.securityClassification;
	}

	public void setSecurityClassification(String securityClassification) {
		this.securityClassification = securityClassification;
	}

	public String getTargetEnvironment() {
		return this.targetEnvironment;
	}

	public void setTargetEnvironment(String targetEnvironment) {
		this.targetEnvironment = targetEnvironment;
	}

	public String getHistory() {
		return this.history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getRestriction() {
		return this.restriction;
	}

	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}

	public Integer getTransferSize() {
		return this.transferSize;
	}

	public void setTransferSize(Integer transferSize) {
		this.transferSize = transferSize;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getVersionDate() {
		return this.versionDate;
	}

	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}

	public String getClassificationMachanism() {
		return this.classificationMachanism;
	}

	public void setClassificationMachanism(String classificationMachanism) {
		this.classificationMachanism = classificationMachanism;
	}

	public Date getAcceptanceDate() {
		return this.acceptanceDate;
	}

	public void setAcceptanceDate(Date acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public Integer getAgencyPublicationNumber() {
		return this.agencyPublicationNumber;
	}

	public void setAgencyPublicationNumber(Integer agencyPublicationNumber) {
		this.agencyPublicationNumber = agencyPublicationNumber;
	}

	public String getComplianceToStandards() {
		return this.complianceToStandards;
	}

	public void setComplianceToStandards(String complianceToStandards) {
		this.complianceToStandards = complianceToStandards;
	}

	public String getWarranties() {
		return this.warranties;
	}

	public void setWarranties(String warranties) {
		this.warranties = warranties;
	}

	public Integer getRetrievableExtent() {
		return this.retrievableExtent;
	}

	public void setRetrievableExtent(Integer retrievableExtent) {
		this.retrievableExtent = retrievableExtent;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getApprovedState() {
		return this.approvedState;
	}

	public void setApprovedState(String approvedState) {
		this.approvedState = approvedState;
	}

	public String getCertification() {
		return this.certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Set getCosteffects() {
		return this.costeffects;
	}

	public void setCosteffects(Set costeffects) {
		this.costeffects = costeffects;
	}

	public Set getIsmadeofs() {
		return this.ismadeofs;
	}

	public void setIsmadeofs(Set ismadeofs) {
		this.ismadeofs = ismadeofs;
	}

	public Set getIslocatedins() {
		return this.islocatedins;
	}

	public void setIslocatedins(Set islocatedins) {
		this.islocatedins = islocatedins;
	}

	public Set getFeedbacks() {
		return this.feedbacks;
	}

	public void setFeedbacks(Set feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Set getRecommendations() {
		return this.recommendations;
	}

	public void setRecommendations(Set recommendations) {
		this.recommendations = recommendations;
	}

	public Set getAssetmodifyapplications() {
		return this.assetmodifyapplications;
	}

	public void setAssetmodifyapplications(Set assetmodifyapplications) {
		this.assetmodifyapplications = assetmodifyapplications;
	}

	public Set getWascreatedbies() {
		return this.wascreatedbies;
	}

	public void setWascreatedbies(Set wascreatedbies) {
		this.wascreatedbies = wascreatedbies;
		}
//	private String creator;
//	private String facet;
//	public String  getCreator(){
//		//System.out.print("- - - - - - - - - - - - - - - - - - - - - - - - - -");
//		if(this.wascreatedbies.isEmpty()) return null;
//		else return ((Wascreatedby)(this.wascreatedbies.toArray())[0]).getOrganization().getName();
//	}
//	
	public String getFacet() {
		if(this.classificationindexes.isEmpty())return null;
		else return ((Classificationindex)(this.classificationindexes.toArray()[0])).getFacetUuid();
	}
//	public void setCreator(String creator) {
//		this.creator = creator;
//	}

//
//public void setFacet(String facet) {
//	this.facet = facet;
//}


	public void setClassificationindexes(Set classificationindexes) {
		this.classificationindexes = classificationindexes;
	}
	public Set getClassificationindexes() {
	return classificationindexes;
	}
	public String getLibrary() {
		if(islocatedins==null ||islocatedins.isEmpty())return null;
		else {
//			Library[] l=islocatedins.toArray();
//			System.out.println(.length);
			return ((Islocatedin)(islocatedins.toArray()[0])).getLibrary().getName();
		}
	}
}