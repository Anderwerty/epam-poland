package com.epam.poland.lesson5;

public class Example7 {
    public static void main(String[] args) {
        int intValue = 1;
        Integer integerValue = 1;
        long longValue = 1;
        Long longWrapperValue = longValue;
        Object object = intValue;

        method(1); // int 1 ==> Integer 1 ==> Object

    }

//    public static void method(int value) {
//        System.out.println("int value");
//    }
//
//    public static void method(Integer value) {
//        System.out.println("Integer value");
//    }

    public static void method(Long value) {
        System.out.println("Long value");
    }

    public static void method(Object value) {
        System.out.println("Object value");
    }

}
