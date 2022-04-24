package com.wwh.spring.cloud.alibaba.seata.service.impl;

import com.wwh.spring.cloud.alibaba.seata.domain.TbOrderItem;
import com.wwh.spring.cloud.alibaba.seata.mapper.TbOrderItemMapper;
import com.wwh.spring.cloud.alibaba.seata.service.api.TbOrderItemService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

@Service(version = "1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService {

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem orderItem) {
        tbOrderItemMapper.insert(orderItem);
    }
}
