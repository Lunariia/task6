package com.epam.hometask.six.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class FileDataAcquireTest {

    private static final String FILE_PATH = "src/fileData";
    List<String> resultList = new ArrayList<>();

    @Test
    public void readDataShouldReturnCorrectly(){

        //given
        FileDataAcquire dataAcquire = new FileDataAcquire(FILE_PATH);

        resultList.add("BookOne Minsk 2012 100 Brodnickiy Jelydev");
        resultList.add("BookTwo Vitebsc 2014 120 Medvedeva Kurs");
        resultList.add("BookThree Vilnus 2016 110 Boyko Jelydev");
        resultList.add("BookFore London 2018 150 Melnic Vasileva");
        resultList.add("BookFive Moscow 2020 230 Mehanicov Andreychyk");

        //when
        List<String> dataLine = dataAcquire.readData();

        //then        
        Assert.assertEquals(resultList,dataLine);


    }




}
