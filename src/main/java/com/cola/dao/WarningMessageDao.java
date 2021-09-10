package com.cola.dao;


import com.cola.pojo.RuleEngine;
import com.cola.pojo.WarningMessage;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface WarningMessageDao {
//    private static Map<Integer, WarningMessage> warningMessageMap = null;
//    static {
//        warningMessageMap = new HashMap<Integer, WarningMessage>();
//        warningMessageMap.put(001,new WarningMessage(001,"Report problems to adminstrators","","发送消息个用户群组：No_h adminstrators 通过所有介质","已启用"));
//        warningMessageMap.put(002,new WarningMessage(002,"restart mysql","触发器 等于 Check Service mysql status","于当前主机上执行远程命令","已启用"));
//        warningMessageMap.put(003,new WarningMessage(003,"restart nginx","触发器 等于 Check Service nginx status","于当前主机上执行远程命令","已启用"));
//        warningMessageMap.put(004,new WarningMessage(004,"restart php-fpm","触发器 等于 Check Service php-fpm status","于当前主机上执行远程命令","已启用"));
//        warningMessageMap.put(005,new WarningMessage(005,"restart_vsftpd","触发器 等于 Srt_Aly_244","于当前主机上执行远程命令","已启用"));
//
//    }
//
//    private static Integer initId=1006;
//
//    public void save(WarningMessage warningMessage){
//        if(warningMessage.getId()==null){
//            warningMessage.setId(initId++);
//        }
//        warningMessageMap.put(warningMessage.getId(),warningMessage);
//    }
    Collection<WarningMessage> getAll();

//    public WarningMessage getWarningMessage(Integer id){
//        return warningMessageMap.get(id);
//    }
//
//    public void delete(Integer id){
//        warningMessageMap.remove(id);
//    }
}
