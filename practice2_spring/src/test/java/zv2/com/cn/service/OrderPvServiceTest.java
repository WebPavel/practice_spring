package zv2.com.cn.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zv2.com.cn.service.cmp.orderpv.OrderPvService;

/**
 * @author lb
 * @date 2019/5/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OrderPvServiceTest {
    @Autowired
    @Qualifier("orderPvServiceProxy")
    private OrderPvService orderPvService;
    @Test
    public void testAroundAdvice() {
        orderPvService.dailySales();
        orderPvService.monthlySales();
    }
}
