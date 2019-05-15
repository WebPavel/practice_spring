package zv2.com.cn.service.biz.order;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置增强
 * @author lb
 * @date 2019/5/15
 */
public class CustomBeforeAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method 增强的方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置增强...");
    }
}
