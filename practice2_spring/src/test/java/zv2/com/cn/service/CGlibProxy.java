package zv2.com.cn.service;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import zv2.com.cn.service.usr.customer.CustomerService;

import java.lang.reflect.Method;

/**
 * @author lb
 * @date 2019/5/15
 */
public class CGlibProxy implements MethodInterceptor {
    private CustomerService customerService;
    public CGlibProxy(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }
    public CustomerService createProxy() {
        // 创建cglib核心类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(customerService.getClass());
        // 设置回调
        enhancer.setCallback(this);
        return (CustomerService) enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if ("delete".equals(method.getName())) {
            System.out.println("write log...");
            return methodProxy.invokeSuper(proxy, args);
        }
        return methodProxy.invokeSuper(proxy, args);
    }
}
