package com.epam.hometask.six.data.specification;

import com.epam.hometask.six.model.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorSpecification implements Specification<String> {

    @Override
    public List<Book> find(List<Book> books, String value) {

        List<Book> searchedBooks = new ArrayList<Book>();

        for (Book book: books) {

            List<String> authorBook = book.getAuthors();

            for (String author: authorBook) {

                if (author.equalsIgnoreCase(value)){
                    searchedBooks.add(book);
                }

            }

        }
        return searchedBooks;
    }
}
