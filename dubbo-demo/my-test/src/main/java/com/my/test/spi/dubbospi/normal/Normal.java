package com.my.test.spi.dubbospi.normal;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("sunNormal1")
public interface Normal {
    void showClassName();

    /**
     * 动态加载从URL中获取参数，入参必须有URL
     * @param url
     */
    @Adaptive
    void adaptiveTest(URL url);
}
