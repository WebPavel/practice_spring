package zv2.com.cn.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zv2.com.cn.entity.biz.account.Account;
import zv2.com.cn.entity.usr.customer.Customer;
import zv2.com.cn.entity.usr.manager.Manager;

import java.util.Date;

/**
 * @author lb
 * @date 2019/5/14
 */
@Configuration
public class BeanConfig {
    @Bean(name = "account")
    public Account account() {
        Account account = new Account();
        account.setDeposit(0.00);
        account.setGmtCreate(new Date().toGMTString());
        account.setGmtModified(new Date().toGMTString());
        return account;
    }
    @Bean(name = "customer")
    public Customer customer() {
        Customer customer = new Customer();
        customer.setPassword("");
        return customer;
    }
    @Bean(name = "manager")
    public Manager manager() {
        Manager manager = new Manager();
        manager.setUsername("admin");
        manager.setPassword("admin");
        return manager;
    }
}
