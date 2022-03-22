<%-- 
    Document   : nameObj2
    Created on : Feb 26, 2022, 7:09:38 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Name"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <table border="1">
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="name" items="${nameObjList}" >
                <tr>
                    <td>${name.firstname} </td>
                    <td>${name.lastname} </td>
                </tr>
            </c:forEach>

        </tbody>
    </table>
</body>
</html>
