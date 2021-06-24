package com.my.test.spi.dubbospi.normal;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestSpiNormal {
    public static void main(String[] args) {
        ExtensionLoader<Normal> extensionLoader = ExtensionLoader.getExtensionLoader(Normal.class);

        //通过映射名获取指定扩展点
        Normal normal = extensionLoader.getDefaultExtension();
        normal.showClassName();

        Normal normal1 = extensionLoader.getExtension("sunNormal2");
        normal1.showClassName();
    }
}
