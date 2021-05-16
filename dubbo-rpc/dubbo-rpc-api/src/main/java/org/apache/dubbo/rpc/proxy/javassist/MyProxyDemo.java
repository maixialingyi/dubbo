package org.apache.dubbo.rpc.proxy.javassist;

public class MyProxyDemo {
    public static String[] pns;
    public static java.util.Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;
    public static Class[] mts1;

    /*public String[] getPropertyNames() {
        return pns;
    }

    public boolean hasProperty(String n) {
        return pts.containsKey($1);
    }

    public Class getPropertyType(String n) {
        return (Class) pts.get($1);
    }

    public String[] getMethodNames() {
        return mns;
    }

    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    public void setPropertyValue(Object o, String n, Object v) {
        org.apache.dubbo.demo.Demo2Service w;
        try {
            w = ((org.apache.dubbo.demo.Demo2Service) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + $2 + "\" field or setter method in class org.apache.dubbo.demo.Demo2Service.");
    }

    public Object getPropertyValue(Object o, String n) {
        org.apache.dubbo.demo.Demo2Service w;
        try {
            w = ((org.apache.dubbo.demo.Demo2Service) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + $2 + "\" field or setter method in class org.apache.dubbo.demo.Demo2Service.");
    }

    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
        org.apache.dubbo.demo.Demo2Service w;
        try {
            w = ((org.apache.dubbo.demo.Demo2Service) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        try {
            if ("sayHelloAsync".equals($2) && $3.length == 1) {
                return ($w) w.sayHelloAsync((String) $4[0]);
            }
            if ("sayHello".equals($2) && $3.length == 1) {
                return ($w) w.sayHello((String) $4[0]);
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + $2 + "\" in class org.apache.dubbo.demo.Demo2Service.");
    }*/


}
