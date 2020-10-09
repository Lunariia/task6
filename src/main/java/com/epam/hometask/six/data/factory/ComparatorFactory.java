package com.epam.hometask.six.data.factory;

import com.epam.hometask.six.data.BookFieldsType;
import com.epam.hometask.six.data.comparator.*;
import com.epam.hometask.six.model.Book;

import java.util.Comparator;

public class ComparatorFactory {

    public Comparator<Book> create(BookFieldsType type) {

        switch (type) {

            case TITLE:
                return new TitleBookComparator();
            case YEAR:
                return new YearBookComparator();
            case PAGES:
                return new PagesBookComparator();
            case AUTHORS:
                return new FirstAuthorBookComparator();
            case PUBLISHER:
                return new PublisherBookComparator();
            default:
                throw new IllegalArgumentException("Incorrect Book's type" + type);

        }
    }
}
