package com.my.test.spi.dubbospi;

import org.apache.dubbo.common.URL;

public class CarAoDi implements Car{
    @Override
    public void showCarName(URL url) {
        System.out.println("carAoDi.showCarName()");
    }
}
