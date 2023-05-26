package com.neil.parent.abstractFactory;

import com.neil.parent.abstractFactory.ny.NYStoreFactory;

/**
 * @author nihao
 * @date 2023/5/26
 */
public class Customer {

    public static void main(String[] args) {
        StoreFactory nyStoreFactory = new NYStoreFactory();
        nyStoreFactory.order("NY 新奥尔良披萨", "NY 鸡腿面包", "NY 快乐水");
    }
}
