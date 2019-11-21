package com.example.buyclient.controller;

import com.example.common.entity.Ticket;
import com.example.common.entity.Train;
import com.example.common.entity.User;
import com.example.service.OrdersService;
import com.example.service.TicketService;
import com.example.service.TrainService;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Controller
public class BuyController {
    @Resource
    private UserService userService;
    @Resource
    private TrainService trainService;
    @Resource
    private TicketService ticketService;
    @Resource
    private OrdersService ordersService;

    @RequestMapping("/user/buy")
    public String file(String token, String train, String style,Model model){
        Jedis jedis = new Jedis("localhost");
        User user = userService.findFile(Integer.valueOf(jedis.get(token)));
        model.addAttribute("train",train);
        model.addAttribute("style",style);
        model.addAttribute("user",user);
        return "buy";
    }

    @RequestMapping("/user/confirm")
    public String confirm(String train,String style,String ticket,String token,Model model)  {
        Jedis jedis = new Jedis("localhost");
        User user = userService.findFile(Integer.valueOf(jedis.get(token)));
        model.addAttribute("train",train);
        model.addAttribute("ticket",ticket);
        if(user.getStatus()>1){
            model.addAttribute("alert","<script>alert('用户状态异常，无法申请订票')</script>");
            model.addAttribute("style",style);
            model.addAttribute("user",user);
            return "buy";
        }
        try{
            Train tr = trainService.findById(Integer.valueOf(train));
            Ticket tt = ticketService.findTicket(Integer.valueOf(train),style);
            model.addAttribute("tr",tr);
            model.addAttribute("tt",tt);
            return "confirm";
        }catch (Exception e){
            model.addAttribute("alert","<script>alert('无效的车次或车票')</script>");
            model.addAttribute("style",style);
            model.addAttribute("user",user);
            return "buy";
        }
    }

    @RequestMapping("/user/buying")
    public String buying(String train,String style,String ticket,String token,Model model) throws ParseException {
        Jedis jedis = new Jedis("localhost");
        Integer uid = Integer.valueOf(jedis.get(token));
        Train tr = trainService.findById(Integer.valueOf(train));
        boolean error_flag = false;
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
        Date away = df.parse(df1.format(tr.getData())+" "+df2.format(tr.getStart()));
        if(away.before(today)){
            model.addAttribute("alert","<script>alert('该车次已发车，无法订票')</script>");
            error_flag = true;
        }
        else if(!buyTicket(uid,Integer.valueOf(train),style,Integer.valueOf(ticket),away)){
            model.addAttribute("alert","<script>alert('购票数量超出限制或剩余票量，订票失败')</script>");
            error_flag = true;
        }
        if(error_flag){
            User user = userService.findFile(uid);
            model.addAttribute("train",train);
            model.addAttribute("ticket",ticket);
            model.addAttribute("style",style);
            model.addAttribute("user",user);
            return "buy";
        }
        model.addAttribute("feign","/user/order/show?page=1");
        return "feign";
    }

    private synchronized Boolean buyTicket(Integer uid,Integer train,String style,Integer ticket,Date date){
        Ticket tt = ticketService.findTicket(train, style);
        Integer isbuy = ordersService.findOrderTicket(uid,tt.getTid());
        if(ticket>tt.getCounts()||ticket+isbuy>5){
            return false;
        }
        ticketService.reduce(tt,ticket);
        ordersService.insert(uid,tt.getId(),date,style,ticket,"已订",tt.getPrice());
        return true;
    }
}
