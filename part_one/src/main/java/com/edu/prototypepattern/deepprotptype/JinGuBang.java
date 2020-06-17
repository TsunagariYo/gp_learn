package com.edu.prototypepattern.deepprotptype;

import java.io.Serializable;

/**
 * @ClassName JinGuBang
 * @Description
 * @Author Administrator
 * @Date 2020/6/16 0016 17:21
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big(){
        this.d *= 2;
        this.h *= 2;
    }
    public void small(){
        this.d /= 2;
        this.h /= 2;
    }
}
