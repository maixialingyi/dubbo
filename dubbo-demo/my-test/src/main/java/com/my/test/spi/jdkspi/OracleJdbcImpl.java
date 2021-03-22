package com.my.test.spi.jdkspi;

public class OracleJdbcImpl implements IJdbc{
    @Override
    public void getDriver() {
        System.out.println("-->OracleJdbcImpl");
    }
}
