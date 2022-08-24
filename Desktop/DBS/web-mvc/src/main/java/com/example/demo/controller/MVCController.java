package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.Emp;

import com.example.demo.service.EmpService;

@Controller
public class MVCController {
	
	@Autowired
    EmpService empService;

    
    @RequestMapping("/home")
    public String showWelcomePage() {
        
        
        return "Home.jsp";
        
        
    }
    
    
    @RequestMapping("/addNewEmp")
    public String addNewEmpServlet() {
        
        
        return "AddEmp.jsp";
        
    }
    
    @RequestMapping("/saveNewEmp")
    public String saveEmpRec(@RequestParam int empId,@RequestParam String empName,@RequestParam int empSal,Model model) {
        
        
        
        //Emp emp = new Emp(123,"Abdul",45000);
        //model.addAttribute("emp", emp);
        
        //System.out.println("empName---------->"+empName);
        //System.out.println("empSal------------>"+empSal);
    	Emp emp=new Emp(empId,empName,empSal);
    
		empService.saveNewEmp(emp);
        
        List<Emp> empList = empService.getAllEmployees();
        model.addAttribute("AllEmps", empList);
        
        
        return "ShowAllEmp.jsp";
        
    }
    
    
    
}