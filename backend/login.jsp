<%-- 
    Document   : login
    Created on : 09-Apr-2023, 1:53:16 pm
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Login" method="post" class="form-inline">
            <input type="text" placeholder="Enter Email" class="textfield_design" name="email1" id="inlineFormInputName2" />
            <input type="password" placeholder="Enter Password" class="textfield_design" name="pass1" id="inlineFormInputGroupUsername2"/>
            <input type="submit" value="Login" class="btn btn-warning" />
        </form>
    </body>
</html>
