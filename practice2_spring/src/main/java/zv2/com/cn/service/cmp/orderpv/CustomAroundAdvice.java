package zv2.com.cn.service.cmp.orderpv;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 自定义环绕增强
 * @author lb
 * @date 2019/5/16
 */
public class CustomAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前增强...");
        Object result = invocation.proceed();
        System.out.println("环绕后增强...");
        return result;
    }
}
