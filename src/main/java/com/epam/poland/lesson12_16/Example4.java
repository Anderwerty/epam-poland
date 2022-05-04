package com.epam.poland.lesson12_16;

public class Example4 {
    public static void main(String[] args) {
        SingletonC.getInstance().method();
    }
}

class SingletonC{
    private static SingletonC instance;

    private SingletonC(){

    }

    public static SingletonC getInstance(){
        if(instance == null){
            instance = new SingletonC();
        }
        return instance;
    }

    public void method(){
        System.out.println("C");
    }
}
