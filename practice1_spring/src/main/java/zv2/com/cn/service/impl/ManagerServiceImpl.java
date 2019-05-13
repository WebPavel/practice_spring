package zv2.com.cn.service.impl;

import zv2.com.cn.service.ManagerService;

/**
 * @author lb
 * @date 2019/5/13
 */
public class ManagerServiceImpl implements ManagerService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void init() {
        System.out.println("hello,"+name);
    }
}
