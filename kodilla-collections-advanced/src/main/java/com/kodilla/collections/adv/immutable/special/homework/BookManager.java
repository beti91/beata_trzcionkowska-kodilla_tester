package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;


public class BookManager {
    private static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {

        for (int n = 0; n < books.size(); n++) {
            Book book = books.get(n);
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return book;
            }
        }
        Book newBook = new Book(title, author);
        books.add(newBook);
        return newBook;
    }
    public static int size() {
        return books.size();
    }
}
