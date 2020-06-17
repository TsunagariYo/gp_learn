package com.edu.proxypattern.dynamicproxy.jdkproxy;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 10:16
 */
public class Test {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new JDKMeipo().getInstance(new Customer());
            obj.findlove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

