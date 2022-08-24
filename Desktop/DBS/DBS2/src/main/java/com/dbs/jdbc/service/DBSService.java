package com.dbs.jdbc.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.jdbc.model.Employee;
import com.dbs.jdbc.repo.DBSRepo;
@Service
public class DBSService {
    @Autowired
    DBSRepo dbsRepo;
    
    public List<Employee> getAllEmployees() {
        
        
        List<Employee> empList = dbsRepo.fetchAllEmployees();
        
        return empList;
    }
}
