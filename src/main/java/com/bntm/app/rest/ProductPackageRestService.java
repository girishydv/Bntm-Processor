package com.bntm.app.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/items")
@Produces(MediaType.APPLICATION_JSON)
public class ProductPackageRestService {
  /*

  	@Autowired
  	ProductPackageService itemService;

  	@GET
  	@Path("allItems")
  	@Produces(MediaType.APPLICATION_JSON)
  	public List<EcomItemModel> getAllItems() {
  		return itemService.getAllItems();
  	}

  	@GET
  	@Path("itemById")
  	public EcomItemModel getItemById(@QueryParam("id") Long id) {
  		return itemService.getItemById(id);
  	}

  	@POST
  	@Path("/createItem")
  	@Consumes(MediaType.APPLICATION_JSON)
  	public String createItem(EcomItemModel ecomItemModel) {

  		return itemService.createItem(ecomItemModel);
  	}

  	@POST
  	@Path("/deleteItem")
  	@Consumes(MediaType.APPLICATION_JSON)
  	public boolean deleteItem(EcomItemModel ecomItemModel) {

  		return itemService.deleteItem(ecomItemModel);
  	}

  	@POST
  	@Path("/updateItem")
  	@Consumes(MediaType.APPLICATION_JSON)
  	public boolean updateItem(EcomItemModel ecomItemModel) {

  		return itemService.updateItem(ecomItemModel);
  	}
  */
}
