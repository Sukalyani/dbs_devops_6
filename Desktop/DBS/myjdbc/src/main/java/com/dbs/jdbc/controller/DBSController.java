package com.dbs.jdbc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dbs.jdbc.model.DBSModel;
import com.dbs.jdbc.service.DBSService;
@RestController
public class DBSController {
    
    @Autowired
    DBSService dbsService;
    
    
    @RequestMapping("/all")
    List<DBSModel> getAllEmployees(){
        
        List<DBSModel> empList = dbsService.getAllEmployees();
        
        return empList;
        
    }
    @PostMapping("/addNewEmp")
    public String addNewEmpRecord(@RequestBody DBSModel emp) {
        
        return dbsService.createNewEmp(emp);
        
    }
    
    @PutMapping("/updateEmp")
    public String updateEmpRec(@RequestBody DBSModel emp) {
        
        return dbsService.updateEmp(emp);
        
    }
    
    @DeleteMapping("/deleteEmp")
    public String deleteEmp(@RequestParam int id) {
        
        return dbsService.deleteEmp(id);
        
    }
}

