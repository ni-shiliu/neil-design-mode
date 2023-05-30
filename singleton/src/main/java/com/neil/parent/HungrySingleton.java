package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/29
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
