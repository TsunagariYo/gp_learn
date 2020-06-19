package com.edu.proxypattern.staticproxy.todynamicpattern;



import com.edu.proxypattern.staticproxy.DynamicDataSourceEntry;
import com.edu.proxypattern.staticproxy.IOrderService;
import com.edu.proxypattern.staticproxy.Order;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom on 2019/3/10.
 */
public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据" );
        DynamicDataSourceEntry.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntry.restore();
        return 0;
    }
}
