package com.epam.hometask.six.book;

import com.epam.hometask.six.data.BookCreator;
import com.epam.hometask.six.model.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookCreatorTest {

    BookCreator creator = new BookCreator();
    private static final String DATA = "BookOne Minsk 2012 100 Brodnickiy Jelydev";

    @Test
    public void bookCreatorShouldCreateRightItem(){

        //given
        List<Book> listCheck = new ArrayList<Book>();
        listCheck.add(new Book("BookOne", "Minsk",2012 ,100 , Arrays.asList(new String[]{"Brodnickiy", "Jelydev"})));

        //when
        List<Book> list = creator.createBookList(DATA);

        //then
        Assert.assertEquals(list,listCheck);

    }
}
