package com.ht706.componentLibrary.componentRelease.dao;

import java.util.List;

import com.ht706.componentLibrary.componentRelease.bean.hbm.Asset;

public interface IAssetDAO {
	public void save(Asset transientInstance);
	public void update(Asset transientInstance);
	public void delete(Asset persistentInstance);
	public List findAll();
	public Asset findById(java.lang.String id);


	public List findByExample(Asset instance) ;
	public List findByProperty(String propertyName, Object value) ;

	public List findByName(Object name) ;

	public List findByAbstract_(Object abstract_) ;

	public List findByCost(Object cost) ;

	public List findByDomain(Object domain);

	public List findByDistributionStatement(Object distributionStatement) ;

	public List findByLanguage(Object language) ;

	public List findBySecurityClassification(Object securityClassification) ;

	public List findByTargetEnvironment(Object targetEnvironment) ;

	public List findByHistory(Object history) ;

	public List findByKeyword(Object keyword) ;
	public List findByReference(Object reference) ;

	public List findByRestriction(Object restriction) ;

	public List findByTransferSize(Object transferSize) ;
	public List findByVersion(Object version) ;

	public List findByClassificationMachanism(Object classificationMachanism);

	public List findByAgencyPublicationNumber(Object agencyPublicationNumber) ;

	public List findByComplianceToStandards(Object complianceToStandards) ;

	public List findByWarranties(Object warranties) ;

	public List findByRetrievableExtent(Object retrievableExtent) ;

	public List findByUrl(Object url) ;

	public List findByProvider(Object provider) ;

	public List findByApprovedState(Object approvedState) ;

	public List findByCertification(Object certification) ;

	public List findByGrade(Object grade) ;
	public List findByHQL(String hql);

	public Asset merge(Asset detachedInstance);

	public void attachDirty(Asset instance) ;

	public void attachClean(Asset instance) ;
	
	public List<Asset> findValidAssetByNumber(int start, int offset);
}
