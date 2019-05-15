package zv2.com.cn.service;

import org.junit.Test;
import zv2.com.cn.service.biz.order.OrderService;
import zv2.com.cn.service.biz.order.impl.OrderServiceImpl;

/**
 * @author lb
 * @date 2019/5/15
 */
public class OrderServiceTest {
    @Test
    public void test() {
        OrderService orderService = new OrderServiceImpl();
        orderService.add();
        orderService.find();
    }
    @Test
    public void testJDKProxy() {
        OrderService orderService = new OrderServiceImpl();
        OrderService proxy = new JDKProxy(orderService).createProxy();
        proxy.add();
        proxy.find();
    }
}
