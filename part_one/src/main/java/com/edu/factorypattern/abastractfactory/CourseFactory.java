package com.edu.factorypattern.abastractfactory;

import com.edu.factorypattern.Course;

/**
 * 抽象工厂模式
 */
public interface CourseFactory {
    Course createCourse();

    Video createvideo();

    Note createNote();

}
