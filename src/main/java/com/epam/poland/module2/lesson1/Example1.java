package com.epam.poland.module2.lesson1;

import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        MyClosable myClosable = null;
        try {
            myClosable = new MyClosable();
            myClosable.run();
        } catch (RuntimeException e) {
            System.out.println("log: " + e);
        } finally {
            if (myClosable != null) {
                try {
                    myClosable.close();
                } catch (IOException e) {
                    System.out.println("log: " + e);
                }
            }
        }
    }
}

