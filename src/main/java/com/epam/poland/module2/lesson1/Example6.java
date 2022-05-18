package com.epam.poland.module2.lesson1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/root");
        findFileByName("file.txt", file);

        List<String> strings = Arrays.asList("One", "Two", "A");
        Collections.sort(strings);

        System.out.println(strings);
    }

    public static void findFileByName(String name, File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            // 1. array files ---> list of files
//            List<File> listOfFiles = Arrays.asList(files);
//            Collections.sort(listOfFiles);

            //
            if (files != null) {
                for (File f : files) {
                    findFileByName(name, f);
                }
            }
            if (files.length == 0) {
                System.out.println("Zero length: " + file.getPath());
            }
        } else {
            if (file.getPath().contains(name)) {
                System.out.println("File we are looking for: " + file.getPath());
            }
        }

    }
}
