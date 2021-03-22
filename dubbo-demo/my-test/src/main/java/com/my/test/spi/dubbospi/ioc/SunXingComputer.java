package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.DisableInject;

public class SunXingComputer implements Computer{

    private Mouse mouse;

    //dubbo set方式 依赖注入
    //@DisableInject  禁止注入注解
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void showComputerName(URL url) {
        mouse.showMouseName(url);
        System.out.println("SunXingComputer");
    }
}
