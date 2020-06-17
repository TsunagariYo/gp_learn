package com.edu.proxypattern.staticproxy;

/**
 * @ClassName OrderDao
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 9:24
 */
public class OrderDao {
    public int insert(Order order){System.out.println("OrderDao 创建 Order 成功!");
        return 1;
    }
}
