package com.my.test.spi.dubbospi.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class TestDubboIoc {
    public static void main(String[] args) {
        ExtensionLoader<Computer> extensionLoader = ExtensionLoader.getExtensionLoader(Computer.class);

        URL url = new URL("http","127.0.0.1",8080);

        //使用默认依赖
        Computer computer = extensionLoader.getExtension("computerSunXing");
        computer.showComputerName(url);

        //使用指定依赖
        /*url = url.addParameter("mouse","mouseXiaomi");
        Computer computer2 = extensionLoader.getDefaultExtension();
        computer.showComputerName(url);

        extensionLoader.getAdaptiveExtension();*/
    }
}
