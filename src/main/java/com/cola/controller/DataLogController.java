package com.cola.controller;


import com.cola.dao.DataLogDao;
import com.cola.pojo.DataLog;
import com.cola.pojo.Pec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class DataLogController {

    @Autowired
    DataLogDao dataLogDao;

    @RequestMapping("/datalog")
    public String datalog(Model model){
        Collection<DataLog> dataLogDaoAll = dataLogDao.getAll();
        model.addAttribute("log",dataLogDaoAll);
        return "log/list";
    }
}
