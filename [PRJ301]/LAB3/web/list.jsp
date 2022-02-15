

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import = "model.Student" %>
<%@page import = "java.util.*" %>
<%
  ArrayList<Student> lst = (ArrayList<Student>) request.getAttribute("lst");
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Student</title>
    </head>
    <body>
        <table border="1">
      <tr>
        <td> ID </td>
        <td> Name </td>
        <td> Gender </td>
        <td> DOB </td>
        <td></td>
      </tr>
      <%
        for(Student x: lst) {
      %>
      <tr>
        <td><%= x.getID()%> </td>
        <td><%= x.getName() %> </td>
        <td><%= x.getGender()%> </td>
        <td><%= x.getDOB() %></td>
        <td><a href="update?Id=<%=x.getID()%>">Update</a> 
            <a href="#" onclick = "Delete(<%=x.getID()%>)">Delete</a>
      </tr>  
      <% } %>
    </table>
      <a href="create">Create</a>
    </body>
    <script>
       function Delete(id){
           var option = confirm('Are you sure to delete?');
           if(option === true) {
               window.location.href = 'delete?Id=' + id;
           }
       }
   </script>
</html>
