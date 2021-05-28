/*
package org.apache.dubbo.rpc.proxy.javassist;

public class Wrapper0 extends Wrapper{

    public static String[] pns = new String[] { "name" };
    public static Map pts = new HashMap() {

        {
            put("name", "java.lang.String");
        }
    };

    public static String[] mns = new String[] { "sayHello" };
    public static String[] dmns = new String[] { "sayHello" };
    public static Class[] mts0 = new Class[] { String.class };

    public String[] getPropertyNames() {
        return pns;
    }

    public boolean hasProperty(String n) {
        return pts.containsKey(n);
    }

    public Class getPropertyType(String n) {
        return (Class) pts.get(n);
    }

    public String[] getMethodNames() {
        return mns;
    }

    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    public void setPropertyValue(Object o, String n, Object v) {
        com.alibaba.dubbo.demo.provider.DemoServiceImpl w;

        try {
            w = ((com.alibaba.dubbo.demo.provider.DemoServiceImpl) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }

        if ($2.equals("name")) {
            w.setName((java.lang.String) $3);

            return;
        }

        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException(
                "Not found property \"" + $2 +
                        "\" filed or setter method in class com.alibaba.dubbo.demo.provider.DemoServiceImpl.");
    }

    public Object getPropertyValue(Object o, String n) {
        com.alibaba.dubbo.demo.provider.DemoServiceImpl w;

        try {
            w = ((com.alibaba.dubbo.demo.provider.DemoServiceImpl) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }

        if ($2.equals("name")) {
            return ($w) w.getName();
        }

        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException(
                "Not found property \"" + $2 +
                        "\" filed or setter method in class com.alibaba.dubbo.demo.provider.DemoServiceImpl.");
    }

    public Object invokeMethod(Object o, String n, Class[] p, Object[] v)
            throws java.lang.reflect.InvocationTargetException {
        com.alibaba.dubbo.demo.provider.DemoServiceImpl w;

        try {
            w = ((com.alibaba.dubbo.demo.provider.DemoServiceImpl) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }

        try {
            if ("getName".equals($2) && ($3.length == 0)) {
                return ($w) w.getName();
            }

            if ("setName".equals($2) && ($3.length == 1)) {
                w.setName((java.lang.String) $4[0]);

                return null;
            }

            if ("sayHello".equals($2) && ($3.length == 1)) {
                return ($w) w.sayHello((java.lang.String) $4[0]);
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }

        throw new com.alibaba.dubbo.common.bytecode.NoSuchMethodException(
                "Not found method \"" + $2 +
                        "\" in class com.alibaba.dubbo.demo.provider.DemoServiceImpl.");
    }
}
*/
