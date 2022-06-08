package com.epam.poland.module2.lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

//container --->
public class MyFirstCollector<R, E> implements Collector<E, java.util.ArrayList<E>, R> {

    // how to create collection or container to store items
    @Override
    public Supplier<java.util.ArrayList<E>> supplier() {
        return () -> new java.util.ArrayList<E>();
    }

    // how to put item into created container
    @Override
    public BiConsumer<java.util.ArrayList<E>, E> accumulator() {
        return (collection, item) -> collection.add(item);
    }

    //
    @Override
    public BinaryOperator<java.util.ArrayList<E>> combiner() {

        return (first, second) -> {
            ArrayList<E> items = new ArrayList<>();
            items.addAll(first);
            items.addAll(second);

            return new ArrayList<>(new HashSet<>(items));
        };
    }

    @Override
    public Function<java.util.ArrayList<E>, R> finisher() {
        return collection -> (R) collection;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.singleton(Characteristics.UNORDERED);
    }
}

class StringCollector<E, R> implements Collector<E, StringBuilder, R> {
    private final  int namelength;

    StringCollector(int namelength) {
        this.namelength = namelength;
    }

    @Override
    public Supplier<StringBuilder> supplier() {
        return () -> new StringBuilder().append(" put headers here");
    }

    @Override
    public BiConsumer<StringBuilder, E> accumulator() {
        return StringBuilder::append;
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return StringBuilder::append;
    }

    @Override
    public Function<StringBuilder, R> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }

    private String format(E item){
        return String.format("template", item);
    }
}
