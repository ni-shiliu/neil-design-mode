package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/23
 */
public class CoffeeShop {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println("点一杯:" + beverage.getDesc() + ";价格：" + beverage.cost());

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println("最终：" + beverage.getDesc() + ";价格:" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        System.out.println("再点一杯:" + beverage.getDesc() + ";价格：" + beverage.cost());

        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println("最终：" + beverage2.getDesc() + ";价格:" + beverage2.cost());

    }

}
