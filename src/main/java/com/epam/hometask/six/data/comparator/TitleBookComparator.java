package com.epam.hometask.six.data.comparator;

import com.epam.hometask.six.model.Book;

import java.util.Comparator;

public class TitleBookComparator implements Comparator<Book> {


    @Override
    public int compare(Book firstBook, Book secondBook) {

        String firstTitle = firstBook.getTitle();
        String secondTitle = secondBook.getTitle();

        if (firstTitle == null) {
            return -1;
        } else {
            if (secondTitle == null) {
                return 1;
            } else {
                if (firstTitle == null && secondTitle == null) {
                    return 0;
                } else {
                    return firstTitle.compareToIgnoreCase(secondTitle);
                }
            }
        }
    }
}
