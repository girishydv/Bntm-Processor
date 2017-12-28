package com.bntm.app.dao.impl;

import org.springframework.stereotype.*;

import com.bntm.app.dao.*;

@Component
public class ProductPackageDaoImpl implements IProductPackageDao {
  /*

  	@PersistenceContext(unitName = "urudb")
  	EntityManager em;

  	@Autowired
  	EntityToModelUtil e2m;

  	@Autowired
  	ModelToEntityUtil m2e;

  	@Override
  	@Transactional
  	public String createProduct(EcomProductModel ecomProductModel) {
  		if(ecomProductModel == null) {
  			throw new BntmApplicationException("Illegal Product data. Product creation failed.");
  		}
  		EcomProduct entity = m2e.convertProductTypeModelToEntity(ecomProductModel);
  		em.persist(entity);
  		return entity.getProductId().toString();
  	}

  	@Override
  	@Transactional
  	public boolean updateProduct(EcomProductModel ecomProductModel) {
  		if(ecomProductModel == null) {
  			throw new BntmApplicationException("Illegal Product data. Product creation failed.");
  		}
  		EcomProduct entity = m2e.convertProductTypeModelToEntity(ecomProductModel);
  		em.merge(entity);
  		return true;
  	}

  	@Override
  	@Transactional
  	public boolean deleteProduct(EcomProductModel ecomProductModel) {
  		if(ecomProductModel == null) {
  			throw new BntmApplicationException("Illegal Product data. Product creation failed.");
  		}
  		EcomProduct entity = em.find(EcomProduct.class,ecomProductModel.getProductId());
  		em.remove(entity);
  		return true;
  	}

  	@Override
  	public List<EcomCatalogModel> getProductsByCategory(String categoryId) {
  		// TODO Auto-generated method stub
  		return null;
  	}

  */
}
