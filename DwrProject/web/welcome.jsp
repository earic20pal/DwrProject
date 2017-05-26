<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <script src='dwr/interface/LoginAction.js'></script>
        <script src='dwr/engine.js'></script>
        <script src='dwr/util.js'></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        <script>
            function Gotohome()
            {
                                document.forms[0].action="LoginAction.htm";
                                document.forms[0].method.value="login";
                                document.forms[0].submit();
            }
            
            </script>
        
        <form method="POST">
            <div>
                <h4>Welcome to employee Database</h4>
                <h4>Enter your credential</h4>
                uname<input type="text" name="Username" id="Username"/><br>
                pwd<input type="password" name="password" id="password"/><br>
                <input type="button" name="Login" value="click me!" onclick="Gotohome()"/>
            </div>
            
           <input type="hidden" name="method" id="method"/>
        </form>
        
    </body>
</html:html>
<%@page contentType="text/html"%>