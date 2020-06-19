package com.edu.strategypattern.promation;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 16:58
 */
public class Test {
    public static void main(String[] args) {
        String promotionKey = "Coupon";
        new PromotionActive(PromotionActiveFactory.getPromotion(promotionKey)).excute();
    }
}
