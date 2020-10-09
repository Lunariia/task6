package com.epam.hometask.six.data.specification;

import com.epam.hometask.six.model.Book;

import java.util.ArrayList;
import java.util.List;

public class YearSpecification extends AbstractSpecifications<Integer>  {


    @Override
    boolean matches(Book book, Integer value) {

        Integer bookYear = (Integer)book.getYear();
        return  bookYear.equals(value);
    }
}
