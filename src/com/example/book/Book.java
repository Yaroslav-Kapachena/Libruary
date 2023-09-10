package com.example.book;

public class Book {
    private String author;
    private String tittle;
    private int year;

    public Book(){
    }

    public Book(String author, String tittle, int year) {
        this.author = author;
        this.tittle = tittle;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
