package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/25
 */
public class CarRouteStrategy implements RouteStrategy {

    @Override
    public void buildRoute() {
        System.out.println("Car is building route.......");
    }
}
