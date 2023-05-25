package com.neil.parent.simple;

/**
 * @author nihao
 * @date 2023/5/25
 */
public class Customer {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Neil 点了一份" + pizza.getName());
    }
}
