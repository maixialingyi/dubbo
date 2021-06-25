package com.my.test.spi.dubbospi.normal;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * https://zhuanlan.zhihu.com/p/87075689
 */
public class TestSpiNormal {
    public static void main(String[] args) {
        ExtensionLoader<Normal> extensionLoader = ExtensionLoader.getExtensionLoader(Normal.class);

        //获取默认
        Normal normal = extensionLoader.getDefaultExtension();
        //normal.showClassName();
        normal.adaptiveTest(null);
        //获取指定
        /*Normal normal1 = extensionLoader.getExtension("sunNormal2");
        normal1.showClassName();

        //动态适配获取
        Normal normal2 = extensionLoader.getAdaptiveExtension();
        URL url = new URL("http","127.0.0.1",8080);
        normal2.adaptiveTest(url);

        url = url.addParameter("normal","sunNormal2");
        normal2.adaptiveTest(url);*/
    }
}
