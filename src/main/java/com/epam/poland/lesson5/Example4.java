package com.epam.poland.lesson5;

public class Example4 {
    public static void main(String[] args) {
        new B();
    }
}

class A{
    static {
        System.out.println("static A - 1");
    }

    {
        System.out.println("Not static A - 1");
    }
    public A() {
        System.out.println("Constructor A");
    }
    
    {
        System.out.println("Not static A - 2");
    }

    static {
        System.out.println("static A - 2");
    }
}

class B extends A{
    static {
        System.out.println("static B - 1");
    }

    {
        System.out.println("Not static B - 1");
    }
    public B() {
        System.out.println("Constructor B");
    }

    {
        System.out.println("Not static B - 2");
    }

    static {
        System.out.println("static B - 2");
    } 
}
