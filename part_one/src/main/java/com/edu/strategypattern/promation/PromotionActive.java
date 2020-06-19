package com.edu.strategypattern.promation;

/**
 * @ClassName PromotionActive
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 16:55
 */
public class PromotionActive {
   private PromotionStrategy promotionStrategy;

    public PromotionActive(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute() {
        this.promotionStrategy.doPromotion();
    }
}
