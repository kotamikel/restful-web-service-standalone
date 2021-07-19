package com.WebServicesProject.WebServicesExercise.rest.api.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.stereotype.Component;

import com.WebServicesProject.WebServicesExercise.rest.api.types.Product;
import com.WebServicesProject.WebServicesExercise.rest.api.types.ProductDAO;

@Component
@Path("/product")
@Produces("application/json")
//@Api(value = "ProductController Resource", produces = "application/json")
public class ProductController {

	@GET
	public List<Product> getProducts() {
		//return ResourceTestGenerator.generateTestProducts();
		return ProductDAO.instance.getModel();
		
	}
	
	@POST
    @Consumes("application/json")
	public Product createProduct(Product product) {
        return null;
	}
}
