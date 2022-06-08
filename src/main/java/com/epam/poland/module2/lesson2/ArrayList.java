package com.epam.poland.module2.lesson2;

public class ArrayList<T> implements List<T> {

    private Object[] items;
    private int size;

    public ArrayList(int capacity) {
        items = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
        if (items.length == size) {
            Object[] tempItems = new Object[size * 2];
            System.arraycopy(items, 0, tempItems, 0, items.length);
            items = tempItems;
        }
        items[size++] = item;
    }

    @Override
    public void addByIndex(T item, int index) {
        if (items.length == size) {
            Object[] tempItems = new Object[size * 2];
            System.arraycopy(items, 0, tempItems, 0, index + 1);
            System.arraycopy(items, index, tempItems, index + 1, size - (index + 1));
        } else {
            System.arraycopy(items, index, items, index + 1, size - index + 1);
        }

        items[index] = item;
    }

    @Override
//    @SuppressWarnings() hint
    public T getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
        return (T) items[index];
    }

    @Override
    public void removeByIndex(int index) {

    }
}
