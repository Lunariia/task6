package com.epam.hometask.six.data;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FileDataAcquire {

    private final static Logger LOGGER = Logger.getLogger(String.valueOf(FileDataAcquire.class));

    private static final String PATH = "src/fileData";

    public List<String> readData() {


        List<String> list = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(PATH))) {

            // read line by line
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        return list;
    }
}
