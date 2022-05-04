package com.epam.poland.lesson12_16;

import java.util.Objects;

public class Example5 {
    public static void main(String[] args) {
        ContainerInt containerInt = new ContainerInt(1);

        int value = containerInt.getValue();
        System.out.println(value);

        ContainerBoolean containerBoolean = new ContainerBoolean(true);
        boolean value1 = containerBoolean.getValue();
        System.out.println(value1);

        //int ---> Integer
        ContainerObject containerObjectInt = new ContainerObject(1);
        Object itemFromContainer = containerObjectInt.getValue();

        if (itemFromContainer instanceof Integer) {
            int value4 = (int) itemFromContainer;
            System.out.println(value4);
        } else if (itemFromContainer instanceof Boolean) {

        }

        GenericContainer<Boolean> genericContainer = new GenericContainer<>(true);
        GenericContainer<Object> genericContainer1 = new GenericContainer<>(true);

        Boolean value2 = genericContainer.getValue();


    }

}

class ContainerInt {
    private final int value;

    ContainerInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerInt that = (ContainerInt) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

class ContainerBoolean {
    private final boolean value;

    ContainerBoolean(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerBoolean that = (ContainerBoolean) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

class ContainerObject {
    private final Object value;

    ContainerObject(int value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerObject that = (ContainerObject) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

class GenericContainer<E> {
    private final E value;

    GenericContainer(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenericContainer that = (GenericContainer) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


}
