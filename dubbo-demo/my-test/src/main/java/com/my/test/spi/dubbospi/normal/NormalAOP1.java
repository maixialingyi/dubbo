package com.my.test.spi.dubbospi.normal;

/**
 * aop 静态代理
 */
public class NormalAOP1 implements Normal {

    private Normal normal;

    public NormalAOP1(Normal normal) {
        this.normal = normal;
    }

    @Override
    public void showClassName() {
        System.out.println("NormalAOP1-----before");
        normal.showClassName();
        System.out.println("NormalAOP1-----after");
    }
}
