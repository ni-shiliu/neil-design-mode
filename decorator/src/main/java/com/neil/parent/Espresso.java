package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/23
 * @desc 浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        desc = "浓缩咖啡（Espresso）";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
