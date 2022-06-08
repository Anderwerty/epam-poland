package com.shylin.bank.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CustomTestRunner {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();

        Class<? extends MyTest> clazz = myTest.getClass();

        Method[] methods = clazz.getMethods();
        List<Method> testMethods = new ArrayList<>();
        List<Method> beforeAllMethods = new ArrayList<>();
        for (Method method : methods) {

            //method.getName().startsWith("test") junit 3 was working
            if (method.isAnnotationPresent(MyTestAnnotation.class)) {
                testMethods.add(method);
            } else if(method.isAnnotationPresent(MyBeforeAllAnnotation.class)){
                beforeAllMethods.add(method);
            }
        }

        beforeAllMethods.forEach(method -> {
            try {
                method.invoke(myTest);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });

        testMethods.forEach(method -> {
            try {
                method.invoke(myTest);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
}

class MyTest {
    @MyTestAnnotation
    public void test4() {
        System.out.println("test - 4");
    }

    @MyBeforeAllAnnotation
    public void runBeforeAll(){
        System.out.println("Run before all");
    }

    @MyTestAnnotation
    public void test1() {
        System.out.println("test  - 1");
    }

    @MyTestAnnotation
    public void test2() {
        System.out.println("test - 2");
    }

    @MyTestAnnotation
    public void test3() {
        System.out.println("test - 3");
    }

}




