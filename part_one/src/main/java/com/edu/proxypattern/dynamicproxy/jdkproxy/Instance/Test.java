package com.edu.proxypattern.dynamicproxy.jdkproxy.Instance;

import com.edu.proxypattern.dynamicproxy.jdkproxy.Customer;
import com.edu.proxypattern.dynamicproxy.jdkproxy.Person;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 10:39
 */
public class Test {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new GpMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findlove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
