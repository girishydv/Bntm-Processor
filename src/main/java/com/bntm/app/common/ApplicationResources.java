package com.bntm.app.common;

import javax.persistence.*;

import org.springframework.stereotype.*;

/**
 * @author Girish.Yadav
 * 
 */
@Component
public class ApplicationResources {

  @PersistenceContext(unitName = "btnm")
  EntityManager em;


}
