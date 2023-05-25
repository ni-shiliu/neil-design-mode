package com.neil.parent.simple;

/**
 * @author nihao
 * @date 2023/5/24
 */
public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza...");
    }

    @Override
    public void bake() {
        System.out.println("bake CheesePizza...");
    }

    @Override
    public void cut() {
        System.out.println("cut CheesePizza...");
    }

    @Override
    public void box() {
        System.out.println("box CheesePizza...");
    }

    @Override
    public String getName() {
        return "CheesePizza";
    }
}
