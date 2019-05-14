package zv2.com.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import zv2.com.cn.dao.biz.account.AccountDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author lb
 * @date 2019/5/14
 */
//@Component(value = "accountService")
@Service("accountService")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("prototype") // 多例只对初始化有效，对销毁无效
public class AccountService {
    @Value(value = "accountService")
    private String serviceId;
    /**
     * 按类型注入使用Autowired，如果要按名称注入，请使用Qualifier
     * required = true，出错时，对异常是否进行处理,默认true不处理
     * @Resource 等价于@Autowired、@Qualifier一起使用的效果
     */
//    @Autowired(required = true)
//    @Qualifier(value = "accountDao")
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    public void add() {
        accountDao.add();
        System.out.println("add account.. "+serviceId);
    }

    @PostConstruct
    public void setup() {
        System.out.println("初始化...");
    }

    @PreDestroy
    public void teardown() {
        System.out.println("销毁...");
    }
}
