package com.edu.proxypattern.dynamicproxy.jdkproxy.Instance;

import java.lang.reflect.Method;

/**
 * @ClassName GPInvocationHandler
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 10:35
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}