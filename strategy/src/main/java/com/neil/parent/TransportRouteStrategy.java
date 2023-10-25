package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/25
 */
public class TransportRouteStrategy implements RouteStrategy {

    @Override
    public void buildRoute() {
        System.out.println("Transport is building route.......");
    }
}
