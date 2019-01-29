package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicproxyMain {

    public static void consumer(Interface iface){
        iface.getMyname();;
        String name = iface.getNameById("10");
        System.out.println("name:"+name);
    }

    public static void main(String[] args) {

        RealObject realObject = new RealObject();
        consumer(realObject);

        System.out.println("+++++++++++++++++++++++");

        ClassLoader classLoader = Interface.class.getClassLoader();

        Class<?>[] interfaces = new Class[]{Interface.class};
        InvocationHandler handler = new DynamicProxyHandler(realObject);
        Interface proxy = (Interface) Proxy.newProxyInstance(classLoader,interfaces,handler);

        System.out.println("in proxy main :"+proxy.getClass());
        consumer(proxy);


    }

}
