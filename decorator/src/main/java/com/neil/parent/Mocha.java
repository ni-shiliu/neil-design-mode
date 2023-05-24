package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/23
 * @desc 摩卡
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.22;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }
}
