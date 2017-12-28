package com.bntm.app.business.service;

import org.springframework.stereotype.*;

import com.bntm.app.model.*;

/**
 * @author Girish.Yadav
 *
 */
@Service 
public interface AuthorizationService {
	
  public LoginModel getMerchantDetails(String merCode);

  public String loginAsMerchant(LoginModel loginModel);

  public boolean logoutMerchant(LoginModel loginModel);
	
}
