package com.epam.hometask.six.data.factory;

import com.epam.hometask.six.data.BookFieldsType;
import com.epam.hometask.six.data.specification.*;

public class SpecificationFactory {

    public Specification create(BookFieldsType type){

        switch (type){

            case TITLE:
                return new TitleSpecification();
            case PUBLISHER:
                return new PublisherSpecification();
            case AUTHORS:
                return new AuthorSpecification();
            case PAGES:
                return new PagesSpecification();
            case YEAR:
                return new YearSpecification();
            default:
                throw new IllegalArgumentException("No right Book's field" + type);

        }
    }
}
