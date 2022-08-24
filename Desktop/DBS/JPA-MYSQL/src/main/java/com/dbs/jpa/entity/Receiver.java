package com.dbs.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Receiver {

	@Id
	String bicCode;
	String institutionName;
	public String getBicCode() {
		return bicCode;
	}
	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public Receiver(String bicCode, String institutionName) {
		super();
		this.bicCode = bicCode;
		this.institutionName = institutionName;
	}
	public Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
}
