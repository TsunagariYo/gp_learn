package com.edu.prototypepattern.simpleprototype;

import java.util.List;

/**
 * @ClassName ConcretePrototype
 * @Description
 * @Author Administrator
 * @Date 2020/6/16 0016 17:07
 */
public class ConcretePrototype implements Prototype {
    private int age;
    private String name;
    private List hobbies;

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(this.age);
        prototype.setName(this.name);
        prototype.setHobbies(this.hobbies);
        return prototype;
    }
}
