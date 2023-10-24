package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/24
 */
public class BeverageTestDrive {

    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
