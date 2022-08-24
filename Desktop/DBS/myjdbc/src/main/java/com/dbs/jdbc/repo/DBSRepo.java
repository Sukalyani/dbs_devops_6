package com.dbs.jdbc.repo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.dbs.jdbc.model.DBSModel;
@Repository
public class DBSRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    //T mapRow(ResultSet rs, int rowNum) throws SQLException;
    
    RowMapper<DBSModel>  myRowMapper = (rs,no)->{
        DBSModel  emp = new DBSModel();
        
        emp.setId(rs.getInt(1));
        emp.setName(rs.getString(2));
        emp.setSalary(rs.getInt(1));
        
        
        return emp;
    };
    
            
            
    public List<DBSModel> fetchAllEmployees() {
        
        String sqlQuery = " Select * from Emp;";
        
        
        List<DBSModel> empList = jdbcTemplate.query(sqlQuery, myRowMapper);
        
        
        
        return empList;
    }
    
public String createNewEmp(DBSModel emp) {
        
        String insertQuery = "INSERT INTO EMP (name, salary) VALUES ('"+emp.getName()+"',"+emp.getSalary()+")";
        
        int num = jdbcTemplate.update(insertQuery);
        
        if(num > 0) {
            
            return "Successfully Emp Record got Created!!!!!!!!!!!";
        }
        else {
            return "Problem Occured while creating a Emp Record!!!!!!!!!!!";
        }
        
    }
public String updateEmp(DBSModel emp) {
    
    String sqlQuery = "update EMP set name = ?, salary = ? where id = ?";
    
    int numRec = jdbcTemplate.update(sqlQuery,emp.getName(),emp.getSalary(),emp.getId());
    
    
    if(numRec > 0) {
        
        return "Successfully Emp Record got Updated!!!!!!!!!!!";
    }
    else {
        return "Problem Occured while updating a Emp Record!!!!!!!!!!!";
    }
    
    
    
}

public String deleteEmpRecord(int id) {
    
    String sqlQuery = "delete from EMP  where id = ?";
    
     int numRec = jdbcTemplate.update(sqlQuery,id);
     
     
     if(numRec > 0) {
           
           return "Successfully Emp Record got Deleted!!!!!!!!!!!";
       }
       else {
           return "Problem Occured while deleting a Emp Record!!!!!!!!!!!";
       }
}

}
