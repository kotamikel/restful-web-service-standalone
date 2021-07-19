package com.WebServicesProject.WebServicesExercise.rest.api.types;

import java.util.ArrayList;
import java.util.List;

public enum AlbumDAO {
	instance;
	
	private List<Album> albums = new ArrayList<Album>();
	
	private AlbumDAO() {

		// Issue - jsonschema2pojo doesn't create List<TypeObjectYouCreated> and it generates 
		// it to be a List<Object> which I am having trouble to construct a 
		/*
		 * List<Image> images = new ArrayList<Image>(); Image image = new Image();
		 * image.setImageTitle("Image1");
		 * image.setImageDescription("Image 1 Description");
		 * image.setImageAlbums(albums); images.add(image);
		 */
		
		Album album = new Album();
	    album.setAlbumName("Album1");
	    album.setAlbumDescription("This is describing first album.");
	    //album.setAlbumImages();
	    albums.add(album);
	    
	    //List<Object> images2 = new ArrayList<Object>();
	    //images2.Add(image);
	    
	    album = new Album();
	    album.setAlbumName("Album2");
	    album.setAlbumDescription("This is describing second album.");
	    //album.setAlbumImages();
	    albums.add(album);

    }
	
	public void post(Album album) {
		albums.add(album);
	}
	
    public List<Album> getModel(){
        return albums;
    }
}