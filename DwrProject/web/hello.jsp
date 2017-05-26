<%@page import="com.myapp.action.EmployeeAction"%>
<%
    String username = request.getParameter("username");
    String strResponse;
    if(username.equals("ravi"))
    {
com.myapp.action.EmployeeAction obj= new EmployeeAction();
strResponse = obj.getMessagefromAjax();
    }
    else
        strResponse="nothing";
%>

<%=strResponse %>
