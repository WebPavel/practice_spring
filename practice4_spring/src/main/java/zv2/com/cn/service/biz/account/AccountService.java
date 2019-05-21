package zv2.com.cn.service.biz.account;

/**
 * @author lb
 * @date 2019/5/22
 */
public interface AccountService {
    /**
     * 转账
     * @param from 汇款人
     * @param to 收款人
     * @param amount 金额
     */
    void transfer(String from, String to, Double amount);
}
