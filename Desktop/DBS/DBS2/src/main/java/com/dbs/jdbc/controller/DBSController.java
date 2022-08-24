package com.dbs.jdbc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dbs.jdbc.model.Employee;
import com.dbs.jdbc.service.DBSService;
@RestController
public class DBSController {
    
    @Autowired
    DBSService dbsService;
    
    
    @RequestMapping("/all")
    List<Employee> getAllEmployees(){
        
        List<Employee> empList = dbsService.getAllEmployees();
        
        return empList;
        
    }
}

