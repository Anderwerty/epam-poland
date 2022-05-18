package com.epam.poland.module2.lesson1;

import java.io.Closeable;
import java.io.IOException;

public class MyClosable implements Closeable {

    public void run() throws RuntimeException {
        System.out.println("deal with functionality");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close my resources");
    }
}
