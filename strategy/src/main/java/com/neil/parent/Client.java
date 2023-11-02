package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/25
 */
public class Client {

    public static void main(String[] args) {
        MapRouteContext mapRouteContext = new MapRouteContext();

        BikeRouteStrategy bikeRouteStrategy = new BikeRouteStrategy();
        CarRouteStrategy carRouteStrategy = new CarRouteStrategy();
        TransportRouteStrategy transportRouteStrategy = new TransportRouteStrategy();

        mapRouteContext.addStrategy(bikeRouteStrategy);
        mapRouteContext.addStrategy(carRouteStrategy);
        mapRouteContext.addStrategy(transportRouteStrategy);

        mapRouteContext.buildRoute();
    }
}
