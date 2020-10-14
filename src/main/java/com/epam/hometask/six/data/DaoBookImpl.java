package com.epam.hometask.six.data;

import com.epam.hometask.six.data.exception.DaoException;
import com.epam.hometask.six.data.factory.ComparatorFactory;
import com.epam.hometask.six.data.factory.SpecificationFactory;
import com.epam.hometask.six.data.specification.Specification;
import com.epam.hometask.six.model.Book;

import java.util.*;

public class DaoBookImpl implements BookDao {

    private List<Book> books = new ArrayList<>();

    private SpecificationFactory factory;
    private ComparatorFactory comparatorFactory;

    public DaoBookImpl(SpecificationFactory factory,ComparatorFactory comparatorFactory) {
        this.factory = new SpecificationFactory();
        this.comparatorFactory = new ComparatorFactory();
    }

    public void addBook(Book book) throws DaoException {
        if (books.contains(book)) {
            throw new DaoException("List contain books!");
        }

        books.add(book);
    }

    public void addBook(List<Book> books) throws DaoException {
        for (Book book : books) {
            addBook(book);
        }
    }

    public void removeBook(Book book) throws DaoException {
        if (!books.contains(book)) {
            throw new DaoException("List no contain books!");
        }
        books.remove(book);
    }

    public <T> List<Book> findBookByTag(BookFieldsType type, T value) {
        Specification specification = factory.create(type);

        return specification.find(books, value);
    }

    public void sortByTag(BookFieldsType type) {
        Comparator comparator = comparatorFactory.create(type);
        Collections.sort(books, comparator);

    }

    public List<Book> getBooks() {
        List<Book> booksClone = new ArrayList<>();
        booksClone.addAll(books);

        return booksClone;
    }

}
