package com.WebServicesProject.WebServicesExercise.rest.api.types;

import java.util.ArrayList;
import java.util.List;

public enum ProductDAO {
	instance;
	
	private List<Product> products = new ArrayList<Product>();
	
	private ProductDAO() {

		Product product = new Product();
	    product.setProductName("Product1");
	    product.setProductDescription("This is describing first product.");
	    product.setProductAlbum("Album1");
	    products.add(product);
	    
	    product = new Product();
	    product.setProductName("Product2");
	    product.setProductDescription("This is describing second product.");
	    product.setProductAlbum("Album2");
	    products.add(product);

    }
    public List<Product> getModel(){
        return products;
    }
}