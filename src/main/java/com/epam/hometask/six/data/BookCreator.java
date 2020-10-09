package com.epam.hometask.six.data;

import com.epam.hometask.six.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {

    BookParser parser = new BookParser();

    public BookCreator() {}

    private final static String DATA_END = "\n";

    public List<Book> createBookList(String str){

        String[] lines = str.split(DATA_END);

        List<Book> books = new ArrayList<Book>();

        for (int i = 0; i < lines.length;i++){
            Book book = parser.createBook(lines[i]);
            books.add(book);
        }

        return books;
    }
}
