package com.neil.parent.factoryMethod;

/**
 * @author nihao
 * @date 2023/5/24
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoCheesePizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoPepperoniPizza();
        }
        return pizza;
    }
}
