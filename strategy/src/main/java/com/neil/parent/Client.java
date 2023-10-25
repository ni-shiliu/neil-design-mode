package com.neil.parent;

/**
 * @author nihao
 * @date 2023/10/25
 */
public class Client {

    public static void main(String[] args) {
        MapRouteContent mapRouteContent = new MapRouteContent();

        BikeRouteStrategy bikeRouteStrategy = new BikeRouteStrategy();
        CarRouteStrategy carRouteStrategy = new CarRouteStrategy();
        TransportRouteStrategy transportRouteStrategy = new TransportRouteStrategy();

        mapRouteContent.addStrategy(bikeRouteStrategy);
        mapRouteContent.addStrategy(carRouteStrategy);
        mapRouteContent.addStrategy(transportRouteStrategy);

        mapRouteContent.buildRoute();
    }
}
