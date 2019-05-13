package zv2.com.cn.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import zv2.com.cn.service.CustomerService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lb
 * @date 2019/5/14
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {
    /**
     * bean,实例化对象
     * beanName,配置文件中<bean></bean>的id|name属性
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("step5:类初始化之前执行.....");
        return bean;
    }

    /**
     * 后处理bean
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        System.out.println("step8:类初始化后执行........");
        // 动态代理增强
        if (bean instanceof CustomerService) {
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if ("add".equals(method.getName())) {
                        // 此处可以进行权限拦截
                        System.out.println(System.currentTimeMillis());
                        Object ret = method.invoke(bean, args);
                        System.out.println(System.currentTimeMillis());
                        return ret;
                    }
                    return method.invoke(bean, args);
                }
            });
            return proxy;
        }
        return bean;
    }
}
