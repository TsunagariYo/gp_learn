package com.edu.singletonpattern;

/**
 * 双重检查
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton doubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    private synchronized static LazyDoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (doubleCheckSingleton ==null) {
                    doubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

}
