package com.example.library;

import com.example.book.Book;

import java.util.Set;
import java.util.SortedSet;

public class Library {
    SortedSet <Book> library ;

    public Library(){
    }

    public Library(SortedSet<Book> library) {
        this.library = library;
    }

    public void addNewBook(Book book){
        library.add(book);
    }
    public void removeBook(Book book){
        library.remove(book);
    }
    public SortedSet getBooks(Library library){
        SortedSet<Book> sortedSet = null;
        for(Book book:library.library){
            if(book.getAuthor().equals(book.getAuthor())){
                sortedSet.add(book);
            }
        }
        return sortedSet;
    }
    public void inf(Library library){
        for (Book book: library.library){
            System.out.println(book.getTittle());
        }
    }




}
