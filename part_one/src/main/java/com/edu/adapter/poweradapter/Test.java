package com.edu.adapter.poweradapter;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 15:39
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapte(new AC220());
        dc5.outputDC5();
    }
}
