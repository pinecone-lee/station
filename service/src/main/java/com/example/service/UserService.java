package com.example.service;

import com.example.common.entity.User;
import com.example.common.entity.UserExample;
import com.example.common.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Integer findToLogin(String account,String pwd){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(pwd);
        List<User> list = userMapper.selectByExample(userExample);
        if(list.isEmpty()){
            return -1;
        }
        return list.get(0).getId();
    }

    public Boolean checkToRegister(String account,String phone,String idc){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountEqualTo(account);
        userExample.or(userExample.createCriteria().andPhoneEqualTo(phone));
        userExample.or(userExample.createCriteria().andIdcardEqualTo(idc));
        return userMapper.selectByExample(userExample).isEmpty();
    }

    public void addToRegister(String name,String sex,String pwd,String account,String phone,String idc){
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        user.setPassword(pwd);
        user.setAccount(account);
        user.setPhone(phone);
        user.setIdcard(idc);
        user.setStatus(1);
        userMapper.insertSelective(user);
    }
}
