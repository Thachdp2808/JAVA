<%-- 
    Document   : Paging
    Created on : Mar 7, 2022, 6:16:14 PM
    Author     : Happy-2001
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Person"%>
<%@page import="model.Person"%>
<%@page import="model.PersonDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <%
            PersonDAO pd = new PersonDAO();
        int totalPage = pd.totalPage();
        String index = request.getParameter("index");
        if (index == null) {
            index = "1";
        }
        ArrayList<Person> lp = pd.pagePerson(Integer.parseInt(index));
        request.setAttribute("lp", lp);
        if (totalPage % 6 != 0) {
            totalPage = totalPage / 6 + 1;
        } else {
            totalPage = totalPage / 6;
        }
            %>
        <table border="1" style="width: 500px;text-align: center">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
                <% for (Person s : lp) {%>
                    <tr>
                        <td><%=s.getId()%></td>
                        <td><%=s.getName()%></td>
                    </tr>
               <%}%>
            </tbody>
        </table>


        
            <%for(int i=0;i<lp.size();i++)  {%>          
            <a href="person?index=<%=i%>"><%=i%></a>
        <%}%>
    

