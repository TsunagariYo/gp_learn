package com.edu.strategypattern.promation;

/**
 * @ClassName ReturnCashStrategy
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 16:41
 */
public class ReturnCashStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现到支付宝");
    }
}
