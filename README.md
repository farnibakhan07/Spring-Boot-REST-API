# Spring-Boot-REST-API
The main functionalities of the REST API:

GET request to /RestAPI/book/ returns a list of books
GET request to /RestAPI/book/1 returns the book with ID 1
POST request to /RestAPI/book/ with a book object as JSON creates a new book
PUT request to /RestAPI/book/3 with a book object as JSON updates the book with ID 3
DELETE request to /RestAPI/book/4 deletes the book with ID 4
DELETE request to /RestAPI/book/ deletes all the books

Run Instructions:
To test this API, an external client POSTMAN can be used.

1. Run the RESTAPIApp.java file from an IDE
2. Then send requests from POSTMAN as stated in the functionalities.
e.g. http://localhost:8080/RestAPI/book/

Without an IDE, run the following commands
> java -jar path-to-jar
> on Project root , mvn spring-boot:run
