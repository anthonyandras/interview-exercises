package com.aandras.interview.library.controller;

import com.aandras.interview.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    @GetMapping("/health")
    public String healthCheck() {
        return "works";
    }

    @Autowired
    private List<Book> inventory;

    @GetMapping("/book")
    public List<Book> getBooks() { }

    @GetMapping("/book/{isbn}")
    public Book getBookByIsbn(final String isbn) { }


}
