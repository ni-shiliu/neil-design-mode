package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/24
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk....");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter.....");
    }
}
