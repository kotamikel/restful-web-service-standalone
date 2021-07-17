
package com.WebServicesProject.WebServicesExercise.rest.api.types;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Image
 * <p>
 * An instance of the image resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "image-title",
    "image-description",
    "image-albums"
})
public class Image {

    /**
     * The unique title for a image.
     * 
     */
    @JsonProperty("image-title")
    @JsonPropertyDescription("The unique title for a image.")
    private String imageTitle;
    /**
     * Description for a image.
     * 
     */
    @JsonProperty("image-description")
    @JsonPropertyDescription("Description for a image.")
    private String imageDescription;
    /**
     * Albums corresponding to respective Image.
     * <p>
     * Albums associated to the image.
     * 
     */
    @JsonProperty("image-albums")
    @JsonPropertyDescription("Albums associated to the image.")
    private List<Object> imageAlbums = new ArrayList<Object>();

    /**
     * The unique title for a image.
     * 
     */
    @JsonProperty("image-title")
    public String getImageTitle() {
        return imageTitle;
    }

    /**
     * The unique title for a image.
     * 
     */
    @JsonProperty("image-title")
    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

    /**
     * Description for a image.
     * 
     */
    @JsonProperty("image-description")
    public String getImageDescription() {
        return imageDescription;
    }

    /**
     * Description for a image.
     * 
     */
    @JsonProperty("image-description")
    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    /**
     * Albums corresponding to respective Image.
     * <p>
     * Albums associated to the image.
     * 
     */
    @JsonProperty("image-albums")
    public List<Object> getImageAlbums() {
        return imageAlbums;
    }

    /**
     * Albums corresponding to respective Image.
     * <p>
     * Albums associated to the image.
     * 
     */
    @JsonProperty("image-albums")
    public void setImageAlbums(List<Object> imageAlbums) {
        this.imageAlbums = imageAlbums;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("imageTitle");
        sb.append('=');
        sb.append(((this.imageTitle == null)?"<null>":this.imageTitle));
        sb.append(',');
        sb.append("imageDescription");
        sb.append('=');
        sb.append(((this.imageDescription == null)?"<null>":this.imageDescription));
        sb.append(',');
        sb.append("imageAlbums");
        sb.append('=');
        sb.append(((this.imageAlbums == null)?"<null>":this.imageAlbums));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.imageTitle == null)? 0 :this.imageTitle.hashCode()));
        result = ((result* 31)+((this.imageAlbums == null)? 0 :this.imageAlbums.hashCode()));
        result = ((result* 31)+((this.imageDescription == null)? 0 :this.imageDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return ((((this.imageTitle == rhs.imageTitle)||((this.imageTitle!= null)&&this.imageTitle.equals(rhs.imageTitle)))&&((this.imageAlbums == rhs.imageAlbums)||((this.imageAlbums!= null)&&this.imageAlbums.equals(rhs.imageAlbums))))&&((this.imageDescription == rhs.imageDescription)||((this.imageDescription!= null)&&this.imageDescription.equals(rhs.imageDescription))));
    }

}
