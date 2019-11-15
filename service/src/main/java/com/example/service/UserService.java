package com.example.service;

import com.example.common.entity.User;
import com.example.common.entity.UserExample;
import com.example.common.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Boolean findToLogin(String account,String pwd){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(pwd);
        return !userMapper.selectByExample(userExample).isEmpty();
    }
}
