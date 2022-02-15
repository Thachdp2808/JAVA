

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Student</title>
        <% String err = (String) request.getAttribute("err");%>
    </head>
    <body>
        <form action="create" method="post">
            <table>
                <tr>
                    <td>Name:</td><td><input type="text" name="name" value=""/></td>
                </tr>
                <tr>
                    <td>Gender:</td><td><input type="radio" name="Gender" checked value="Male"/>Male
                        <input type="radio" name="Gender" value="Female"/>Female</td>
                </tr>
                <tr>
                    <td>DOB:</td><td><input type="date" name="DOB" value=""/></td>
                </tr>
                <tr><td><input type="submit" value="Create"/></td></tr>
            </table>

        </form>
        <% if (err != null){ %>
        <p name ="err" type="text" ><%=err%></p>
        <%}%>
    </body>
</html>
