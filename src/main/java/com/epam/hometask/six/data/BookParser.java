package com.epam.hometask.six.data;

import com.epam.hometask.six.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookParser {

    private final static String LINE_END = "\\s+";

    public Book createBook(String str){

        String[] fields = str.split(LINE_END);

        String title = fields[0];
        String publisher = fields[1];
        int year = Integer.parseInt(fields[2]);
        int pages = Integer.parseInt(fields[3]);
        List<String> authors = new ArrayList<String>();

        for (int i = 4; i < fields.length;i++){
            authors.add(fields[i]);
        }

        return new Book(title,publisher,year,pages,authors);
    }

}
