package com.neil.parent;

import cn.hutool.core.collection.CollUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nihao
 * @date 2023/10/25
 */
@Data
public class MapRouteContent {

    private List<RouteStrategy> routeStrategyList;

    public void addStrategy(RouteStrategy routeStrategy) {
        if (CollUtil.isEmpty(routeStrategyList)) {
            routeStrategyList = new ArrayList<>();
        }
        routeStrategyList.add(routeStrategy);
    }

    public void buildRoute() {
        if (CollUtil.isEmpty(routeStrategyList)) {
            return;
        }
        for (RouteStrategy routeStrategy : routeStrategyList) {
            routeStrategy.buildRoute();
        }
    }
}
