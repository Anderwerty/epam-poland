package com.epam.poland.module2.lesson2;

public interface List<T> {

    int size();

    void add(T item);

    void addByIndex(T item, int index);

    T getByIndex(int index);

    void removeByIndex(int index);
}
