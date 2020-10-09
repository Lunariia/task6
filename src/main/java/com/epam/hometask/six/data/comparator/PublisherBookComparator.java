package com.epam.hometask.six.data.comparator;

import com.epam.hometask.six.model.Book;

import java.util.Comparator;

public class PublisherBookComparator implements Comparator<Book> {


    @Override
    public int compare(Book firstBook, Book secondBook) {

        String firstPublisher = firstBook.getPublisher();
        String secondPublisher = secondBook.getPublisher();

        if (firstPublisher == null) {
            return -1;
        } else {

            if (secondPublisher == null) {
                return 1;
            } else {
                if (firstPublisher == null && secondPublisher == null) {
                    return 0;
                } else {
                    return firstPublisher.compareToIgnoreCase(secondPublisher);
                }
            }
        }
    }
}
