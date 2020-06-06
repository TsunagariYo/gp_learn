package com.edu.factorypattern.methodfactory;

import com.edu.factorypattern.Course;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory =new JavaCourseFactory();
        Course course = factory.create();
        course.record();
    }
}
