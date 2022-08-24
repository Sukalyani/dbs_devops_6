package com.dbs.jdbc.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.dbs.jdbc.model.Employee;
@Component
public class DBSDAO {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    RowMapper<Employee> empRowMapper = (rs,no)->{
        
        Employee emp = new Employee();
        
        emp.setId(rs.getInt(1));
        emp.setName(rs.getString(2));
        emp.setSalary(rs.getInt(3));
        
        return emp;
        
    };
    public  List<Employee> getAllEmployees() {
    
        return jdbcTemplate.query("select * from emp", empRowMapper);
    }
public String insertNewRecord(Employee emp) {
        
        String insertQuery = "INSERT INTO EMP (name, salary) VALUES ('"+emp.getName()+"',"+emp.getSalary()+")";
        
        int numRec = jdbcTemplate.update(insertQuery);
        
        if(numRec > 0) {
            return "Successfully Emp record got added!!!!!!!!!";
        }
        else {
            return "Problem got Occured while Adding a Emp record!!!!!!!!!";
        }
    
    }
    public String updateEmp(Employee emp) {
        
        
         String sqlQuery = "update EMP set name = ?, salary = ? where id = ?";
         int numRec = jdbcTemplate.update(sqlQuery,emp.getName(),emp.getSalary(),emp.getId());
         
         if(numRec > 0) {
                return "Successfully Emp record got Updated!!!!!!!!!";
            }
        else {
                return "Problem got Occured while Updating a Emp record!!!!!!!!!";
        }
        
    }
    public String deleteEmpRec(int id) {
        
         String sqlQuery = "delete from EMP  where id = ?";
          int numRec = jdbcTemplate.update(sqlQuery,id);
          if(numRec > 0) {
                return "Successfully Emp record got deleted!!!!!!!!!";
            }
        else {
                return "Problem got Occured while deleting a Emp record!!!!!!!!!";
        }
          
    }
}
