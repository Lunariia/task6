package com.epam.hometask.six.data.specification;

import com.epam.hometask.six.model.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpecifications<T> implements Specification<T> {

    abstract boolean matches(Book book, T value);

    @Override
    public List<Book> find(List<Book> books, T value) {

        List<Book> searchedBooks = new ArrayList<Book>();

        for (Book book: books) {

           if (matches(book,value)){
               books.add(book);
           }

        }
        return searchedBooks;
    }
}
