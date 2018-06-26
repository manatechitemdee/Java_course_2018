package com.example.demo;

public class BookItem {
    private Book book;
    private int quantity;
   
    public BookItem(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        // TODO Auto-generated method stub
        return book;
    }

    public int size() {
        // TODO Auto-generated method stub
        return quantity;
    }

    public double getTotalPrice() {
        return book.getPrice() * quantity;
    
    }

   
}
