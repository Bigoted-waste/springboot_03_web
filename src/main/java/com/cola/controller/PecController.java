package com.cola.controller;

import com.cola.dao.PECDao;
import com.cola.pojo.Department;
import com.cola.pojo.Employee;
import com.cola.pojo.Pec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class PecController {

    @Autowired
    PECDao pecDao;

    @RequestMapping("/pec")
    public String pecList(Model model){
        Collection<Pec> pec = pecDao.getAll();
        model.addAttribute("pecs",pec);
        return "pec/plist";
    }


}
