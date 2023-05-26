package com.neil.parent.abstractFactory.ny;

import com.neil.parent.abstractFactory.Beverages;
import com.neil.parent.abstractFactory.Bread;
import com.neil.parent.abstractFactory.Pizza;
import com.neil.parent.abstractFactory.StoreFactory;

/**
 * @author nihao
 * @date 2023/5/26
 */
public class NYStoreFactory extends StoreFactory {


    @Override
    protected Pizza createPizza(String name) {
        return new NYPizza(name);
    }

    @Override
    protected Bread createBread(String name) {
        return new NYBread(name);
    }

    @Override
    protected Beverages createBeverages(String name) {
        return new NYBeverages(name);
    }
}
