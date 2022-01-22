<%-- 
    Document   : Student
    Created on : Jan 22, 2022, 10:47:39 PM
    Author     : Happy-2001
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <% SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");%>
        <%
            ArrayList<Student> students
                    = (ArrayList<Student>) request.getAttribute("students");
        %>     
    </head>
    <form action="StudentServlet"  method="post">
    Number of Students: <input type="text" name="num" size="10" value="${students.size()}" />
    <input type="submit" value="Generate" />
    <table border="1">
        <tr>
            <td>ID</td> 
            <td>Name</td>
            <td>Gender</td>
            <td>DOB</td>
        </tr>
        <% for (Student s : students) {%>
        <tr>
            <td><%=s.getId()%></td> 
            <td><%=s.getName()%></td>
            <td><input type="checkbox" <%= s.isGender()? "checked":"" %> /></td>
            <td><%=SDF.format(s.getDOB())%></td>
        </tr>
        <%}%>
    </table>
    </form>

</html>
