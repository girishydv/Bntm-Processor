package com.bntm.app.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value ="/order")
@Produces(MediaType.APPLICATION_JSON)
public class BillingRestService {

}
