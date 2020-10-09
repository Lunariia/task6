package com.epam.hometask.six.dao;

import com.epam.hometask.six.data.BookFieldsType;
import com.epam.hometask.six.data.DaoBook;
import com.epam.hometask.six.data.exception.DaoException;
import com.epam.hometask.six.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaoBookTest {

    private static final String AUTH = "Andreychyk";
    DaoBook daoBook = new DaoBook();
    List<Book> listBooks = new ArrayList<Book>();

    @Test
    public void findBookByTagShouldReturnResultOfSearch() throws DaoException {

        //given
        daoBook.addBook(new Book("BookFive", "Moscow" ,2020 ,230 , Arrays.asList(new String[]{"Mehanicov", "Andreychyk"})));
        List<Book> checker = new ArrayList<Book>();
        checker.add(new Book("BookFive", "Moscow" ,2020 ,230 , Arrays.asList(new String[]{"Mehanicov", "Andreychyk"})));

        //when
        List<Book> searcher = daoBook.findBookByTag(BookFieldsType.AUTHORS, AUTH);
        //then
        Assert.assertEquals(checker,searcher);
    }

    @Test
    public void removeBookShouldDeleteRecord() throws DaoException {

        //given
        int resultSize = daoBook.getBooks().size();
        Book book = new Book("BookFive", "Moscow" ,2020 ,230 , Arrays.asList(new String[]{"Mehanicov", "Andreychyk"}));

        listBooks.add(new Book("BookFive", "Moscow" ,2020 ,230 , Arrays.asList(new String[]{"Mehanicov", "Andreychyk"})));
        daoBook.addBook(listBooks);

        //when
        daoBook.removeBook(book);
        //then
        Assert.assertEquals(resultSize,daoBook.getBooks().size());

    }

}
