package com.epam.poland.module2.lesson2;

public class ListRunner {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println(list.size());
        list.add("One");
        System.out.println(list.size());
        list.add("Two");

        System.out.println(list.toString());
        System.out.println(list.size());

    }
}
