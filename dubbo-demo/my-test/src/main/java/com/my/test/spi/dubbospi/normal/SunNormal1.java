package com.my.test.spi.dubbospi.normal;

public class SunNormal1 implements Normal {

    public static String spiName = "sunNormal1";

    @Override
    public void showClassName() {
        System.out.println("SunNormal1");
    }
}
