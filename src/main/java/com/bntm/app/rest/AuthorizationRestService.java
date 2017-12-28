package com.bntm.app.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.springframework.web.bind.annotation.*;

/** @author Girish.Yadav */
@RestController()
@RequestMapping(value = "/auth")
@Produces(MediaType.APPLICATION_JSON)
public class AuthorizationRestService {
  /*

  	@Autowired
  	AuthorizationService authorizationService;


  	@RequestMapping(value ="/getUserDetails/{loginName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
  	public EcomLoginModel	getUsereDetails(@PathVariable("loginName") String loginName) {
  		return authorizationService.getUserDetails(loginName);
  	}

  	@POST
  	@Path("/createUserDetails")
  	public boolean	createUserDetails(@RequestBody EcomLoginModel ecomLoginModel) {
  		return authorizationService.createUserDetails(ecomLoginModel);
  	}

  	@POST
  	@Path("/updateUserDetails")
  	public boolean	updateUserDetails(@RequestBody EcomLoginModel ecomLoginModel) {
  		return authorizationService.updateUserDetails(ecomLoginModel);
  	}

  	@POST
  	@Path("/deleteUserDetails")
  	public boolean	deleteUserDetails(@PathVariable("loginName") String loginName) {
  		return authorizationService.deleteUserDetails(loginName);
  	}

  */
}
