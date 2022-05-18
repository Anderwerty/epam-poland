package com.epam.poland.module2.lesson1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Example8 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/out.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true);
             OutputStreamWriter outputStreamWrite = new OutputStreamWriter(fileOutputStream)) {

            for (int i = 0; i < 10; i++) {
                outputStreamWrite.write("Number: " + i+ "\n");
            }
        } catch (Exception e) {

        }

    }
}
