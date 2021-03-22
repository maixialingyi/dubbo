package com.my.test.spi.dubbospi;

import org.apache.dubbo.common.URL;

public class CarBaoMa implements Car{
    @Override
    public void showCarName(URL url) {
        System.out.println("carBaoMa.showCarName()");
    }
}
