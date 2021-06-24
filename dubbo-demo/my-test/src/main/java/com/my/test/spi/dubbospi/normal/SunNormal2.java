package com.my.test.spi.dubbospi.normal;

import org.apache.dubbo.common.URL;

public class SunNormal2 implements Normal {

    public static String spiName = "sunNormal2";

    @Override
    public void showClassName() {
        System.out.println("SunNormal2");
    }

    @Override
    public void adaptiveTest(URL url) {
        System.out.println("SunNormal2  adaptiveTest");
    }

}
