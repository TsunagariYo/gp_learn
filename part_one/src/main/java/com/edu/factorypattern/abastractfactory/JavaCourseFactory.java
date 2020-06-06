package com.edu.factorypattern.abastractfactory;

import com.edu.factorypattern.Course;
import com.edu.factorypattern.JavaCourse;

import java.util.Calendar;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Course createCourse() {
        return new JavaCourse();
    }

    @Override
    public Video createvideo() {
        return new JavaVeido();
    }

    @Override
    public Note createNote() {
        return new JavaNote();
    }
}
