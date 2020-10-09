package com.epam.hometask.six.data.specification;

import com.epam.hometask.six.model.Book;

import java.util.List;

public interface Specification<T> {

     List<Book> find(List<Book> books, T value);

}
