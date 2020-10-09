package com.epam.hometask.six.data.specification;

import com.epam.hometask.six.model.Book;

import java.util.ArrayList;
import java.util.List;

public class PublisherSpecification extends AbstractSpecifications<String> {


    @Override
    boolean matches(Book book, String value) {

        String publisherBook = book.getPublisher();
        return  publisherBook.equalsIgnoreCase(value);
    }
}
