package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/29
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;
    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
