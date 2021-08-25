package com.cola.controller;

import com.cola.dao.RuleEngineDao;
import com.cola.pojo.RuleEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class RuleEngineController {

    @Autowired
    RuleEngineDao ruleEngineDao;

    @RequestMapping("/res1")
    public String pecList(Model model){
        Collection<RuleEngine> ruleEngines = ruleEngineDao.getAll();
        model.addAttribute("res",ruleEngines);
        return "pe/list";
    }
}
