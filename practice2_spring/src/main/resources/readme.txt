AOP名词解释
连接点joinpoint：候选的可以被拦截的方法
切入点pointcut：指定的对哪些方法进行拦截的方法
通知advice：增强的功能代码，针对方法级别的增强
引介introduction：特殊的advice，类级别的增强。拦截的对象不再是方法，而是类，为类动态添加属性或方法
目标对象target：需要被增强的类的对象
织入weaving:把增强代码应用到目标对象的过程
代理proxy：新生成的对象
切面aspect：切入点和通知（引介）的结合