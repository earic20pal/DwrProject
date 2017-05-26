package com.myapp.pojo;
// Generated May 25, 2017 8:05:23 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Departments generated by hbm2java
 */
public class Departments  implements java.io.Serializable {


     private String deptNo;
     private String deptName;
     private Set<DeptEmp> deptEmps = new HashSet<DeptEmp>(0);
     private Set<DeptManager> deptManagers = new HashSet<DeptManager>(0);

    public Departments() {
    }

	
    public Departments(String deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }
    public Departments(String deptNo, String deptName, Set<DeptEmp> deptEmps, Set<DeptManager> deptManagers) {
       this.deptNo = deptNo;
       this.deptName = deptName;
       this.deptEmps = deptEmps;
       this.deptManagers = deptManagers;
    }
   
    public String getDeptNo() {
        return this.deptNo;
    }
    
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }
    public String getDeptName() {
        return this.deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
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

