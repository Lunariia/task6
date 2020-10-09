package com.epam.hometask.six.book;

import com.epam.hometask.six.data.BookParser;
import com.epam.hometask.six.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BookParserTest {


    private static final String DATA = "BookOne Minsk 2012 100 Brodnickiy Jelydev";
    BookParser parser = new BookParser();

    @Test
    public void parserShouldReturnRightObject(){

        //given
        Book book = new Book("BookOne", "Minsk",2012 ,100 , Arrays.asList(new String[]{"Brodnickiy", "Jelydev"}));

        //when
        Book result = parser.createBook(DATA);

        //then
        Assert.assertEquals(book,result);

    }
}
