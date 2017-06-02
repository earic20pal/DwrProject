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
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
            String fullname = obj.getFirstName() + " " + obj.getLastName();
            emplist.add(fullname);
        }
        return emplist;
    }

    public Map getDetails(String empname) {

        String[] str = empname.split(" ");

        SessionFactory factory = NewHibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Criteria crit = session.createCriteria(Employees.class);

        crit.add(Restrictions.eq("firstName", str[0]));
        crit.add(Restrictions.eq("lastName", str[1]));
        List<Employees> employees = crit.list();
        Map emplist = new HashMap();
        for (Employees obj : employees) {
            emplist.put("BirthDate", obj.getBirthDate());
            emplist.put("EmpNo", obj.getEmpNo());
            emplist.put("gender", obj.getGender());
            emplist.put("hiredate", obj.getHireDate());
            emplist.put("firstname", obj.getFirstName());
            emplist.put("lastname", obj.getLastName());
        }
        return emplist;
    }

    public void updateEmployeeDetails(String empno, String firstname, String lastname, String birth_date, String hire_date, String gender) {
        SessionFactory factory = NewHibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        try {
            System.out.println("emp no is " + empno);
            int i = Integer.parseInt(empno);
            Employees emp = (Employees) session.get(Employees.class, i);
            emp.setFirstName(firstname);
            session.update(emp);
            tr.commit();

        } catch (Exception ex) {
            tr.rollback();
        } finally {
            session.close();
        }

    }

    public void deleteEmployeeDetails(String empno, String firstname, String lastname, String birth_date, String hire_date, String gender) {
        SessionFactory factory = NewHibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tr = session.beginTransaction();
        Integer i = Integer.parseInt(empno);
        Employees emp = (Employees) session.get(Employees.class, i);
        emp.setFirstName(firstname);
        session.delete(emp);
        tr.commit();
        session.close();

    }

    public String getAllEmployees() {
        SessionFactory factory = NewHibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
         StringBuilder builder=  new StringBuilder();
        try {
            SQLQuery query=session.createSQLQuery("select * from employees");
            List<Object[]> rows= query.list();
            int start=0;
           
            builder.append("<table>");
            for(Object[] obj: rows)
            {
                builder.append("<tr>");
                String empid=obj[0].toString();
                builder.append("<td>"+empid+"</td>");
                String birthdate=obj[1].toString();
                 builder.append("<td>"+birthdate+"</td>");
                String firstname=obj[2].toString();
                 builder.append("<td>"+firstname+"</td>");
                String lastname=obj[3].toString();
                 builder.append("<td>"+lastname+"</td>");
                String gender=obj[4].toString();
                 builder.append("<td>"+gender+"</td>");
                String hiredate=obj[5].toString();
                 builder.append("<td>"+hiredate+"</td>");
                builder.append("</tr><br>");    
            }
            builder.append("</table>");
            tx.commit();

        } catch (Exception ex) {
            tx.rollback();
        } finally {
            session.close();

        }
        return builder.toString();

    }

}
