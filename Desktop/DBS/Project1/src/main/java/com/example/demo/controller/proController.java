package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.senderModel.sender;
import com.example.demo.receiverModel.receiver;
import com.example.demo.service.proService;

@Controller
@ResponseBody
public class proController {
       
    @Autowired
    proService proservice;
    
    @RequestMapping("/project/all")
    public List<sender> getAllStudents() {
        
        return proservice.getAllStudents();
        
    }
   
    
}
