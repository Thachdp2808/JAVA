<%-- 
    Document   : employee
    Created on : Feb 26, 2022, 8:10:09 PM
    Author     : admin
--%>

<%@page import="model.Employee"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <th>Street</th>
                    <th>City</th>
                    <th>ZIP code</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="emp" items="${employees}">
                <tr>
                    <td>${emp.name.firstname} </td>
                    <td>${emp.name.lastname} </td>
                    <td>${emp.address.street} </td>
                    <td>${emp.address.city} </td>
                    <td>${emp.address.zipCode} </td>
                </tr>
            </c:forEach>               
            </tbody>
        </table>

    </body>
</html>
