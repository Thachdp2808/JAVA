<%-- 
    Document   : login
    Created on : Feb 15, 2022, 11:06:36 PM
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
        <form>
            <table>
                <tr>
		   <td>User:</td><td><input type="text" name="a"/></td>
		</tr>
		<tr>
                    //Sử dụng pattern như regex để định dạng nhập vào
                    //title để hiển thị lỗi
		   <td>Password:</td><td><input type="text" name="b" pattern="[0-9a-z]{1,20}" title="nhap sai"/></td>
		</tr>
                <tr>
                    <td><button type="submit">Loggin</button></td>
                </tr>
            </table>

        </form>
    </body>
</html>
