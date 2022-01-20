package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;


public class BookManager {

    public static Book createBook(String title, String author) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Twilight", "Stephane Meyer"));
        books.add(new Book("Paper towns", "John Green"));
        books.add(new Book("Harry Potter", "J.K. Rowling"));

        Book newBook = new Book(title, author);
        for (int n = 0; n < books.size(); n++) {
            Book book = books.get(n);
            if (newBook != books.get(n)) {
                books.add(newBook);

            }
        }
        return new Book(title, author);
    }
}
