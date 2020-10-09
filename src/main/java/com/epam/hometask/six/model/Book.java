package com.epam.hometask.six.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private final String title;
    private final String publisher;
    private final List<String> authors;
    private final int year;
    private final int pages;

    public Book(String title, String publisher, int year, int pages, List<String> authors) {
        this.title = title;
        this.publisher = publisher;
        this.authors = authors;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public List<String> getAuthors() {
        List<String> authorClone = new ArrayList<String>();
        authorClone.addAll(authors);

        return authorClone;
    }

    public String getAuthors(int index) {
        return authors.get(index);
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Book book = (Book) o;
        return year == book.year &&
                pages == book.pages &&
                Objects.equals(title, book.title) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisher, authors, year, pages);
    }
}
