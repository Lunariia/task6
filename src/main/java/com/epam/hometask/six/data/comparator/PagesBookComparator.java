package com.epam.hometask.six.data.comparator;

import com.epam.hometask.six.model.Book;

import java.util.Comparator;

public class PagesBookComparator implements Comparator<Book> {


    @Override
    public int compare(Book firstBook, Book secondBook) {

        Integer firstPages = (Integer) firstBook.getPages();
        Integer secondPages = (Integer) secondBook.getPages();

        if (firstPages == null) {
            return -1;
        } else {

            if (secondPages == null) {
                return 1;
            }
            else {
                if (firstPages == null && secondPages == null) {
                    return 0;
                } else {
                    return firstPages.compareTo(secondPages);
                }
            }
        }

    }
}
