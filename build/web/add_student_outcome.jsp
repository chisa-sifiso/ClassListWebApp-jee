<%-- 
    Document   : add_student_outcome
    Created on : 02 May 2024, 09:28:55
    Author     : Student
--%>

<%@page import="za.ac.tut.models.ClassList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JS</title>
    </head>
    <%
        ClassList cl = (ClassList)request.getAttribute("cl");
        
        %>
    <body>
        <p>
            <b> <%=cl.getName()%> <%=cl.getSurname()%> has been added to the database.<br>
                time:<%=cl.getTime()%>
            
        </p>
        <p>
            click <a href="index.html">here</a> to go back to menu 
        </p> 
        
        
    </body>
</html>
