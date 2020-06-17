package com.edu.proxypattern.staticproxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName OrderServiceSaticProxy
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 9:39
 */
public class OrderServiceSaticProxy implements IOrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;

    public OrderServiceSaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;

    }

    private void before() {
        System.out.println("Proxy before method.");
    }

    private void after() {
        System.out.println("Proxy after method.");
    }


}