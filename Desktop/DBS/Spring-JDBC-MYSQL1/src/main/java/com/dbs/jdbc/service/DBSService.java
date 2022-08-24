package com.dbs.jdbc.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.dbs.jdbc.dao.DBSDAO;
import com.dbs.jdbc.model.Employee;
@Component
public class DBSService {
    @Autowired
    DBSDAO dbsDAO;
    
    public  List<Employee> getAllDBSEmployees() {
        
        return dbsDAO.getAllEmployees();
        
    }
    public String addNewDBSEmp(Employee emp) {
        
        return dbsDAO.insertNewRecord(emp);
    }
    public String updateDBSEmp(Employee emp) {
        
        return dbsDAO.updateEmp(emp);
    }
    public String deleteDBSEmp(int id) {
        return dbsDAO.deleteEmpRec(id);
    }
}