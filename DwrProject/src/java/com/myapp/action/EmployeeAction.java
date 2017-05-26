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

    public String getMessagefromAjax() {
        System.out.println("=================Get Message From Ajax===============");
        return "Hello Ajax from Server";
    }
}
