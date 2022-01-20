package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();
        bookManager.createBook("Twilight", "Stephane Meyer");
        BookManager bookManager1 = new BookManager();
        bookManager1.createBook("Paper towns", "John Green");
        BookManager bookManager2 = new BookManager();
        bookManager2.createBook("Harry Potter","J.K. Rowling");
        BookManager bookManager3 = new BookManager();
        bookManager3.createBook("Harry Potter","J.K. Rowling");


        System.out.println(bookManager == bookManager1);
        System.out.println(bookManager.equals(bookManager1));
        System.out.println(bookManager1 == bookManager2);
        System.out.println(bookManager1.equals(bookManager2));
        System.out.println(bookManager == bookManager2);
        System.out.println(bookManager.equals(bookManager2));
        System.out.println(bookManager2==bookManager3);
        System.out.println(bookManager2.equals(bookManager3));

    }
}
