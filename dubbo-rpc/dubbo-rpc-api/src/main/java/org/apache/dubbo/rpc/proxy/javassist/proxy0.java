/*
package org.apache.dubbo.rpc.proxy.javassist;

import org.apache.dubbo.common.bytecode.ClassGenerator;
import org.apache.dubbo.rpc.service.EchoService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class proxy0 implements ClassGenerator.DC, EchoService, DemoService{

    public static Method[] methods;
    private InvocationHandler handler;

    public proxy0(InvocationHandler paramInvocationHandler){
        this.handler = paramInvocationHandler;
    }

    public String sayHello(String paramString) throws Throwable {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramString;
        Object localObject = this.handler.invoke(this, methods[0], arrayOfObject);
        return ((String)localObject);
    }

    public Object $echo(Object paramObject) throws Throwable {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = paramObject;
        Object localObject = this.handler.invoke(this, methods[1], arrayOfObject);
        return ((Object)localObject);
    }

    public proxy0()
    {
    }
}
*/
