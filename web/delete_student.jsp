<%-- 
    Document   : delete_student
    Created on : 02 May 2024, 10:38:25
    Author     : Student
--%>

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
        
        %>
    <body>
        <p>
            <b><%=student.getName()%> <%=student.getSurname()%></b> has been deleted from the database
            
        </p>
        <p>
                         click <a href="index.html">here</a> to go back to menu 
         </p>
    </body>
</html>
