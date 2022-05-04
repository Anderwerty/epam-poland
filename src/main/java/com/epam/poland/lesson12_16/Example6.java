package com.epam.poland.lesson12_16;

public class Example6 {
    public static void main(String[] args) {
        int maxNameLength = A.<Long>findMaxNameLength(new Long[]{1L, 2L, 3L, 4L});
        System.out.println(maxNameLength);
    }


}

class A {

    public static <E> int findMaxNameLength(E[] items) {
        int maxLength = 0;
        for (E item : items) {
            int length = String.valueOf(item).length();
            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
    }

    public static <I, O>  O convert(I input){
        return null;
    }
}
