package com.myapp.pojo;
// Generated May 25, 2017 8:05:23 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Salaries generated by hbm2java
 */
public class Salaries  implements java.io.Serializable {


     private SalariesId id;
     private Employees employees;
     private int salary;
     private Date toDate;

    public Salaries() {
    }

    public Salaries(SalariesId id, Employees employees, int salary, Date toDate) {
       this.id = id;
       this.employees = employees;
       this.salary = salary;
       this.toDate = toDate;
    }
   
    public SalariesId getId() {
        return this.id;
    }
    
    public void setId(SalariesId id) {
        this.id = id;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public int getSalary() {
        return this.salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Date getToDate() {
        return this.toDate;
    }
    
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }




}


