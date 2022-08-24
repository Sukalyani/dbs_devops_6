package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class AUTHController {
       
    @Autowired
    @RequestMapping("/home")
    public String showGreetings() {
        
        
        return "Welcome to DBS For All Users";
    }
    
    @RequestMapping("/user")
    public String showUser() {
        
        
        return "user.jsp";
    }
    @RequestMapping("/admin")
    public String showForAdmin() {
        
        
        return "Welcome to DBS for Admin only";
    }
}
