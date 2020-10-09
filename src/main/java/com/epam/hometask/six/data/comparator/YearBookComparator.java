package com.epam.hometask.six.data.comparator;

import com.epam.hometask.six.model.Book;

import java.util.Comparator;

public class YearBookComparator  implements Comparator<Book> {


    @Override
    public int compare(Book firstBook, Book secondBook) {

        Integer firstYear = (Integer)firstBook.getYear();
        Integer secondYear = (Integer)secondBook.getYear();

        if (firstYear == null) {
            return -1;
        } else {

            if (secondYear == null) {
                return 1;
            }
            else {
                if (firstYear == null && secondYear == null) {
                    return 0;
                } else {
                    return firstYear.compareTo(secondYear);
                }
            }
        }
    }
}
