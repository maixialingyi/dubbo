package com.my.test.spi.dubbospi.normal;

import org.apache.dubbo.common.URL;

/**
 * aop 静态代理
 */
public class NormalAOP2 implements Normal {

    private Normal normal;

    public NormalAOP2(Normal normal) {
        this.normal = normal;
    }

    @Override
    public void showClassName() {
        System.out.println("NormalAOP2-----before");
        normal.showClassName();
        System.out.println("NormalAOP2-----after");
    }

    @Override
    public void adaptiveTest(URL url) {
        System.out.println("NormalAOP2-----before");
        normal.adaptiveTest(url);
        System.out.println("NormalAOP2-----after");
    }

}
