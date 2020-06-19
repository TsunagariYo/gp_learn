package com.edu.proxypattern.dynamicproxy.jdkproxy.Instance;


import java.lang.reflect.Method;

/**
 * @ClassName JDKMeipo
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 10:10
 */
public class GpMeipo implements GPInvocationHandler {
    //被代理的对象，把引用给保存下来
    private Object target;

    public Object getInstance(Object target) throws Exception {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }
}

