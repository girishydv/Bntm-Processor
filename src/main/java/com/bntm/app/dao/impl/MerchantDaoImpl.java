package com.bntm.app.dao.impl;

import org.springframework.stereotype.*;

import com.bntm.app.dao.*;

@Component
public class MerchantDaoImpl implements IMerchantDao {
  /*

  	@PersistenceContext(unitName = "urudb")
  	EntityManager em;

  	@Autowired
  	EntityToModelUtil e2m;

  	@Autowired
  	ModelToEntityUtil m2e;

  	@Override
  	@Transactional
  	public String create(EcomItemModel itemData) {

  		if(itemData == null) {
  			throw new BntmApplicationException("Illegal item data. Item creation failed.");
  		}
  		EcomItem entity = m2e.convertItemModelToEntity(itemData);
  		em.persist(entity);
  		return entity.getSku().toString();
  	}
  	@Transactional
  	public boolean update(EcomItemModel itemData) {
  		EcomItem ecomItem = em.find(EcomItem.class,itemData.getSku());
  		em.merge(ecomItem);
  		return true;
  	}

  	@Transactional
  	public boolean delete(EcomItemModel itemData) {
  		em.remove(itemData);
  		return true;
  	}


  	public EcomItemModel findById(long id) {
  		Query query = em.createNamedQuery("EcomItem.findItemById", EcomItem.class);
  		query.setParameter("id", id);
  		EcomItem item = (EcomItem)query.getSingleResult();

  			return e2m.convertItemToModel(item);
  	}

  	public List<EcomItemModel> findAll() {
  		Query query = em.createNamedQuery("EcomItem.findAll", EcomItem.class);
  		List<EcomItem> items = query.getResultList();
  		if (items != null && items.size() > 0) {
  			List<EcomItemModel> models = new ArrayList<EcomItemModel>();
  			for (EcomItem item : items) {
  				models.add(e2m.convertItemToModel(item));
  			}
  			return models;
  		}
  		return null;
  	}

  */
}
