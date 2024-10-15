<%-- 
    Document   : search_student
    Created on : 02 May 2024, 09:51:09
    Author     : Student
--%>

<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.models.ClassList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% 
       ClassList student = (ClassList)request.getAttribute("student");
        String img = "data:image/png;base64,"+Base64.getEncoder().encodeToString(student.getStu_photo());
        %>
    <body>
        <table border="1">
            <tbody>
                <tr>
                    <td>name:</td>
                    <td><%=student.getName()%></td>
                </tr>
                <tr>
                    <td>surname:</td>
                    <td><%=student.getSurname()%></td>
                </tr>
      
                <tr>
                    <td>Student Number:</td>
                    <td><%=student.getStudentNum()%></td>
                </tr>
                <tr>
                    <td>Photo:</td>
                    <td><img src="<%=img%>" alt="alt"/></td>
                </tr>
                <p>
                         click <a href="index.html">here</a> to go back to menu 
                </p>
            </tbody>
        </table>

      
    </body>
</html>
