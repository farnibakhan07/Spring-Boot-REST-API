package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
 
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	private static final AtomicLong counter = new AtomicLong();
    
    private static List<Book> books;
     
    static{
        books= populateDummyBooks();
    }
 
    public List<Book> findAllBooks() {
        return books;
    }
     
    public Book findById(long id) {
        for(Book book : books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }
     
    public Book findByName(String name) {
        for(Book book : books){
            if(book.getName().equalsIgnoreCase(name)){
                return book;
            }
        }
        return null;
    }
     
    public void saveBook(Book book) {
        book.setId(counter.incrementAndGet());
        books.add(book);
    }
 
    public void updateBook(Book book) {
        int index = books.indexOf(book);
        books.set(index, book);
    }
 
    public void deleteBookById(long id) {
         
        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext(); ) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove();
            }
        }
    }
 
    public boolean isBookExist(Book book) {
        return findByName(book.getName())!=null;
    }
     
    public void deleteAllBooks(){
        books.clear();
    }
 
    private static List<Book> populateDummyBooks(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(counter.incrementAndGet(),"Science Book","AuthorX", 65));
        books.add(new Book(counter.incrementAndGet(),"Math Book","AuthorY", 48));
        books.add(new Book(counter.incrementAndGet(),"History Book","AuthorK", 55));
        books.add(new Book(counter.incrementAndGet(),"Literature Book","AuthorM", 57));
        return books;
    }

}
