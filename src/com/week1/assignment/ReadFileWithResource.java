package com.week1.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileWithResource {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileReader reader = new FileReader("Data.excel")){
            System.out.println(reader);
        }catch (Exception e){
            System.out.println("Exception occured during reading file :: " + e);
        }
    }
}
