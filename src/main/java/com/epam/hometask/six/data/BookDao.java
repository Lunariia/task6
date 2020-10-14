package com.epam.hometask.six.data;

import com.epam.hometask.six.data.exception.DaoException;
import com.epam.hometask.six.model.Book;

import java.util.List;

public interface Dao {

    public void sortByTag(BookFieldsType type);

    public <T> List<Book> findBookByTag(BookFieldsType type, T name);

    public void removeBook(Book book) throws DaoException;

    public void addBook(List<Book> books) throws DaoException;

    public void addBook(Book book) throws DaoException;

}
