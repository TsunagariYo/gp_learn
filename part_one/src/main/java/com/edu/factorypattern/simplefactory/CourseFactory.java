package com.edu.factorypattern.simplefactory;


import com.edu.factorypattern.Course;

/**
 * 简单工厂模式
 *
 * 解决创建复杂的逻辑问题
 *
 * 在Calendar的源码 和log4j 中的LoggerFactory 使用了简单工厂模式
 *
 * 使用場景: 工厂创建对象少
 */
public class CourseFactory {
    /* public Course create(String name) {
         if ("java".equals(name))
             return new JavaCourse();
         else return null;
     }*/

    //通过反射创建
    public Course create(Class clzz) {
        try {
            if (null != clzz) {
                return (Course) clzz.getDeclaredConstructor().newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
