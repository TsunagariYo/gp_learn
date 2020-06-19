package com.edu.delegatepattern.simple;

/**
 * @ClassName Boss
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 17:42
 */
public class Boss {
    public  void  command(String command,Leader leader){
        leader.doing(command);
    }
}
