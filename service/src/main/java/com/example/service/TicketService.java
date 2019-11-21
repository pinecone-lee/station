package com.example.service;

import com.example.common.entity.Ticket;
import com.example.common.entity.TicketExample;
import com.example.common.mapper.TicketMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TicketService {
    @Resource
    private TicketMapper ticketMapper;

    public int insert(int Tid, int price, String style, int counts){
        Ticket ticket = new Ticket();
        ticket.setTid(Tid);
        ticket.setPrice(price);
        ticket.setStyle(style);
        ticket.setCounts(counts);
        return ticketMapper.insert(ticket);
    }

    public int delete(int id){
        return ticketMapper.deleteByPrimaryKey(id);
    }

    public int reduce(int id){
        Ticket ticket = ticketMapper.selectByPrimaryKey(id);
        ticket.setCounts(ticket.getCounts()-1);
        return ticketMapper.updateByPrimaryKeySelective(ticket);
    }

    public int increase(int id){
        Ticket ticket = ticketMapper.selectByPrimaryKey(id);
        ticket.setCounts(ticket.getCounts()+1);
        return ticketMapper.updateByPrimaryKeySelective(ticket);
    }

    public List<Ticket> findAll(){
        TicketExample ticketExample = new TicketExample();
        TicketExample.Criteria criteria = ticketExample.createCriteria();
        List<Ticket> list = ticketMapper.selectByExample(ticketExample);
        return list;
    }

    public Ticket findTicket(Integer tid,String style){
        TicketExample ticketExample = new TicketExample();
        ticketExample.createCriteria().andTidEqualTo(tid).andStyleEqualTo(style);
        return ticketMapper.selectByExample(ticketExample).get(0);
    }

    public void reduce(Ticket ticket,Integer num){
        ticket.setCounts(ticket.getCounts()-num);
        ticketMapper.updateByPrimaryKeySelective(ticket);
    }

    public void increase(Ticket ticket,Integer num){
        ticket.setCounts(ticket.getCounts()+num);
        ticketMapper.updateByPrimaryKeySelective(ticket);
    }

    public Ticket findById(Integer tid){
        return ticketMapper.selectByPrimaryKey(tid);
    }

    public List<Ticket> findbytid(int tid){
        TicketExample ticketExample = new TicketExample();
        ticketExample.createCriteria().andTidEqualTo(tid);
        return ticketMapper.selectByExample(ticketExample);
    }
}
