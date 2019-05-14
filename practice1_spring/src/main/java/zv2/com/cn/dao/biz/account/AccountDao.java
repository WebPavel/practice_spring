package zv2.com.cn.dao.biz.account;

import org.springframework.stereotype.Repository;

/**
 * @author lb
 * @date 2019/5/14
 */
@Repository(value = "accountDao")
public class AccountDao {
    public void add() {
        System.out.println("insert into biz_account...");
    }
}
