package com.lib.entity;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Publisher {


    private Integer id;
    private String publisherName;
    private Set<Book> publishedBooks;
    private Set<Author> publishedAuthors;

    public Publisher() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Set<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(Set<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    public Set<Author> getPublishedAuthors() {
        return publishedAuthors;
    }

    public void setPublishedAuthors(Set<Author> publishedAuthors) {
        this.publishedAuthors = publishedAuthors;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", publishedBooks=" + publishedBooks +
                ", publishedAuthors=" + publishedAuthors +
                '}';
    }
}
