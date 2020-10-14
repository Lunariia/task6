package com.epam.hometask.six.data;

import com.epam.hometask.six.data.exception.DaoException;
import com.epam.hometask.six.model.Book;

import java.util.List;

public interface BookDao {

     void sortByTag(BookFieldsType type);

     <T> List<Book> findBookByTag(BookFieldsType type, T value);

     void removeBook(Book book) throws DaoException;

     void addBook(List<Book> books) throws DaoException;

     void addBook(Book book) throws DaoException;

}
