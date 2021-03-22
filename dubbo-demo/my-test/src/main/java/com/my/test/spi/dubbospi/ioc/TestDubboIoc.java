package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestDubboIoc {
    public static void main(String[] args) {
        ExtensionLoader<Computer> extensionLoader = ExtensionLoader.getExtensionLoader(Computer.class);

        URL url = new URL("http","127.0.0.1",8080);
        url = url.addParameter("mouse","sunXingMouse");

        //通过映射名获取指定扩展点
        Computer computer = extensionLoader.getExtension("sunXingComputer");
        computer.showComputerName(url);
    }
}
