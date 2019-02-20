package com.example.demo.model;

public class Book {
	private long id;
    
    private String name;
     
    private String authors;
     
    private double price;
 
    public Book(){
        id=0;
    }
     
    public Book(long id, String name, String authors, double price){
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
     
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAuthors() {
        return authors;
    }
 
    public void setAuthors(String authors) {
        this.authors = authors;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id != other.id)
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", authors=" + authors
                + ", price=" + price + "]";
    }

}
