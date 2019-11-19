package com.example.service;

import com.example.common.entity.Ticket;
import com.example.common.entity.Train;
import com.example.common.entity.TrainExample;
import com.example.common.mapper.TrainMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class TrainService {
    @Resource
    TrainMapper trainMapper;

    public int delete(int id){
        return trainMapper.deleteByPrimaryKey(id);
    }

    public int insert(String come, String destionation, Date date, Date start, String time, int counts){
        Train train = new Train();
        train.setCome(come);
        train.setDestination(destionation);
        train.setData(date);
        train.setStart(start);
        train.setTime(time);
        train.setCounts(counts);
        return trainMapper.insert(train);
    }

    public int reduce(int id){
        Train train = trainMapper.selectByPrimaryKey(id);
        train.setCounts(train.getCounts()-1);
        return trainMapper.updateByPrimaryKeySelective(train);
    }

    public int increase(int id){
        Train train = trainMapper.selectByPrimaryKey(id);
        train.setCounts(train.getCounts()+1);
        return trainMapper.updateByPrimaryKeySelective(train);
    }

    public List<Train> findAll(){
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        List<Train> list = trainMapper.selectByExample(trainExample);
        return list;
    }

    public List<Train> findDestination(String destination){
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andDestinationEqualTo(destination);
        List list = trainMapper.selectByExample(trainExample);
        return list;
    }

    public List<Train> findCome(String come){
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andComeEqualTo(come);
        List list = trainMapper.selectByExample(trainExample);
        return list;
    }

    public List<Train> finddate(Date date){
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andDataEqualTo(date);
        List list = trainMapper.selectByExample(trainExample);
        return list;
    }

    public List<Train> findUnite(String come, String destination, Date date){
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andComeEqualTo(come);
        criteria.andDestinationEqualTo(destination);
        criteria.andDataEqualTo(date);
        List list = trainMapper.selectByExample(trainExample);
        return list;
    }

    public Train findById(Integer id){
        return trainMapper.selectByPrimaryKey(id);
    }
}
