package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BoookControllerTest {

    @Test
    public void shouldFetchBooks() {


        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        List<BookDto> result = bookController.getBooks();

        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBooks() {

        BookService bookService = new BookService();
        BookController bookController = new BookController(bookService);
        bookController.addBook(new BookDto());


        List<BookDto> result = bookController.getBooks();

        List<BookDto> expected = new ArrayList<>();
        expected.add(new BookDto());



        assertEquals(expected, result);





    }
}