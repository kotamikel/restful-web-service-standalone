
package com.WebServicesProject.WebServicesExercise.rest.api.types;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Product
 * <p>
 * An instance of the product resource.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product-name",
    "product-description",
    "product-album"
})
public class Product {

    /**
     * The unique name for a product.
     * 
     */
    @JsonProperty("product-name")
    @JsonPropertyDescription("The unique name for a product.")
    private String productName;
    /**
     * Description for a product.
     * 
     */
    @JsonProperty("product-description")
    @JsonPropertyDescription("Description for a product.")
    private String productDescription;
    /**
     * Album associated to the product.
     * 
     */
    @JsonProperty("product-album")
    @JsonPropertyDescription("Album associated to the product.")
    private String productAlbum;

    /**
     * The unique name for a product.
     * 
     */
    @JsonProperty("product-name")
    public String getProductName() {
        return productName;
    }

    /**
     * The unique name for a product.
     * 
     */
    @JsonProperty("product-name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Description for a product.
     * 
     */
    @JsonProperty("product-description")
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Description for a product.
     * 
     */
    @JsonProperty("product-description")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * Album associated to the product.
     * 
     */
    @JsonProperty("product-album")
    public String getProductAlbum() {
        return productAlbum;
    }

    /**
     * Album associated to the product.
     * 
     */
    @JsonProperty("product-album")
    public void setProductAlbum(String productAlbum) {
        this.productAlbum = productAlbum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Product.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("productName");
        sb.append('=');
        sb.append(((this.productName == null)?"<null>":this.productName));
        sb.append(',');
        sb.append("productDescription");
        sb.append('=');
        sb.append(((this.productDescription == null)?"<null>":this.productDescription));
        sb.append(',');
        sb.append("productAlbum");
        sb.append('=');
        sb.append(((this.productAlbum == null)?"<null>":this.productAlbum));
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
        result = ((result* 31)+((this.productName == null)? 0 :this.productName.hashCode()));
        result = ((result* 31)+((this.productDescription == null)? 0 :this.productDescription.hashCode()));
        result = ((result* 31)+((this.productAlbum == null)? 0 :this.productAlbum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return ((((this.productName == rhs.productName)||((this.productName!= null)&&this.productName.equals(rhs.productName)))&&((this.productDescription == rhs.productDescription)||((this.productDescription!= null)&&this.productDescription.equals(rhs.productDescription))))&&((this.productAlbum == rhs.productAlbum)||((this.productAlbum!= null)&&this.productAlbum.equals(rhs.productAlbum))));
    }

}
