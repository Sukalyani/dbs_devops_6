package com.dbs.jdbc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dbs.jdbc.model.Employee;
import com.dbs.jdbc.service.DBSService;
@Controller
@ResponseBody
public class DBSMySQLController {
    
    
    
    @Autowired
    DBSService dbsService;
    
    @RequestMapping("/dbs/all")
    public List<Employee> getAllEmployees() {
        
        return dbsService.getAllDBSEmployees();
        
    }
    @PostMapping("/dbs/addNewEmp")
    public String   addRecord(@RequestBody Employee emp) {
        
        return dbsService.addNewDBSEmp(emp);
        
    }
    
    @PutMapping("/dbs/updateEmp")
    public String   updateRecord(@RequestBody Employee emp) {
        
        return dbsService.updateDBSEmp(emp);
        
    }
    
    @DeleteMapping("/dbs/deleteEmp")
    public String   updateRecord(@RequestParam int  id) {
        
        return dbsService.deleteDBSEmp(id);
        
    }
    
}