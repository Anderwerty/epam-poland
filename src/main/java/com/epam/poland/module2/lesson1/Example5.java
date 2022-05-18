package com.epam.poland.module2.lesson1;

import java.io.*;

public class Example5 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/file.txt");
        System.out.println();
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {

//            int value;
//            while ((value = bufferedReader.read()) != -1) {
//                System.out.print((char) value);
//            }
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (Exception e) {

        }
    }
}
