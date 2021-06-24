package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI("computerSunXing")
public interface Computer {
    void showComputerName(URL url);
}
