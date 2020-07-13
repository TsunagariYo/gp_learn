package com.edu.singletonpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //通过反射破解内部类的单例
        Class<?> aClass = InnerStaticClassSingleton.class;
        Constructor<?> constructor = aClass.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object o1 = constructor.newInstance();
        Object o2 = InnerStaticClassSingleton.getInstance();

        if (o1 == o2){
            System.out.println("两个对象相同");
        }else {
            System.out.println("两个对象不同");
        }

    }
}
