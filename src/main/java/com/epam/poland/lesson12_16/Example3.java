package com.epam.poland.lesson12_16;

public class Example3 {
    public static void main(String[] args) {
        SingletonB.INSTANCE.method();

    }
}

class SingletonB {
    public static final SingletonB INSTANCE = new SingletonB();

    private SingletonB() {
        //
    }

    public void method() {
        System.out.println("done!");
    }
}
