# Movies_API
 A REST API that retrieves information about movies from a local MySQL Database

- Technologies Used: Java, Spring Boot, Maven, MySQL
- Based on the following Tutorials:
    - https://spring.io/guides/gs/rest-service/
    - https://spring.io/guides/gs/accessing-data-mysql/
- Movie data is taken from IMDB: https://developer.imdb.com/non-commercial-datasets/

Run the project by running command:
    mvn spring-boot:run

Endpoints implemented:

    - To retrieve all movie data
    http://localhost:8080/movie/all
    
    - Retrieve movie data by primary key "tconst"
    http://localhost:8080/movie/{tconst}
    ex. http://localhost:8080/movie/tt0000011