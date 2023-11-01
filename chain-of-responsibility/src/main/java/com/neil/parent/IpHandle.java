package com.neil.parent;

/**
 * @author nihao
 * @date 2023/11/1
 */
public class IpHandle extends BaseHandle {

    @Override
    public boolean verify() {
        System.out.println("IpHandle verify start...");
        return true;
    }
}
