package com.neil.parent;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @author nihao
 * @date 2023/5/29
 */
public class StaticInnerSingleton {

    public StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

}
