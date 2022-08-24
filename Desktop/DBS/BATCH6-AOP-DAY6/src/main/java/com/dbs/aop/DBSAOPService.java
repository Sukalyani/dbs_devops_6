package com.dbs.aop;

import org.springframework.stereotype.Service;

@Service
public class DBSAOPService {

	public String withDraw(int amount) {
		System.out.println("Entered into the DBSAOPService::withDraw");
		return "Successfully withdrawn amount"+amount;
	}
}
