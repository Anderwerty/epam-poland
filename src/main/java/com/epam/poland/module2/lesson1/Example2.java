package com.epam.poland.module2.lesson1;

import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try (MyClosable myClosable = new MyClosable()) {
            myClosable.run();
        } catch (IOException e) {
            System.out.println("log: " + e);
        }
    }
}
