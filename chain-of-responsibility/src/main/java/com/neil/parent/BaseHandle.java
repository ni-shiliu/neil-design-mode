package com.neil.parent;

import java.util.Arrays;
import java.util.List;

/**
 * @author nihao
 * @date 2023/11/1
 */
public class BaseHandle implements MyRequestHandle {

    public static List<MyRequestHandle> handleList = Arrays.asList(
            new AuthHandle(),
            new IpHandle()
    );

    @Override
    public boolean verify() {
        for (MyRequestHandle myRequestHandle : handleList) {
            if (!myRequestHandle.verify()) {
                return false;
            }
        }
        return true;
    }
}
