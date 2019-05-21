package zv2.com.cn.dao.impl.biz.account;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import zv2.com.cn.dao.biz.account.AccountDao;

/**
 * @author lb
 * @date 2019/5/22
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String from, Double amount) {
        String sql = "UPDATE biz_account ba SET ba.balance=ba.balance-? WHERE ba.name=?";
        this.getJdbcTemplate().update(sql, amount, from);
    }

    @Override
    public void in(String to, Double amount) {
        String sql = "UPDATE biz_account ba SET ba.balance=ba.balance+? WHERE ba.name=?";
        this.getJdbcTemplate().update(sql, amount, to);
    }
}
