package com.WebServicesProject.WebServicesExercise.rest.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.WebServicesProject.WebServicesExercise.rest.api.types.Product;

@Component
@Path("/product")
@Produces("application/json")
//@Api(value = "ProductController Resource", produces = "application/json")
public class ProductController {

	@GET
	@Path("/{product-name}")
	public Response getProductName(@PathParam("product-name") String productName) {
		return null;
	}
	
	@POST
	public Product createProduct(Product product) {
		return null;
	}
}
