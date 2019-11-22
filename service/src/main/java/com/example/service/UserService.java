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

    public User findToLogin(String account,String pwd){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(account);
        criteria.andPasswordEqualTo(pwd);
        List<User> list = userMapper.selectByExample(userExample);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    public Boolean checkToRegister(String account,String phone,String idc){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountEqualTo(account);
        userExample.or(userExample.createCriteria().andPhoneEqualTo(phone));
        userExample.or(userExample.createCriteria().andIdcardEqualTo(idc));
        return userMapper.selectByExample(userExample).isEmpty();
    }

    public Boolean checkToSave(Integer id, String account,String phone,String idc){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria1 = userExample.createCriteria();
        criteria1.andIdNotEqualTo(id).andAccountEqualTo(account);
        UserExample.Criteria criteria2 = userExample.createCriteria();
        criteria2.andIdNotEqualTo(id).andPhoneEqualTo(phone);
        userExample.or(criteria2);
        UserExample.Criteria criteria3 = userExample.createCriteria();
        criteria3.andIdNotEqualTo(id).andIdcardEqualTo(idc);
        userExample.or(criteria3);
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

    public User findFile(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    public void saveFile(Integer id,String name,String sex, String account, String phone, String idc){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSex(sex);
        user.setAccount(account);
        user.setPhone(phone);
        user.setIdcard(idc);
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void savePwd(Integer id,String pw){
        User user = new User();
        user.setId(id);
        user.setPassword(pw);
        userMapper.updateByPrimaryKeySelective(user);
    }

    public Boolean confirmPassword(Integer id,String pwd){
        return userMapper.selectByPrimaryKey(id).getPassword().equals(pwd);
    }

    public List<User> findByName(UserExample userExample){
        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }

    public void update(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }

    public List<User> findbyid(int id){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }

    public void delete(int id){
        userMapper.deleteByPrimaryKey(id);
    }
}
