package com.dbs.jdbc.model;
public class DBSModel {
    
    
    int id;
    String name;
    int salary;
    
    public DBSModel() {
        super();
        // TODO Auto-generated constructor stub
    }
    public DBSModel(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    
    
}
