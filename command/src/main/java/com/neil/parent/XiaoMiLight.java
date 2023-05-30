package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/30
 */
public class XiaoMiLight implements Light {
    String name;

    public XiaoMiLight(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + " is on...");
    }

    @Override
    public void off() {
        System.out.println(name + " is off...");
    }
}
