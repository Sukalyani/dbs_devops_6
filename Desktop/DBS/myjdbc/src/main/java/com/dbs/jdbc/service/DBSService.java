package com.dbs.jdbc.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.jdbc.model.DBSModel;
import com.dbs.jdbc.repo.DBSRepo;
@Service
public class DBSService {
    @Autowired
    DBSRepo dbsRepo;
    
public List<DBSModel> getAllEmployees() {
        
        
        List<DBSModel> empList = dbsRepo.fetchAllEmployees();
        
        return empList;
    }
    public String  createNewEmp(DBSModel emp) {
        
        return dbsRepo.createNewEmp(emp);
    }
    public String updateEmp(DBSModel emp) {
        
        return dbsRepo.updateEmp(emp);
    }
    public String deleteEmp(int id) {
        
        return dbsRepo.deleteEmpRecord(id);
        
    }
}
