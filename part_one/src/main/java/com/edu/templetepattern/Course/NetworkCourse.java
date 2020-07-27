package com.edu.templetepattern.Course;

/**
 * @ClassName NetworkCourse
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 10:04
 */
public abstract class NetworkCourse {
    protected final void createCourse() {
        //发布预习资料
        this.postPreResource();
        //制作ppt
        this.createPPT();
        //在线直播
        this.liveVideo();
        //提交课件,课堂笔记
        this.postNote();
        //提交源码
        this.postCode();
        //布置作业,有些事有作业,有些没有作业
        if (needHomeWork()) {
            checkHomeWork();
        }
    }

    abstract void checkHomeWork();


    //钩子方法;可以控制流程的微调
    protected boolean needHomeWork() {
        return false;
    }

    private final void postCode() {
        System.out.println("提交源码");
    }

    private final void postNote() {
        System.out.println("提交课件和笔记");
    }

    private final void liveVideo() {
        System.out.println("在线直播授课");
    }

    private final void createPPT() {
        System.out.println("创建PPT");
    }

    protected final void postPreResource() {
        System.out.println("分发预习资料");
    }

}
