package com.epam.hometask.six.dao;

import com.epam.hometask.six.data.BookFieldsType;
import com.epam.hometask.six.data.DaoBookImpl;
import com.epam.hometask.six.data.exception.DaoException;
import com.epam.hometask.six.data.factory.ComparatorFactory;
import com.epam.hometask.six.data.factory.SpecificationFactory;
import com.epam.hometask.six.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaoBookTest {

    private static final String AUTH = "Andreychyk";
    DaoBookImpl daoBook = new DaoBookImpl(new SpecificationFactory(),new ComparatorFactory());
    List<Book> listBooks = new ArrayList<Book>();
    private  static final Book BOOK = new Book("BookFive", "Moscow" ,2020 ,230 , Arrays.asList(new String[]{"Mehanicov", "Andreychyk"}));

    @Test
    public void findBookByTagShouldReturnResultOfSearch() throws DaoException {

        //given
        daoBook.addBook(BOOK);
        List<Book> checker = new ArrayList<Book>();
        checker.add(BOOK);

        //when
        List<Book> searcher = daoBook.findBookByTag(BookFieldsType.AUTHORS, AUTH);
        //then
        Assert.assertEquals(checker,searcher);
    }

    @Test
    public void removeBookShouldDeleteRecord() throws DaoException {

        //given
        int resultSize = daoBook.getBooks().size();

        listBooks.add(BOOK);
        daoBook.addBook(listBooks);

        //when
        daoBook.removeBook(BOOK);
        //then
        Assert.assertEquals(resultSize,daoBook.getBooks().size());

    }

}
