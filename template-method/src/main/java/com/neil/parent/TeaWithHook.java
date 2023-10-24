package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/24
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon....");
    }

    @Override
    protected void brew() {
        System.out.println("Add tea.....");
    }

    @Override
    boolean condiments() {
        return false;
    }
}
