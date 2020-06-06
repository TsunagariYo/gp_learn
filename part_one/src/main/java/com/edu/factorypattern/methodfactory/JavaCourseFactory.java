package com.edu.factorypattern.methodfactory;

import com.edu.factorypattern.Course;
import com.edu.factorypattern.JavaCourse;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
