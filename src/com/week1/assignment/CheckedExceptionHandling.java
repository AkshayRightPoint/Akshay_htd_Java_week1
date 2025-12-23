package com.week1.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("data.txt");
        FileReader reader = new FileReader(file);   // -> here FileReader will give run time exception will ask to handle IOException
    }
}
