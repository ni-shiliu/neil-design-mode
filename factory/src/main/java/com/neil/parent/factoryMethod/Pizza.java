package com.neil.parent.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nihao
 * @date 2023/5/24
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name + ", " + dough + ", " + sauce + ", " + String.join(",", toppings));
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza");
    }

    void box() {
        System.out.println("Boxing the pizza");
    }

    String getName() {
        return name;
    }
}
