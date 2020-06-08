package com.edu.singletonpattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//容器化实现单例模式
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String classname) throws ClassNotFoundException {
        synchronized (ioc) {
            if (!ioc.containsKey(classname)) {
                Class<?> obj = Class.forName(classname);
                ioc.put("classname", obj);
            }
        }
        return ioc.get(classname);

    }
}
