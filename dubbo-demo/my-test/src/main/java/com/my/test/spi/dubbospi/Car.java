package com.my.test.spi.dubbospi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI("carAoDi") //默认扩展类名
public interface Car {
    void showCarName(URL url);
}
