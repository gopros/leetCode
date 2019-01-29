package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("dynamicProxyName:"+proxy.getClass());
        System.out.println("method:"+method.getName());
        System.out.println("args:"+Arrays.toString(args));

        Object invokeObject = method.invoke(proxied,args);

        if (invokeObject!=null){
            System.out.println("invoke object:"+invokeObject.getClass());
        }else {
            System.out.println("invokeObject is null");
        }

        return invokeObject;
    }
}
