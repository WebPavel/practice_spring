package zv2.com.cn.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lb
 * @date 2019/5/14
 */
public class AccountServiceTest {
    @Test
    public void testCollectionInjectAttribute() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.add();
    }
    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.add();
        applicationContext.close();
    }
    @Test
    public void testScope() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        AccountService accountService1 = (AccountService) applicationContext.getBean("accountService");
        System.out.println(accountService == accountService1);
    }
}
