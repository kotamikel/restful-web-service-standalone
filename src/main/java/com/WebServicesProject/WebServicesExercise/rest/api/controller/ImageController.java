package com.WebServicesProject.WebServicesExercise.rest.api.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;

import com.WebServicesProject.WebServicesExercise.rest.api.types.Image;
import com.WebServicesProject.WebServicesExercise.rest.api.types.ImageDAO;

@Component
@Path("/image")
@Produces("application/json")
public class ImageController {

	@GET
	public List<Image> getImages() {
		return ImageDAO.instance.getModel();
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Image createImage(Image image){
		
		ImageDAO.instance.post(image);
		
		return image;
	}
}
