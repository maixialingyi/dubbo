package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestMouse {
    public static void main(String[] args) {
        ExtensionLoader<Mouse> extensionLoader = ExtensionLoader.getExtensionLoader(Mouse.class);

        //通过映射名获取指定扩展点
        Mouse mouse = extensionLoader.getExtension("sunXingMouse");
        mouse.showMouseName(null);

        /*ExtensionLoader<Computer> extensionLoader = ExtensionLoader.getExtensionLoader(Computer.class);

        //通过映射名获取指定扩展点
        Computer computer = extensionLoader.getExtension("sunXingComputer");
        computer.showComputerName(null);*/
    }
}
