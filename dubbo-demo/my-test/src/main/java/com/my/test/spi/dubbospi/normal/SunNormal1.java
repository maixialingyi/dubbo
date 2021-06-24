package com.my.test.spi.dubbospi.normal;

import org.apache.dubbo.common.URL;

public class SunNormal1 implements Normal {

    public static String spiName = "sunNormal1";

    @Override
    public void showClassName() {
        System.out.println("SunNormal1");
    }

    @Override
    public void adaptiveTest(URL url) {
        System.out.println("SunNormal1  adaptiveTest");
    }

}
