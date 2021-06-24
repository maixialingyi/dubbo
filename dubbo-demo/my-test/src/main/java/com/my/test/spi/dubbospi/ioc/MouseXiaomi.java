package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;

public class MouseXiaomi implements Mouse{
    @Override
    public void showMouseName(URL url) {
        System.out.println("MouseXiaomi");
    }
}
