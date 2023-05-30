package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/30
 */
public enum EnumSingleton {
    INSTANCE;

    public void exec() {
        System.out.println("exec...");
    }
}
