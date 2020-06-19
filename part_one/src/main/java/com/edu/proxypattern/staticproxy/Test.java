package com.edu.proxypattern.staticproxy;

import com.edu.proxypattern.staticproxy.todynamicpattern.OrderServiceDynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 9:42
 */
public class Test {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            Date today = new Date();
            order.setCreateTime(today.getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            //IOrderService orderService = new OrderServiceSaticProxy(new OrderService());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }

    }
}
