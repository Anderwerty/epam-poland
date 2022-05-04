package com.epam.poland.lesson12_16;

public class Example2 {
    public static void main(String[] args) {
        new SingletonA().method();
        new SingletonA();
    }
}

/**
 * We need to create just one instance of current class.
 */
class SingletonA {

    private static int counter = 0;

    public SingletonA() {
        if (counter++ != 0) {
            throw new RuntimeException("Please reuse first instance of this classs");
        }
    }

    public void method() {
        System.out.println("method");
    }
}
