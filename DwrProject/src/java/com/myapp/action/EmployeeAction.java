/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.action;

import com.myapp.dao.EmployeeDao;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author ravi
 */
public class EmployeeAction extends DispatchAction {

    public String getMessagefromDWR() {
        return "Hello DWR from Server";
    }

     public ActionForward login(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response)
        throws Exception {

        String uname=request.getParameter("Username");
        String pwd=request.getParameter("password");
        if(uname.equals("ravi"))
        {
            if(pwd.equals("ravi"))
            {
                return mapping.findForward("success");
            }
            else
                return mapping.findForward("error");
        }
		

		return mapping.findForward("error");
	}
    public List getAllEmployees(String empname) {
        System.out.println("=================Get Message From Ajax===============");
        List employee = new LinkedList();
        EmployeeDao empdao= new EmployeeDao();
        employee=empdao.getAllEmployees(empname);
        return employee;
    }
    public Map getDetails(String empname) {
        System.out.println("=================Get Message From Ajax===============");
        Map employee = new HashMap();
        EmployeeDao empdao= new EmployeeDao();
        employee=empdao.getDetails(empname);
        return employee;
    }

    public String getMessagefromAjax() {
        EmployeeDao empdao= new EmployeeDao();
        String data=empdao.getAllEmployees();
        return data;
//        return "<h4>Hello Ajax from Server</h4>";
    }
    public ActionForward UpdateEmp(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response)
    {
        String empno=request.getParameter("empno");
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String birth_date=request.getParameter("birth_date");
        String hire_date=request.getParameter("hire_date");
        String gender=request.getParameter("gender");
        EmployeeDao empdao= new EmployeeDao();
        empdao.updateEmployeeDetails(empno,firstname,lastname,birth_date,hire_date,gender);
        return mapping.findForward("success");
    }
    public ActionForward DeleteEmp(ActionMapping mapping,ActionForm form,
		HttpServletRequest request,HttpServletResponse response)
    {
        String empno=request.getParameter("empno");
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String birth_date=request.getParameter("birth_date");
        String hire_date=request.getParameter("hire_date");
        String gender=request.getParameter("gender");
        EmployeeDao empdao= new EmployeeDao();
        empdao.deleteEmployeeDetails(empno,firstname,lastname,birth_date,hire_date,gender);
        return mapping.findForward("success");
    }
}
