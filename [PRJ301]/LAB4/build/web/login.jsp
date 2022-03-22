<%-- 
    Document   : login
    Created on : Mar 7, 2022, 11:24:58 PM
    Author     : Happy-2001
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST">
            User name:<input type="text"  name="username"  value="${user}" />
            <p>
                Password:<input type="password"  name="password"  value="${pass}"/>
                ${mess}
            <p>
                <input name="remember" value="true" type="checkbox" id="exampleCheck1">
                <label  for="exampleCheck1">Remember me</label></br>
                <input type="submit" value="login"/>

        </form>
    </body>
</html>
