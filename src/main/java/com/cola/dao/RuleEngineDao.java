package com.cola.dao;

import com.cola.pojo.Pec;
import com.cola.pojo.RuleEngine;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface RuleEngineDao {
//    private static Map<Integer, RuleEngine> ruleEngineDaoMap = null;
//
//    static {
//        ruleEngineDaoMap = new HashMap<Integer, RuleEngine>();
//        ruleEngineDaoMap.put(530441241, new RuleEngine(530441241, "No_H Server01", "192.168.123.88", "", "", "", "已启用", "30%", "web检测"));
//        ruleEngineDaoMap.put(530441212, new RuleEngine(530441212, "No_H Server02", "192.168.123.89", "", "", "", "已启用", "13%", "web检测"));
//
//    }
//
//    //主键自增
//    private static Integer initId = 1006;
//
//    //增加一个策略执行组件
//    public void save(RuleEngine ruleEngine) {
//        if (ruleEngine.getId() == null) {
//            ruleEngine.setId(initId++);
//        }
//        ruleEngineDaoMap.put(ruleEngine.getId(), ruleEngine);
//    }

    //查询全部全部规则引擎
    Collection<RuleEngine> getAll();


//    //通过id查询规则引擎
//    public RuleEngine getEmployeeById(Integer id) {
//        return ruleEngineDaoMap.get(id);
//    }
//
//    //删除规则引擎
//    public void delete(Integer id) {
//        ruleEngineDaoMap.remove(id);
//    }
}
