package com.neil.parent.abstractFactory;

/**
 * @author nihao
 * @date 2023/5/24
 */
public abstract class Bread {

    String name;

    public Bread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
