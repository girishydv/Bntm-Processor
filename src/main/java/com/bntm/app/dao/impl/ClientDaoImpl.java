package com.bntm.app.dao.impl;


import javax.persistence.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.bntm.app.business.util.*;
import com.bntm.app.dao.*;


@Component
public class ClientDaoImpl implements IClientDao {
	
	@PersistenceContext(unitName = "urudb")
	EntityManager em;
	
	@Autowired
	EntityToModelUtil e2m;
	
	@Autowired
	ModelToEntityUtil m2e;
  /*
  @Override
  @Transactional
  public String createCategory(EcomCatalogModel pcModel)
  {
  	if(pcModel == null) {
  		throw new BntmApplicationException("Illegal Product data. Product creation failed.");
  	}
  	EcomCategory entity = m2e.convertProductCatalogToEntity(pcModel);
  	em.persist(entity);
  	return entity.getCategoryId().toString();
  }

  @Override
  @Transactional
  public boolean updateCategory(EcomCatalogModel pcModel)
  {
  	if(pcModel == null) {
  		throw new BntmApplicationException("Illegal Product data. Product creation failed.");
  	}
  	EcomCategory entity = m2e.convertProductCatalogToEntity(pcModel);
  	em.merge(entity);
  	return true;
  }

  @Override
  public boolean deleteCategory(EcomCatalogModel pcModel)
  {
  	if(pcModel == null) {
  		throw new BntmApplicationException("Illegal Product data. Product creation failed.");
  	}
  	EcomCategory entity = em.find(EcomCategory.class,(Long.valueOf(pcModel.getCategoryId())));
  	em.remove(entity);
  	return true;
  }

  @Override
  public EcomCatalogModel findCategoryById(long id)
  {
  	try {
  		Query query = (Query) em
  				.createQuery("Select category from EcomCategory category where category.categoryId= :categoryId");
  		query.setParameter("categoryId", id);
  		List<EcomCategory> result = (List<EcomCategory>) query.getResultList();
  		if( result != null && result.size() > 0)
  			return e2m.convertEcomCatalogToModel((EcomCategory)result.get(0));
  		else
  			return null;
  		} catch(Exception _ex) {
  			_ex.printStackTrace();
  		}
  	return null;
  }

  @Override
  public List<EcomCatalogModel> findAllCategories()
  {
  	Query query = em.createNamedQuery("EcomCategory.findAll", EcomCategory.class);
  	List<EcomCategory> prodCat = query.getResultList();
  	if (prodCat != null && prodCat.size() > 0) {
  		List<EcomCatalogModel> models = new ArrayList<EcomCatalogModel>();
  		for (EcomCategory pc : prodCat) {
  			models.add(e2m.convertEcomCatalogToModel(pc));
  		}
  		return models;
  	}
  	return null;

  }


  @Override
  @Transactional
  public String createCatalogPropertyKey(
  		CatalogPropertyKeyModel catalogPropertyKeyModel) {
  	CatalogPropertyKey catalogPropertyKey =m2e.convertAttrModelToEntity(catalogPropertyKeyModel);
  	em.persist(catalogPropertyKey);
  	em.flush();
  	return catalogPropertyKey.getPropertyKeyId().toString();
  }

  @Override
  @Transactional
  public boolean updateCatalogPropertyKey(
  		CatalogPropertyKeyModel catalogPropertyKeyModel) {
  	CatalogPropertyKey catalogPropertyKey =m2e.convertAttrModelToEntity(catalogPropertyKeyModel);
  	em.merge(catalogPropertyKey);
  	return true;
  }

  @Override
  @Transactional
  public boolean deleteCatalogPropertyKey(
  		CatalogPropertyKeyModel catalogPropertyKeyModel) {
  	CatalogPropertyKey catalogPropertyKey =em.find(CatalogPropertyKey.class,catalogPropertyKeyModel.getPropertyKeyId());
  	em.remove(catalogPropertyKey);
  	return true;
  }

  @Override
  @Transactional
  public String createCatalogPropertyValue(
  		CatalogPropertyValueModel catalogPropertyValueModel) {
  	CatalogPropertyValue catalogPropertyValue =m2e.convertAttrValueModelToEntity(catalogPropertyValueModel);
  	em.persist(catalogPropertyValue);
  	return catalogPropertyValue.getPropertyValueId().toString();
  }

  @Override
  @Transactional
  public boolean updateCatalogPropertyValue(
  		CatalogPropertyValueModel catalogPropertyValueModel) {
  	CatalogPropertyValue catalogPropertyValue =m2e.convertAttrValueModelToEntity(catalogPropertyValueModel);
  	em.merge(catalogPropertyValue);
  	return true;
  }

  @Override
  @Transactional
  public boolean deleteCatalogPropertyValue(
  		CatalogPropertyValueModel catalogPropertyValueModel) {
  	CatalogPropertyValue catalogPropertyValue =em.find(CatalogPropertyValue.class,catalogPropertyValueModel.getPropertyValueId());
  	em.remove(catalogPropertyValue);
  	return true;
  }

  @Override
  public CatalogPropertyKeyModel fetchCatalogPropertyByCode(String code) {
  	Query query = em.createNamedQuery("CatalogPropertyKey.findByCode", CatalogPropertyKey.class);
  	query.setParameter("propertyCode", code);
  	CatalogPropertyKey catalogPropertyKey = (CatalogPropertyKey) query.getSingleResult();
  	if (catalogPropertyKey != null ) {
  		CatalogPropertyKeyModel catalogPropertyKeyModel =e2m.convertAttToModel(catalogPropertyKey);
  		return catalogPropertyKeyModel;
  	}
  	return null;
  }

  @Override
  public List<CatalogPropertyKeyModel> getAllPropertyKeys() {
  	Query query = em.createNamedQuery("CatalogPropertyKey.findAll", CatalogPropertyKey.class);
  	List<CatalogPropertyKey> propKeys = query.getResultList();
  	if (propKeys != null && propKeys.size() > 0) {
  		List<CatalogPropertyKeyModel> models = new ArrayList<CatalogPropertyKeyModel>();
  		for (CatalogPropertyKey pk : propKeys) {
  			models.add(e2m.convertAttToModel(pk));
  		}
  		return models;
  	}
  	return null;
  }

  @Override
  @Transactional
  public boolean updateCategoryRates(CategoryRates categoryRates) {

  	EcomCategory entity = em.find(EcomCategory.class,(Long.valueOf(categoryRates.getCategoryId())));

  	entity.settBaseRate(categoryRates.gettBaseRate());
  	entity.settCutRate(categoryRates.gettCutRate());
  	entity.setSpecGravity(categoryRates.getSpecGravity());
  	entity.setMinDimension(categoryRates.getMinDimension());

  	em.merge(entity);

  	return true;
  }*/
}
