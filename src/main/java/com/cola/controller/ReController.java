package com.cola.controller;

import com.cola.dao.PECDao;
import com.cola.pojo.Pec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class ReController {

    @Autowired
    PECDao pecDao;

    @RequestMapping("re1")
    public String pecList(){
        return "res/re";
    }
}
