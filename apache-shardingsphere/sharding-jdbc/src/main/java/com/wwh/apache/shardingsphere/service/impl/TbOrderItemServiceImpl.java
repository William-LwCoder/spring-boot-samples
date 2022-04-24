package com.wwh.apache.shardingsphere.service.impl;

import com.wwh.apache.shardingsphere.mapper.TbOrderItemMapper;
import com.wwh.apache.shardingsphere.service.api.TbOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbOrderItemServiceImpl implements TbOrderItemService {

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

}
