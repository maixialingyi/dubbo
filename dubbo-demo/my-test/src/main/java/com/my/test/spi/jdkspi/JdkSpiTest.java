package com.my.test.spi.jdkspi;

import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

public class JdkSpiTest {

    public static void main(String[] args) {

        /**
         * spi文件配置路径     META-INF.services.
         * 文件名为接口全限定名  com.my.test.spi.jdkspi.IJdbc
         *
         * 如数据库驱动，jdk定义接口 java.sql.Driver
         * DriverManager类static{ spi加载驱动 }
         */
        //方式一
        Iterator<IJdbc> providers = Service.providers(IJdbc.class);
        while(providers.hasNext()) {
            IJdbc iJdbc = providers.next();
            iJdbc.getDriver();
        }

        System.out.println("--------------------------------");

        //方式二
        ServiceLoader<IJdbc> load = ServiceLoader.load(IJdbc.class);
        Iterator<IJdbc> iterator = load.iterator();
        while(iterator.hasNext()) {
            IJdbc iJdbc = iterator.next();
            iJdbc.getDriver();
        }

    }
}
