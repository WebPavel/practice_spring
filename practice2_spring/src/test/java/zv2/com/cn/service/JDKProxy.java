package zv2.com.cn.service;

import zv2.com.cn.service.biz.order.OrderService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lb
 * @date 2019/5/15
 */
public class JDKProxy implements InvocationHandler {
    private OrderService orderService;
    public JDKProxy(OrderService orderService) {
        super();
        this.orderService = orderService;
    }
    public OrderService createProxy() {
        OrderService proxy = (OrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(), this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("add".equals(method.getName())) {
            System.out.println("write log...");
            return method.invoke(orderService, args);
        }
        return method.invoke(orderService, args);
    }
}
