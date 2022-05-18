package com.epam.poland.module2.lesson1;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/file.txt");
        System.out.println();
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            while (bufferedReader.ready()){
                char[] buffer = new char[100];
                bufferedReader.read(buffer);
                System.out.print(buffer);
            }

        } catch (Exception e) {

        }
    }
}
