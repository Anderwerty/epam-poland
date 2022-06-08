package com.epam.poland.module2.lesson2;

public class LinkedList<T> implements List<T> {
    private int size;
    private Node<T> head = new Node<>(null, null);

    @Override
    public int size() {
        return size;
    }

    // head --> node1--> null
    @Override
    public void add(T item) {
        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        Node<T> node = new Node<>(item, null);
        currentNode.next = node;
        size++;
    }

    @Override
    public void addByIndex(T item, int index) {

    }

    @Override
    public T getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }

        Node<T> currentNode = head;
        int counter = 0;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (counter == index) {
                return currentNode.value;
            }
            counter++;

        }
        return null;
    }

    @Override
    public void removeByIndex(int index) {
        //validation
        if (index == size - 1) {
            Node<T> currentNode = head;
            int counter = 0;
            while (currentNode.next != null && counter != index) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        } else if (size == 1) {
            Node<T> currentNode = head;
            currentNode.next = null;
        } else {
            Node<T> currentNode = head;
            Node<T> previousNode = null;
            Node<T> nextNode = null;
            int counter = 0;

            while (currentNode.next != null && counter != index -1) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                nextNode = currentNode.next;
            }

            previousNode.next = nextNode;
            currentNode.next = null;
        }
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            builder.append("value: ").append(currentNode.value);
        }
        return builder.toString();
    }

    class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
