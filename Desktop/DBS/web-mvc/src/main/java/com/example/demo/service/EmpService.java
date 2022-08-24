package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Emp;
import com.example.demo.repo.EmpRepo;
import java.util.List;

@Service
	public class EmpService {
	   @Autowired
	    EmpRepo empRepo;
	    public List<Emp> getAllEmployees() {
	        
	        return empRepo.findAll();
	        
	    }
	    public String addNewStudent(List<Emp> stu) {
	        
	        try{
	            empRepo.saveAll(stu);
	        }catch(Exception e) {
	            return "Problem Occured while inserting New Student Rec!!!!!!!!";
	        }
	        return " Student Added Successfully!!!!!!!!!";
	    }
	    public String updateStudent(List<Emp> emp) {
	        try{
	            
	            //Student exitingStudent = studentRepo.findById(emp.getId()).get();
	            
	            empRepo.saveAll(emp);
	        }catch(Exception e) {
	            return "No Student Found!!!!!!!";
	        }
	        return " Student Updated Successfully!!!!!!!!!";
	    }
	    public String deleteStudent(int studentId) {
	        try{
	            empRepo.deleteById(studentId);
	        }catch(Exception e) {
	            return "Problem Occured while deleting New Student Rec!!!!!!!!";
	        }
	        return " Student Deleted Successfully!!!!!!!!!";
	    }
		public void saveNewEmp(Emp emp) {
			// TODO Auto-generated method stub
			empRepo.save(emp);
			
		}
	}
