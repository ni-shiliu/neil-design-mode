package com.neil.parent;

/**
 * @author nihao
 * @date 2023/11/1
 */
public class AuthHandle extends BaseHandle {

    @Override
    public boolean verify() {
        System.out.println("AuthHandle verify start....");
        return false;
    }
}
