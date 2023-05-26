package com.neil.parent.abstractFactory;

/**
 * @author nihao
 * @date 2023/5/26
 */
public abstract class StoreFactory {

    protected abstract Pizza createPizza(String name);
    protected abstract Bread createBread(String name);
    protected abstract Beverages createBeverages(String name);

    public void order(String pizzaName, String breadName, String beveragesName) {
        Pizza pizza = createPizza(pizzaName);
        System.out.println("点了一份：" + pizza.getName());
        Bread bread = createBread(breadName);
        System.out.println("点了一份：" + bread.getName());
        Beverages beverages = createBeverages(beveragesName);
        System.out.println("点了一份：" + beverages.getName());
    }



}
