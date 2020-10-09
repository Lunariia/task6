package com.epam.hometask.six.main;

import com.epam.hometask.six.data.BookCreator;
import com.epam.hometask.six.data.BookFieldsType;
import com.epam.hometask.six.data.DaoBook;
import com.epam.hometask.six.data.FileDataAcquire;
import com.epam.hometask.six.data.exception.DaoException;
import com.epam.hometask.six.model.Book;

import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static final String FILE_PATH = "src/fileData";
    private static final String AUTH = "Andreychyk";

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {

        try {
            start();
        } catch (Exception e) {
            LOGGER.info(e.getMessage());
        }

    }

    public static void start() throws DaoException {

        LOGGER.info("Start Main");

        //DataAcquire
        FileDataAcquire dataAcquire = new FileDataAcquire(FILE_PATH);
        List<String> dataLine = dataAcquire.readData();

        //BookCreator
        BookCreator creator = new BookCreator();
        List<Book> listBooks = null;

        for (String line: dataLine) {
            listBooks = creator.createBookList(line);
        }

        //DAO
        DaoBook daoBook = new DaoBook();
        daoBook.addBook(listBooks);

        //selected an object for actions
        Book book = listBooks.get(0);


        //action of
        LOGGER.info("search books");
        List<Book> searcher = daoBook.findBookByTag(BookFieldsType.AUTHORS,AUTH);
        LOGGER.info("end searching:" + searcher.get(0).getTitle());

        //action of removal
        LOGGER.info("start of removal. Capacity: " + daoBook.getBooks().size());
        daoBook.removeBook(book);
        LOGGER.info("delete one book. capacity: " + daoBook.getBooks().size());


        //action of sort
        daoBook.sortByTag(BookFieldsType.PAGES);


        LOGGER.info("process finished");
    }


}
