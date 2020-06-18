package com.edu.delegatepattern.simple;

/**
 * @ClassName EmployeeA
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 17:45
 */
public class EmployeeB implements Iemployee {
    @Override
    public void doing(String command) {
        System.out.println("员工B,擅长算法"+command);
    }
}
