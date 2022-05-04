package com.epam.poland.lesson12_16;

public class Example8 {
    public static void main(String[] args) {
        int value = 1000;
        Integer integer1 = new Integer(value);
        Integer integer2 = value;
        Integer integer3 = value;

        Integer result = (integer1 + 1) + integer2; //...===> 2+integer2 ===> 2+1 ===>3

//        System.out.println(integer1 == integer2);
//        System.out.println(integer1.equals(integer2));
//        System.out.println(integer3 == integer2);
//        System.out.println(integer3.equals(integer2));

        Boolean bol1 = new Boolean(true);
        Boolean bol2 = true;
        Boolean bol3 = true;

        System.out.println(bol1 == bol2);
        System.out.println(bol3 == bol2);
    }
}
