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

    public List<Train> findby(TrainExample trainExample){
        return trainMapper.selectByExample(trainExample);
    }

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
        trainExample.setOrderByClause("data desc,start desc");
        TrainExample.Criteria criteria = trainExample.createCriteria();
        if(come != null && !come.equals("")){
            criteria.andComeLike("%"+come+"%");
//            System.out.println("come不为空");
        }
        if(destination != null && !destination.equals("")){
            criteria.andDestinationLike("%"+destination+"%");
//            System.out.println("des不为空");
        }
        if(date!=null){
            criteria.andDataEqualTo(date);
        }
        return trainMapper.selectByExample(trainExample);
    }

    public Train findById(Integer id){
        return trainMapper.selectByPrimaryKey(id);
    }
}
