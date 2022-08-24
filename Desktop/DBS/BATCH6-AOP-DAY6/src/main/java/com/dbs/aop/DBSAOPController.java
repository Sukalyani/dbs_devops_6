package com.dbs.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DBSAOPController {

	@Autowired
	DBSAOPService dbsAOPService;
	
	    
	    @RequestMapping("/home")
	    public String withDraw() {
	        
	        System.out.println("Amount withdrawn");
	        return dbsAOPService.withDraw(5000);
	        
	        
	    }
}
