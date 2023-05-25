package com.neil.parent.simple;

/**
 * @author nihao
 * @date 2023/5/24
 */
public class PepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing PepperoniPizza...");
    }

    @Override
    public void bake() {
        System.out.println("bake PepperoniPizza...");
    }

    @Override
    public void cut() {
        System.out.println("cut PepperoniPizza...");
    }

    @Override
    public void box() {
        System.out.println("box PepperoniPizza...");
    }

    @Override
    public String getName() {
        return "PepperoniPizza";
    }
}
