package com.WebServicesProject.WebServicesExercise.rest.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.WebServicesProject.WebServicesExercise.rest.api.types.Image;

@Component
@Path("/image")
@Produces("application/json")
public class ImageController {

	@GET
	@Path("/{image-title}")
	public Response getImageTitle(@PathParam("image-title") String imageTitle) {
		return null;
	}
	
	@POST
	public Image createImage(Image image) {
		return null;
	}
}
