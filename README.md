### Java RESTFul Web Service API

Built using:
- Spring Boot
- Jersey Framework

## Build and Run the application
Follow the steps:

1. From terminal - Navigate to the root directory where the pom.xml exists
1. Compile and Package the project - `mvn clean install`
1. Navigate to target directory - `cd target`
1. Execute the JAR - `java -jar WebServicesExercise-0.0.1-SNAPSHOT.jar`
1. Access the application via - `http://localhost:8080/productclient`

## Endpoints 
`http://localhost:8080/productclient/product`
`http://localhost:8080/productclient/product/add`
`http://localhost:8080/productclient/album`
`http://localhost:8080/productclient/album/add`
`http://localhost:8080/productclient/image`
`http://localhost:8080/productclient/image/add`

## Testing
- All my testing was done via Postman.
  - I was able to successfully reach `/product`, `/product/add`, `/album`, `/album/add`, `/image`, `/image/add`
  - I added a product (/product/add) and requested for the products after to see if it was appended to the List - PASS
- Test classes not included due to having issues with JerseyTest and not being able to process Response/Entity Objects properly.
  - I removed the test classes to avoid errors.

## Additional Notes
- Test classes missing - errors with JerseyTest Implementation 
- AlbumDAO seed data missing Images - setAlbumImages expects a List<Objects> and I could not find a way to store an Album Object as a List<Object>. I cant change the POJO because i generated it using jsonschema2pojo library plugin. When i modified the album.schema.json file - regardless of the type I was not able to active the type of object the compiler was requiring. 
- ImageDAO seed data missing Albums - same applies for setImageAlbums
