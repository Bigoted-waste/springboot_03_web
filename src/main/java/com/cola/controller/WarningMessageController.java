package com.cola.controller;

import com.cola.dao.RuleEngineDao;
import com.cola.dao.WarningMessageDao;
import com.cola.pojo.RuleEngine;
import com.cola.pojo.WarningMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class WarningMessageController {

    @Autowired
    WarningMessageDao warningMessageDao;

    @RequestMapping("/war")
    public String pecList(Model model){
        Collection<WarningMessage> warningMessages = warningMessageDao.getAll();
        model.addAttribute("warning",warningMessages);
        return "warning/list";
    }
}
