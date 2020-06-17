package com.edu.prototypepattern.simpleprototype;

/**
 * @ClassName Client
 * @Description
 * @Author Administrator
 * @Date 2020/6/16 0016 17:10
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype prototype){
        return prototype.clone();
    }
}
