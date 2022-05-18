package com.epam.poland.module2.lesson1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/file.txt");
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file))) {

            int value;
            while ((value = inputStreamReader.read()) != -1) {
                System.out.print((char)value);
            }
        } catch (Exception e) {

        }
    }
}
