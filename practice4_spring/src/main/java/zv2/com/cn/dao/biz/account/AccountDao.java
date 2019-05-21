package zv2.com.cn.dao.biz.account;

/**
 * @author lb
 * @date 2019/5/22
 */
public interface AccountDao {
    /**
     * 转出
     * @param from 汇款人
     * @param amount 金额
     */
    void out(String from, Double amount);

    /**
     * 转入
     * @param to 收款人
     * @param amount 金额
     */
    void in(String to, Double amount);
}
