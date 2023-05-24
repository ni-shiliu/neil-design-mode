package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/23
 * @desc 饮料超类
 */
public abstract class Beverage {

    String desc = "Unknown Beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}
