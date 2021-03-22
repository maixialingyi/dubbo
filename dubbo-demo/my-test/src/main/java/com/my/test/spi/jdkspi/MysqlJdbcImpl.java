package com.my.test.spi.jdkspi;

public class MysqlJdbcImpl implements IJdbc {
    @Override
    public void getDriver() {
        System.out.println("-->MysqlJdbcImpl");
    }
}
