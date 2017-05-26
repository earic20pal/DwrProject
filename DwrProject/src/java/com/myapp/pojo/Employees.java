package com.myapp.pojo;
// Generated May 25, 2017 8:05:23 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private int empNo;
     private Date birthDate;
     private String firstName;
     private String lastName;
     private String gender;
     private Date hireDate;
     private Set<Titles> titleses = new HashSet<Titles>(0);
     private Set<Salaries> salarieses = new HashSet<Salaries>(0);
     private Set<DeptEmp> deptEmps = new HashSet<DeptEmp>(0);
     private Set<DeptManager> deptManagers = new HashSet<DeptManager>(0);

    public Employees() {
    }

	
    public Employees(int empNo, Date birthDate, String firstName, String lastName, String gender, Date hireDate) {
        this.empNo = empNo;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }
    public Employees(int empNo, Date birthDate, String firstName, String lastName, String gender, Date hireDate, Set<Titles> titleses, Set<Salaries> salarieses, Set<DeptEmp> deptEmps, Set<DeptManager> deptManagers) {
       this.empNo = empNo;
       this.birthDate = birthDate;
       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.hireDate = hireDate;
       this.titleses = titleses;
       this.salarieses = salarieses;
       this.deptEmps = deptEmps;
       this.deptManagers = deptManagers;
    }
   
    public int getEmpNo() {
        return this.empNo;
    }
    
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
    public Date getBirthDate() {
        return this.birthDate;
    }
    
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public Set<Titles> getTitleses() {
        return this.titleses;
    }
    
    public void setTitleses(Set<Titles> titleses) {
        this.titleses = titleses;
    }
    public Set<Salaries> getSalarieses() {
        return this.salarieses;
    }
    
    public void setSalarieses(Set<Salaries> salarieses) {
        this.salarieses = salarieses;
    }
    public Set<DeptEmp> getDeptEmps() {
        return this.deptEmps;
    }
    
    public void setDeptEmps(Set<DeptEmp> deptEmps) {
        this.deptEmps = deptEmps;
    }
    public Set<DeptManager> getDeptManagers() {
        return this.deptManagers;
    }
    
    public void setDeptManagers(Set<DeptManager> deptManagers) {
        this.deptManagers = deptManagers;
    }




}

