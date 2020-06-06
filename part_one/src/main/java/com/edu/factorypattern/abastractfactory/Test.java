package com.edu.factorypattern.abastractfactory;

public class Test {
    public static void main(String[] args) {

        CourseFactory factory = new JavaCourseFactory();
        factory.createCourse();
        factory.createNote();
        factory.createvideo();
    }
}
