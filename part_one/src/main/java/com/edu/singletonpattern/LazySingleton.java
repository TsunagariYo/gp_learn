package com.edu.singletonpattern;

import java.io.Serializable;

/**
 * 懒汉式
 */
public class LazySingleton implements Serializable {
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    private synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }



}
