package com.WebServicesProject.WebServicesExercise.rest.api.types;

import java.util.ArrayList;
import java.util.List;

public enum ImageDAO {
	instance;
	
	private List<Image> images = new ArrayList<Image>();
	
	private ImageDAO() {

		Image image = new Image();
	    image.setImageTitle("Image1");
	    image.setImageDescription("This is describing first image.");
	    //image.setImageAlbum(List<Image>);
	    images.add(image);
	    
	    image = new Image();
	    image.setImageTitle("Image2");
	    image.setImageDescription("This is describing second image.");
	    //image.setImageAlbum(List<Image>);
	    images.add(image);

    }
	
	public void post(Image image) {
		images.add(image);
	}
	
    public List<Image> getModel(){
        return images;
    }
}