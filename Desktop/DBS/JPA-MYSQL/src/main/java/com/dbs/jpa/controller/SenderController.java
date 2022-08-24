package com.dbs.jpa.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dbs.jpa.entity.Sender;
import com.dbs.jpa.service.SenderService;
@Controller
@ResponseBody
public class SenderController {
       
    @Autowired
    SenderService senderService;
    
    @CrossOrigin("http://localhost/4200")
    @RequestMapping("/sender/all")
    public List<Sender> getAllSender() {
        
        return senderService.getAllSender();
        
    }
    @PostMapping("/sender/addNewEmp")
    public String addRecord(@RequestBody List<Sender> stu) {
        
        return senderService.addNewStudent(stu);
        
    }
    
    @PutMapping("/sender/updateEmp")
    public String   updateRecord(@RequestBody List<Sender> stu) {
        
        return senderService.updateStudent( stu);
        
    }
    
    @DeleteMapping("/sender/deleteEmp")
    public String   deleteRecord(@RequestParam int  customerId) {
        
        return senderService.deleteStudent(customerId);
        
    }
    
}