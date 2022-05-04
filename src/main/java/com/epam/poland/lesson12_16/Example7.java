package com.epam.poland.lesson12_16;

public class Example7 {
    public static void main(String[] args) {
        AContainer<Integer> container1 = new AContainer<>(new Integer[]{2, 5, 6, 6});
        AContainer<Double> container2 = new AContainer<>(new Double[]{2.0, 5.0, 6d, 10.00});
//        AContainer<double> container3 = new AContainer<>(new double[]{2D, 5.0, 6d, 10.00});
        System.out.println(container1.findMax());
        System.out.println(container2.findMax());

        double[] arrr ={1.0,23,4};

        int compare = container1.compare(container2);
    }
}

class AContainer<E extends Number> { // numbers

    private final E[] items;

    AContainer(E[] items) {
        this.items = items;
    }

    public double findMax() {
        double maxLength = items[0].doubleValue();
        for (E item : items) {
            maxLength = Math.max(maxLength, item.doubleValue());
        }

        return maxLength;
    }

    public int compare(AContainer<? extends Number> other) {
        return (int) (this.findMax() - other.findMax());
    }
}


