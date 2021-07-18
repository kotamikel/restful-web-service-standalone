package com.WebServicesProject.WebServicesExercise.rest.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.WebServicesProject.WebServicesExercise.rest.api.types.Album;

@Component
@Path("/album")
@Produces("application/json")
public class AlbumController {

	@GET
	@Path("/{album-name}")
	public Response getAlbumName(@PathParam("album-name") String albumName) {
		return null;
	}
	
	@POST
	public Album createAlbum(Album album) {
		return null;
	}
}
