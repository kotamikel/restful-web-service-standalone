
package com.WebServicesProject.WebServicesExercise.rest.api.types;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Album
 * <p>
 * An instance of the album resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "album-name",
    "album-description",
    "album-images"
})
public class Album {

    /**
     * The unique name for a album.
     * 
     */
    @JsonProperty("album-name")
    @JsonPropertyDescription("The unique name for a album.")
    private String albumName;
    /**
     * Description for a album.
     * 
     */
    @JsonProperty("album-description")
    @JsonPropertyDescription("Description for a album.")
    private String albumDescription;
    /**
     * Images corresponding to respective Album.
     * <p>
     * Images associated to the album.
     * 
     */
    @JsonProperty("album-images")
    @JsonPropertyDescription("Images associated to the album.")
    private List<Object> albumImages = new ArrayList<Object>();

    /**
     * The unique name for a album.
     * 
     */
    @JsonProperty("album-name")
    public String getAlbumName() {
        return albumName;
    }

    /**
     * The unique name for a album.
     * 
     */
    @JsonProperty("album-name")
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     * Description for a album.
     * 
     */
    @JsonProperty("album-description")
    public String getAlbumDescription() {
        return albumDescription;
    }

    /**
     * Description for a album.
     * 
     */
    @JsonProperty("album-description")
    public void setAlbumDescription(String albumDescription) {
        this.albumDescription = albumDescription;
    }

    /**
     * Images corresponding to respective Album.
     * <p>
     * Images associated to the album.
     * 
     */
    @JsonProperty("album-images")
    public List<Object> getAlbumImages() {
        return albumImages;
    }

    /**
     * Images corresponding to respective Album.
     * <p>
     * Images associated to the album.
     * 
     */
    @JsonProperty("album-images")
    public void setAlbumImages(List<Object> albumImages) {
        this.albumImages = albumImages;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Album.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("albumName");
        sb.append('=');
        sb.append(((this.albumName == null)?"<null>":this.albumName));
        sb.append(',');
        sb.append("albumDescription");
        sb.append('=');
        sb.append(((this.albumDescription == null)?"<null>":this.albumDescription));
        sb.append(',');
        sb.append("albumImages");
        sb.append('=');
        sb.append(((this.albumImages == null)?"<null>":this.albumImages));
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
        result = ((result* 31)+((this.albumName == null)? 0 :this.albumName.hashCode()));
        result = ((result* 31)+((this.albumImages == null)? 0 :this.albumImages.hashCode()));
        result = ((result* 31)+((this.albumDescription == null)? 0 :this.albumDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Album) == false) {
            return false;
        }
        Album rhs = ((Album) other);
        return ((((this.albumName == rhs.albumName)||((this.albumName!= null)&&this.albumName.equals(rhs.albumName)))&&((this.albumImages == rhs.albumImages)||((this.albumImages!= null)&&this.albumImages.equals(rhs.albumImages))))&&((this.albumDescription == rhs.albumDescription)||((this.albumDescription!= null)&&this.albumDescription.equals(rhs.albumDescription))));
    }

}
