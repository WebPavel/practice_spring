AspectJ表达式
execution（<访问修饰符>?<返回类型><方法名>(<参数>)<异常>）
execution（"* zv2.com.cn.dao.*(..)"）检索当前包dao
execution（"* zv2.com.cn.dao..*(..)"）检索当前包dao及其子包
execution（"* zv2.com.cn.dao+.*(..)"）检索当前包dao及其子类

AspectJ通知类型

AspectJ和advisor的区别
1.advisor支持一个切点和一个通知的组合
2.aspectJ支持多个切点和多个通知的组合


jdbcTemplate