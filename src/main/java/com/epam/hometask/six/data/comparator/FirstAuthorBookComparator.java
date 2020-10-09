package com.epam.hometask.six.data.comparator;

import com.epam.hometask.six.model.Book;

import java.util.Comparator;

public class FirstAuthorBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {

        String firstAuthor = firstBook.getAuthors(0);
        String secondAuthor = secondBook.getAuthors(0);

        if (firstAuthor == null) {
            return -1;
        } else {

            if (secondAuthor == null) {
                return 1;
            }
            else {
                if (firstAuthor == null && secondAuthor == null) {
                    return 0;
                } else {
                    return firstAuthor.compareToIgnoreCase(secondAuthor);
                }
            }
        }

    }
}
