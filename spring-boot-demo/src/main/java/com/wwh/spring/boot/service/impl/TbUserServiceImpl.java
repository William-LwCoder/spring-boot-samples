package com.wwh.spring.boot.service.impl;

import com.wwh.spring.boot.mapper.TbUserMapper;
import com.wwh.spring.boot.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

}
