package com.epam.poland.module2.lesson1;

import java.io.Closeable;
import java.io.IOException;

public class Example10 {
    public static void main(String[] args) {

        try (B b = new B(new A())) {
            b.run();
        } catch (Exception e) {

        }

    }
}

class A implements Closeable {

    public void run() {
        System.out.println("run A");
    }


    @Override
    public void close() throws IOException {
        System.out.println("close A");
    }
}

class B implements Closeable {
    private final A a;

    B(A a) {
        this.a = a;
    }

    public void run() {
        a.run();
        System.out.println("run B");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close B");
        a.close();
    }
}
