package com.neil.parent;

/**
 * @author nihao
 * @date 2023/11/1
 */
public class RequestTest {

    public static void main(String[] args) {

        BaseHandle baseHandle = new BaseHandle();
        if (!baseHandle.verify()) {
            System.out.println("verify fail...");
            return;
        }
        System.out.println("verify success...");

    }
}
