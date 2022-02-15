
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>
        <%
            Student s = (Student) request.getAttribute("student");
        %>
        <form action="update" method="POST">
            <table>
                <tr>
                    <td>ID:</td><td style="border: 1px solid black"><%= s.getID() %><input type="hidden" name="Id" value="<%= s.getID() %>"></td>
                </tr>
                <tr>
                    <td>Name:</td><td><input type="text" name="name" value="<%= s.getName()%>"/></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td><input type="radio" name="Gender" value="Male" <%=s.getGender().equalsIgnoreCase("Male") ? "checked" : ""%>/>Male
                        <input type="radio" name="Gender" value="Female" <%=s.getGender().equalsIgnoreCase("Female") ? "checked" : ""%>/>Female</td>
                </tr>
                <tr>
                    <td>DOB:</td><td><input type="date" name="DOB" value="<%= s.getDOB()%>"/></td>
                </tr>
                <tr><td><input type="submit" value="Update"/></td></tr>
            </table>
        </form>
    </body>
</html>
