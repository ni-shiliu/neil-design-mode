package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/23
 * @desc 首选咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        desc = "首选咖啡（House Blend Coffee）";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
