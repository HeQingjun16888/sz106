package com.itheima.health.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.health.dao.CheckItemDao;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 检查项服务
 * </p>
 *
 */
// 使用alibaba的包，发布服务 interfaceClass指定服务的接口类
@Service(interfaceClass = CheckItemService.class)
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public List<CheckItem> findAll() {


        return checkItemDao.findAll();
    }

    /**
     * 添加检查项
     * @param checkItem
     */
    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }
}
