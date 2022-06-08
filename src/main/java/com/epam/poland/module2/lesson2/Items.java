package com.epam.poland.module2.lesson2;

import java.util.Iterator;

public class Items implements Iterable<Integer> {
    private final int[] items;

    public Items(int[] items) {
        this.items = items;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int size = items.length;
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Integer next() {
                return items[currentIndex++];
            }
        };
    }
}

class ItemsRunner {

    public static void main(String[] args) {
        Items items = new Items(new int[]{1, 2, 3, 4, 5});
//        Iterator<Integer> iterator = items.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (int value:items) {
            System.out.println(value);
        }



    }
}
