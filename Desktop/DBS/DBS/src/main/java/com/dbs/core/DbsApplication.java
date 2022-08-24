package com.dbs.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbsApplication.class, args);
		System.out.println("Welcome to Spring.... From DBS");
		BankAccount bankAccount=context.getbean(BankAccount.class);
		bankAccount.deposit(35000);
	}
	

}
