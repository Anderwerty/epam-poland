package com.epam.poland.module2.lesson1;

public class Example4 {
    public static void main(String[] args) {

        CheesePizza cheeseMeatCheesePizza =
                new CheesePizza(new MeatPizza(new CheesePizza(new EmptyPizza())));

        cheeseMeatCheesePizza.makePizza();
    }
}

interface Pizzable {
    void makePizza();
}

class EmptyPizza implements Pizzable {

    @Override
    public void makePizza() {
        System.out.println("empty pizza");
    }
}

class CheesePizza implements Pizzable {
    private final Pizzable pizza;

    CheesePizza(Pizzable pizza) {
        this.pizza = pizza;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println("Add cheese");
    }
}

class MeatPizza implements Pizzable {
    private final Pizzable pizza;

    MeatPizza(Pizzable pizza) {
        this.pizza = pizza;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
        System.out.println("Add meat");
    }
}
