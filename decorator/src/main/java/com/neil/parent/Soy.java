package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/23
 * @desc 豆浆
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Soy";
    }
}
