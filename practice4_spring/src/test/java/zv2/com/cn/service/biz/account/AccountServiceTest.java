package zv2.com.cn.service.biz.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lb
 * @date 2019/5/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-peer4.xml")
public class AccountServiceTest {
    @Autowired
    @Qualifier("accountService")
//    @Qualifier("accountServiceProxy")
    private AccountService accountService;
    @Test
    public void testTransfer() {
        accountService.transfer("lixin", "lixuefeng", 5000D);
    }
}
