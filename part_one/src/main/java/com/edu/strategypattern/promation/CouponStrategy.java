package com.edu.strategypattern.promation;

/**
 * @ClassName CouponStrategy
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 16:40
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("发送优惠券");
    }
}
