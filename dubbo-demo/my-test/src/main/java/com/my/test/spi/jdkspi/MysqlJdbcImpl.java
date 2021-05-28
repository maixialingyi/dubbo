package com.my.test.spi.jdkspi;

public class MysqlJdbcImpl implements IJdbc {
    @Override
    public void getDriver() {
        System.out.println("-->MysqlJdbcImpl");
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3};
        for(int[] i = arr;;){
            System.out.println(i);
        }
    }
}
