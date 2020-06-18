package com.edu.delegatepattern.simple;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 17:51
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("算法",new Leader());
    }
}
