package zv2.com.cn.service.biz.order.impl;

import zv2.com.cn.service.biz.order.OrderService;

/**
 * @author lb
 * @date 2019/5/15
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public void add() {
        System.out.println("add order...");
    }

    @Override
    public void find() {
        System.out.println("search order...");
    }
}
