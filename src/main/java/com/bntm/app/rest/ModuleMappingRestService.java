package com.bntm.app.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/prodCategory")
@Produces(MediaType.APPLICATION_JSON)
public class ModuleMappingRestService {
  /*

  	@Autowired
  	ProductService productService;

  	@Autowired
  	BillingService catalogService;

  	@Autowired
  	ModuleMappingService attService;

  	@RequestMapping(value ="/getAllRootCategories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
  	public List<EcomCatalogModel> getAllRootCategories() {
  		return catalogService.getAllRootCategories();
  	}

  	@RequestMapping(value ="/getAttributes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
  	public List<CatalogPropertyKeyModel> getAllAttributes() {
  		return attService.getAllPropertyKeys();
  	}
  	@RequestMapping(value ="/getAllSubCategories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
  	public List<EcomCatalogModel> getAllSubCategories(String categoryId) {
  		return catalogService.getAllSubCategories(categoryId);
  	}

  	@RequestMapping(value ="/getProductsByCategory", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
  	public List<EcomCatalogModel> getProductsByCategory(String categoryId) {
  		return productService.getProductsByCategory(categoryId);
  	}

  	@RequestMapping(value ="/getCategoryById", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
  	public EcomCatalogModel getCategoryById(@MatrixParam("categoryId") String categoryId) {
  		return catalogService.getCategoryById(Long.valueOf(categoryId));
  	}

  	@RequestMapping(value ="/createProduct", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public String createProduct(@RequestBody EcomProductModel ecomProductModel) {

  		return productService.createProduct(ecomProductModel);
  	}
  	@RequestMapping(value ="/createCategory", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public String createCategory(@RequestBody EcomCatalogModel ecomCatalogModel) {

  		return catalogService.createCategory(ecomCatalogModel);
  	}

  	@RequestMapping(value ="/updateProduct", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean updateProduct(@RequestBody EcomProductModel ecomProductModel) {

  		return productService.updateProduct(ecomProductModel);
  	}

  	@RequestMapping(value ="/uppdateCategory", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean uppdateCategory(@RequestBody EcomCatalogModel ecomCatalogModel) {

  		return catalogService.updateCategory(ecomCatalogModel);
  	}


  	@RequestMapping(value ="/deleteProduct", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean deleteProduct(@RequestBody EcomProductModel ecomProductModel) {

  		return productService.deleteProduct(ecomProductModel);
  	}

  	@RequestMapping(value ="/deleteCategory", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean deleteCategory(@RequestBody EcomCatalogModel ecomCatalogModel) {

  		return catalogService.deleteCategory(ecomCatalogModel);
  	}


  	@RequestMapping(value ="/createCatalogPropertyKey", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public String createCatalogPropertyKey(@RequestBody CatalogPropertyKeyModel catalogPropertyKeyModel) {

  		return catalogService.createCatalogPropertyKey(catalogPropertyKeyModel);
  	}

  	@RequestMapping(value ="/updateCatalogPropertyKey", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean updateCatalogPropertyKey(@RequestBody CatalogPropertyKeyModel catalogPropertyKeyModel) {

  		return catalogService.updateCatalogPropertyKey(catalogPropertyKeyModel);
  	}


  	@RequestMapping(value ="/deleteCatalogPropertyKey", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean deleteCatalogPropertyKey(@RequestBody CatalogPropertyKeyModel catalogPropertyKeyModel) {

  		return catalogService.deleteCatalogPropertyKey(catalogPropertyKeyModel);
  	}

  	@RequestMapping(value ="/createCatalogPropertyValue", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public String createCatalogPropertyValue(@RequestBody CatalogPropertyValueModel catalogPropertyValueModel) {

  		return catalogService.createCatalogPropertyValue(catalogPropertyValueModel);
  	}

  	@RequestMapping(value ="/updateCatalogPropertyValue", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean updateCatalogPropertyValue(@RequestBody CatalogPropertyValueModel catalogPropertyValueModel) {

  		return catalogService.updateCatalogPropertyValue(catalogPropertyValueModel);
  	}


  	@RequestMapping(value ="/deleteCatalogPropertyValue", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean deleteCatalogPropertyValue(@RequestBody CatalogPropertyValueModel catalogPropertyValueModel) {

  		return catalogService.deleteCatalogPropertyValue(catalogPropertyValueModel);
  	}

  	@RequestMapping(value ="/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
  	public String testCreate(){
  		return catalogService.testCreate();
  	}

  	@RequestMapping(value ="/updateCategoryRates", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
  	public boolean updateProduct(@RequestBody CategoryRates categoryRates) {

  		return catalogService.updateCategoryRates(categoryRates);
  	}

  */
}
