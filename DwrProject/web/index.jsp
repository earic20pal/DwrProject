<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <script src='dwr/interface/EmployeeAction.js'></script>
        <script src='dwr/engine.js'></script>
        <script src='dwr/util.js'></script>  
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        <script>
            function call1()
            {
                EmployeeAction.getMessagefromDWR({callback: function (data) {
                        alert(data);
                    }
                });
            }
            function fill()
            {
                $(function () {
                   
                        var val = $('#username').val();
                        if (val.length > 0) {  // check length
                            EmployeeAction.getAllEmployees(val, function (data) {
                                $('#username').autocomplete({source:data});
                            });
                        } else {
                            $('#username').autocomplete({source: []});  // clean
                        }
                    
                });
            }
            function call2()
            {
                $.ajax({
                    type: "POST",
                    dataType: 'html',
                    url: "./EmployeeAction.htm?method=getMessagefromAjax",
                    success: function (response) {
                        // we have the response
                        alert("response is " + response)
                    },
                    error: function (e) {
                        alert('Error: ' + e);
                    }
                });
            }
        </script>
        <form method="post">
            <center><h4>Welcome to employee Database</h4></center>
            <div id="horizontalmenu">
<ul>
<li><a href="/loginaction">Employee</a></li>
<li><a href="http://www.siteground.com/tutorials/">Department</a>
<ul>
<li><a href="http://www.siteground.com/tutorials/cssbasics/index.htm">Salaries</a></li>
<li><a href="http://www.siteground.com/tutorials/flash/index.htm">Managers</a></li>
</ul>
</li>
<li><a href="#">More</a>
<ul>
<li><a href="http://www.siteground.com/about_us.htm">Titles</a></li>
</ul>
</li>
</ul>
</div>
            <table>
                <tr>
                    <td>
                <tr><h4>Using DWR</h4></tr><br>
                <tr>AutoComplete<input type="text" id="username" placeholder="Search Employee by name" name="username" onkeyup="fill()"/></tr><br>
                <tr>Get Message From Server<input type="text" id="username" name="username"/><input type="button" value="Dwr" onclick="call1()"/></tr><br>
                <tr>Get List from Database<input type="text" id="username" name="username"/></tr><br>
                </td>

                <tr>
                    <td>
                <tr><h4>Using AJAx</h4></tr><br>
                <tr>AutoComplete<input type="text" id="username" name="username"/></tr><br>
                <tr>Get Message From Server<input type="text" id="username" name="username"/><input type="button" value="Ajax" onclick="call2()"/></tr><br>
                <tr>Get List from Database<input type="text" id="username" name="username"/></tr><br>
                </td>

                </tr>
            </table>
            <input type="hidden" id="method" name="method"/>
        </form>
    </body>
</html:html>
<%@page contentType="text/html"%>