<%-- 
    Document   : index-header
    Created on : 11-Apr-2023, 2:41:15 pm
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>

<html>
    <head>
        <title>Social Network</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
        <div class="container-fluid bg-primary header_div">
            <div class="container">
                <div class="row">
                    <div class="col-4">
                        <a href="index.html" class="navbar-brand text-light">Social Network</a>
                    </div>
                    <div class="col-3">
                        
                    </div>
                    <div class="col-5">
                        <%@include file="login.jsp" %>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
