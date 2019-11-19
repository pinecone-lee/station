package com.example.service;

import com.example.common.entity.Orders;
import com.example.common.entity.OrdersExample;
import com.example.common.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

    public List<Orders> findAll(){
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        List list = ordersMapper.selectByExample(ordersExample);
        return list;
    }

    public int delete(int id){
        return ordersMapper.deleteByPrimaryKey(id);
    }

    public int changeStatus(int id,String status){
        Orders orders = ordersMapper.selectByPrimaryKey(id);
        orders.setStatus(status);
        return ordersMapper.updateByPrimaryKeySelective(orders);
    }

    public int insert(int Uid, int TTid, Date date, String style, int number, String status, int price){
        Orders orders = new Orders();
        orders.setUid(Uid);
        orders.setTtid(TTid);
        orders.setStyle(style);
        orders.setNumber(number);
        orders.setStatus(status);
        orders.setPrice(price);
        return ordersMapper.insert(orders);
    }

    public Integer findOrderTicket(Integer uid, Integer ttid){
        OrdersExample ordersExample = new OrdersExample();
        ordersExample.createCriteria().andUidEqualTo(uid).andTtidEqualTo(ttid);
        List<Orders> list = ordersMapper.selectByExample(ordersExample);
        if(list.isEmpty()) return 0;
        Integer sum = 0;
        for(Orders orders:list){
            sum = sum + orders.getNumber();
        }
        return sum;
    }
}
