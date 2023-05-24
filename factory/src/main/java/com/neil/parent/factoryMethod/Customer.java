package com.neil.parent.factoryMethod;

/**
 * @author nihao
 * @date 2023/5/24
 */
public class Customer {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheese = nyPizzaStore.orderPizza("cheese");
        System.out.println("Neil ordered a " + cheese.getName());

        System.out.println("=========");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pepperoni = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println("ShiLiu ordered a " + pepperoni.getName());

    }
}
