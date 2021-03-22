package com.my.test.spi.dubbospi;

import org.apache.dubbo.common.URL;

/**
 * aop 静态代理
 */
public class CarWrapper implements Car {

    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void showCarName(URL url) {
        car.showCarName(url);
        System.out.println("CarWrapper");
    }
}
