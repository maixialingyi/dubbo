package com.my.test.spi.dubbospi.normal;

import org.apache.dubbo.common.extension.SPI;

@SPI("sunNormal1")
public interface Normal {
    void showClassName();
}
