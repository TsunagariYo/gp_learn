package com.edu.factorypattern.simplefactory;

import com.edu.factorypattern.Course;
import com.edu.factorypattern.JavaCourse;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        Course course = factory.create(JavaCourse.class);
        course.record();
        Calendar.getInstance();

    }
}
