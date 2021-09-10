package com.cola.dao;

import com.cola.pojo.DataLog;
import com.cola.pojo.Pec;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public interface DataLogDao {
//    private static Map<Integer, DataLog> dataLogMap = null;
//    static {
//        dataLogMap = new HashMap<Integer, DataLog>();
//        dataLogMap.put(1001,new DataLog(1001,"ip","时间","严重性","事件"));
//    }
//
//    //主键自增
//    private static Integer initId=1006;
//    //增加一个策略执行组件
//    public void save(DataLog log){
//        if(log.getId()==null){
//            log.setId(initId++);
//        }
//        dataLogMap.put(log.getId(), log);
//    }

    //查询全部全部策略服务器
    Collection<DataLog> getAll();


//    //通过id查询策略服务器
//    public DataLog getDatalog(Integer id){
//        return dataLogMap.get(id);
//    }
//
//    //删除策略执行组件
//    public void delete(Integer id){
//        dataLogMap.remove(id);
//    }

}
