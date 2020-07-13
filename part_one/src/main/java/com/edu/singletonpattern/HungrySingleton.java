package com.edu.singletonpattern;

/**
 * 饿汉式
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }


    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }


}
