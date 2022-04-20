package com.epam.poland.lesson5;

public class Example2 {
    public static void main(String[] args) {
        Manager alex = new Manager("Alex");

        Manager manager = new Manager();
    }
}

class Manager {

    private String name;

    public Manager(String name) {
        this();
        this.name = name;
        System.out.println("constructor with string parameter");
    }

    public Manager(){
        super();
        System.out.println("constructor without parameters");
    }

    public String getName() {
        return name;
    }
}
