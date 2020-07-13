package com.edu.TempletePattern.Course;

/**
 * @ClassName BigDataCourse
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 10:37
 */
public class BigDataCourse extends NetworkCourse {
    private boolean needHomeWorkFlag = false;

    public BigDataCourse(boolean needHomeWorkFlag) {
        this.needHomeWorkFlag = needHomeWorkFlag;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据作业");
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWorkFlag;
    }
}
