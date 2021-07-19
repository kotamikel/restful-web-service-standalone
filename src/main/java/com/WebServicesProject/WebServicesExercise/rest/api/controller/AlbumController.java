package com.WebServicesProject.WebServicesExercise.rest.api.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;

import com.WebServicesProject.WebServicesExercise.rest.api.types.Album;
import com.WebServicesProject.WebServicesExercise.rest.api.types.AlbumDAO;

@Component
@Path("/album")
@Produces("application/json")
public class AlbumController {

	@GET
	public List<Album> getAlbums() {
		return AlbumDAO.instance.getModel();
	}
	
	// 
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Album createAlbum(Album album){
		
		AlbumDAO.instance.post(album);
		
		return album;
	}
}
