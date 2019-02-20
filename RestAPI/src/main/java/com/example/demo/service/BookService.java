package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Book;

public interface BookService {
	Book findById(long id);
    
    Book findByName(String name);
     
    void saveBook(Book book);
     
    void updateBook(Book book);
     
    void deleteBookById(long id);
 
    List<Book> findAllBooks();
     
    void deleteAllBooks();
     
    boolean isBookExist(Book book);

}
