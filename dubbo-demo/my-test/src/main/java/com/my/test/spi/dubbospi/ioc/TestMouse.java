package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestMouse {
    public static void main(String[] args) {
        ExtensionLoader<Mouse> extensionLoader = ExtensionLoader.getExtensionLoader(Mouse.class);

        //通过映射名获取指定扩展点
        Mouse mouse = extensionLoader.getExtension("xiaomiMouse");
        mouse.showMouseName(null);
    }
}
