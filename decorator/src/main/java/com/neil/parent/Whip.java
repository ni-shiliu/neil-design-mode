package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/23
 * @desc 奶泡
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Whip";
    }
}
