package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("mouseSunXing")
public interface Mouse {

    @Adaptive
    void showMouseName(URL url);

}
