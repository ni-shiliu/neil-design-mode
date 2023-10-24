package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/24
 */
public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (condiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    boolean condiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("Pouring into cup.....");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water.....");
    }
}
