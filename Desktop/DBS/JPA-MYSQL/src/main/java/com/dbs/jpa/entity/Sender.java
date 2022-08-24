package com.dbs.jpa.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sender {

	@Id
	BigInteger customerId;
	String accountHolderName;
	int clearBalance;
	String transferType;
	String overDraft;

	public Sender(BigInteger customerId, String accountHolderName, int clearBalance, String transferType, String overDraft) {
		super();
		this.customerId = customerId;
		this.accountHolderName = accountHolderName;
		this.clearBalance = clearBalance;
		this.transferType = transferType;
		this.overDraft = overDraft;
	}
	public Sender() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigInteger getCustomerId() {
		return customerId;
	}
	public void setCustomerId(BigInteger customerId) {
		this.customerId = customerId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(int clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}   
    
}

