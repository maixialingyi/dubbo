package com.my.test.spi.dubbospi;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestCar {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);

        //获取默认扩展点
        Car defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.showCarName(null);

        //通过映射名获取指定扩展点
        /*Car car = extensionLoader.getExtension("carBaoMa");
        car.showCarName(null);*/

    }
}
