package zv2.com.cn.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import zv2.com.cn.service.CustomerService;

/**
 * @author lb
 * @date 2019/5/14
 */
public class CustomerServiceImpl implements CustomerService,BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean {
    public CustomerServiceImpl() {
        super();
        System.out.println("step1:initialize.");
    }

    public void setup() {
        System.out.println("step7:call init-method");
    }

    public void teardown() {
        System.out.println("step11:call manual destroy-method");
    }

    @Override
    public void add() {
        System.out.println("step9:CustomerService add.........");
    }

    @Override
    public void find() {
        System.out.println("step9:CustomerService find.........");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("step3:inject bean id | name= " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("step4:inject applicationContext= " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("step6:属性设置后执行......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("step10:call destroy method");
    }

    public void setUsername(String username) {
        System.out.println("step2:attribute di..");
        this.username = username;
    }

    private String username;
}
