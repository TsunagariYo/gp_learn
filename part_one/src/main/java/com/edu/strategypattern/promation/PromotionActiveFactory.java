package com.edu.strategypattern.promation;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionActiveFactory
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 16:43
 */
public class PromotionActiveFactory {
    private static Map<String, PromotionStrategy> promotion_Map = new HashMap<String, PromotionStrategy>();

    static {
        promotion_Map.put(promotionKey.Coupon, new CouponStrategy());
        promotion_Map.put(promotionKey.CashBack, new ReturnCashStrategy());
    }

    private static final PromotionStrategy promotion_non = new EmptyStrategy();

    public static PromotionStrategy getPromotion(String promotionKey) {
        PromotionStrategy strategy = promotion_Map.get(promotionKey);
        return strategy == null ? promotion_non : strategy;
    }

    private interface promotionKey {
        String Coupon = "Coupon";
        String CashBack = "CashBack";
    }
}
