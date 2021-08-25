package com.cola.dao;

import com.cola.pojo.Pec;
import com.cola.service.PECService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PECDao {
    private static Map<Integer, Pec> policyExecutionComponentMap = null;

    static {
        policyExecutionComponentMap = new HashMap<Integer, Pec>();

        policyExecutionComponentMap.put(1001,new Pec(1001,"No_h Client01","192.168.56.31","SNMP","","","已启用","30%","web检测"));
        policyExecutionComponentMap.put(1002,new Pec(1002,"No_h Client02","192.168.56.32","SNMP","","","已启用","10%","web检测"));
        policyExecutionComponentMap.put(1003,new Pec(1003,"No_h Client03","192.168.56.33","SNMP","","","已启用","98%","web检测"));
        policyExecutionComponentMap.put(1004,new Pec(1004,"No_h Client04","192.168.56.34","SNMP","","","已启用","12%","web检测"));
        policyExecutionComponentMap.put(1005,new Pec(1005,"No_h Client05","192.168.56.35","SNMP","","","已启用","49%","web检测"));
        policyExecutionComponentMap.put(1006,new Pec(1006,"No_h Client06","192.168.56.36","SNMP","","","已启用","80%","web检测"));
    }

    //主键自增
    private static Integer initId=1006;
    //增加一个策略执行组件
    public void save(Pec pec){
        if(pec.getId()==null){
            pec.setId(initId++);
        }
        policyExecutionComponentMap.put(pec.getId(), pec);
    }

    //查询全部全部策略服务器
    public Collection<Pec> getAll(){
        return policyExecutionComponentMap.values();
    }

    //通过id查询策略服务器
    public Pec getEmployeeById(Integer id){
        return policyExecutionComponentMap.get(id);
    }

    //删除策略执行组件
    public void delete(Integer id){
        policyExecutionComponentMap.remove(id);
    }

}
