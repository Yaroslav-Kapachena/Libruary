package com.example.Main;

import com.example.book.Book;
import com.example.library.Library;

import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Conan Doyle","Sherlock Holmes",1897);
        Book book2 = new Book("Paul Coel","1988",1997);

        Library library= new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);

        library.inf(library);
        library.getBooks(library);



    }
}
