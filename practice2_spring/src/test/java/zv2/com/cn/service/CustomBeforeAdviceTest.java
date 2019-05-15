package zv2.com.cn.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zv2.com.cn.service.biz.order.OrderService;

/**
 * @author lb
 * @date 2019/5/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomBeforeAdviceTest {
//    @Autowired
//    @Qualifier(value = "orderService")
//    private OrderService orderService;
//
//    @Test
//    public void test() {
//        orderService.add();
//        orderService.find();
//    }

    @Autowired
    @Qualifier(value = "orderServiceProxy")
    private OrderService orderService;

    @Test
    public void testProxy() {
        orderService.add();
        orderService.find();
    }
}
