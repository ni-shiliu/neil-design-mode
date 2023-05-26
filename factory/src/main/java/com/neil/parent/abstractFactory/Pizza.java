package com.neil.parent.abstractFactory;

/**
 * @author nihao
 * @date 2023/5/24
 */
public abstract class Pizza {
    String name;
    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
