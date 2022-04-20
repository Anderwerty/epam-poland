package com.epam.poland.lesson5;

public class Example6 {
    public static void main(String[] args) {
        System.out.println(max(1, 2, 3, 4));
    }

    public static int max(int a) {
        return a;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int... ints) {
        // validate not empty
        int max = ints[0];
        for (int value : ints) {
            max = max(max, value);
        }

        return max;
    }


}
