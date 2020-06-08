package com.edu.singletonpattern;

/**
 * 原理:类加载  先加载内部类
 *
 * 性能最优的写法
 *
 * 缺点:会被反射获取
 */

public class InnerStaticClassSingleton {
    private InnerStaticClassSingleton() {
        //解决反射问题
        if (LazyHolder.Lazy != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public final static InnerStaticClassSingleton getInstance() {
        return LazyHolder.Lazy;
    }
    private static class LazyHolder{
        private final  static InnerStaticClassSingleton Lazy = new InnerStaticClassSingleton();
    }

}
