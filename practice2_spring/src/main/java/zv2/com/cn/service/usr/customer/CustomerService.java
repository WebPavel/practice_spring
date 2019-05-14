package zv2.com.cn.service.usr.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import zv2.com.cn.dao.biz.order.OrderDao;
import zv2.com.cn.dao.usr.customer.CustomerDao;

/**
 * @author lb
 * @date 2019/5/14
 */
public class CustomerService {
    private CustomerDao customerDao;
    @Autowired
    @Qualifier(value = "orderDao")
    private OrderDao orderDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public String printOrdersForCustomer() {
        return "亲，您暂时没有订单";
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "customerDao=" + customerDao +
                ", orderDao=" + orderDao +
                '}';
    }
}
