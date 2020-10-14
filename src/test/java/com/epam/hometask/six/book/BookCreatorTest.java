package com.epam.hometask.six.book;

import com.epam.hometask.six.data.BookCreator;
import com.epam.hometask.six.data.parser.BookParserImpl;
import com.epam.hometask.six.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookCreatorTest {

    private  static final Book BOOK = new Book("BookOne", "Minsk",2012 ,100 , Arrays.asList(new String[]{"Brodnickiy", "Jelydev"}));
    BookCreator creator = new BookCreator(new BookParserImpl());

    private static final String DATA = "BookOne Minsk 2012 100 Brodnickiy Jelydev";

    @Test
    public void bookCreatorShouldCreateRightItem(){

        //given
        List<Book> listCheck = new ArrayList<>();
        List<String> listData = new ArrayList<>();
        listCheck.add(BOOK);
        listData.add(DATA);

        //when
        List<Book> list = creator.createBookList(listData);

        //then
        Assert.assertEquals(list,listCheck);

    }
}
