package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/25
 */
public class BikeRouteStrategy implements RouteStrategy {

    @Override
    public void buildRoute() {
        System.out.println("Bike is building route.......");
    }
}
