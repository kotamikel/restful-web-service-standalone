package com.WebServicesProject.WebServicesExercise.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.WebServicesProject.WebServicesExercise.rest.api.controller.AlbumController;
import com.WebServicesProject.WebServicesExercise.rest.api.controller.ImageController;
import com.WebServicesProject.WebServicesExercise.rest.api.controller.ProductController;



@Component
@ApplicationPath("/productclient")
public class JerseyConfig extends ResourceConfig {

  @PostConstruct
  public void init() {
	  register(ProductController.class);
	  register(AlbumController.class);
	  register(ImageController.class);
  }
}