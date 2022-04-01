package com.lib.controller;


import com.lib.entity.Author;
import com.lib.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Component
@RestController
public class Controller {
    @Autowired
    Book book;

    @GetMapping("/home")
    public String details(){
        return "hello welcome to the book website";
    }

    @GetMapping("/getAuthor")
    public Set<Author> getAuthor(){
        return book.getAuthors();
    }
}
