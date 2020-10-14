package com.epam.hometask.six.data;

import com.epam.hometask.six.data.parser.BookParserImpl;
import com.epam.hometask.six.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCreator {

    private final static String DATA_END = "\n";
    private final BookParserImpl parser;

    public BookCreator(BookParserImpl parser) {
        this.parser = new BookParserImpl();
    }

    public List<Book> createBookList(List<String> data) {

        List<Book> books = new ArrayList<>();

        for (String line : data) {

            String[] lines = line.split(DATA_END);

            for (int i = 0; i < lines.length; i++) {
                Book book = parser.createBook(lines[i]);
                books.add(book);
            }

        }
        return books;
    }
}
