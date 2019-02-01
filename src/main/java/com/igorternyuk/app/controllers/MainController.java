package com.igorternyuk.app.controllers;

import com.igorternyuk.app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zenko on 31.01.19.
 */

@Controller
public class MainController {
    @Autowired
    EmployeeService service;

    @RequestMapping("/")
    public String index(Model model)  {
        model.addAttribute("employees", service.getEmployees());
        return "index";
    }


}
