package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {


        BookManager.createBook("Twilight", "Stephane Meyer");
        System.out.println(BookManager.size());
        BookManager.createBook("Paper towns", "John Green");
        System.out.println(BookManager.size());
        BookManager.createBook("Harry Potter","J.K. Rowling");
        System.out.println(BookManager.size());
        BookManager.createBook("Harry Potter","J.K. Rowling");
        System.out.println(BookManager.size());
    }
}
