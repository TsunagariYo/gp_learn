package com.edu.strategypattern.promation;

/**
 * @ClassName EmptyStrategy
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 16:42
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无活动");
    }
}
