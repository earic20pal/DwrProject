/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.dao;

/**
 *
 * @author ravi
 */
import com.myapp.pojo.Employees;
import com.myapp.util.NewHibernateUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ravi
 */
public class EmployeeDao {

    public List getAllEmployees(String empname) {
        
        SessionFactory factory = NewHibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Criteria crit = session.createCriteria(Employees.class);
        Disjunction or = Restrictions.disjunction();
        or.add(Restrictions.like("firstName", empname + "%"));
        or.add(Restrictions.like("lastName", empname + "%"));
        crit.add(or);
        List<Employees> employees = crit.list();
        List emplist = new LinkedList();
       for (Employees obj : employees) {
           String fullname=obj.getFirstName() +" "+obj.getLastName();
            emplist.add(fullname);
        }
        return emplist;
    }

}
