<%-- 
    Document   : viewAll_student
    Created on : 02 May 2024, 10:20:18
    Author     : Student
--%>

<%@page import="java.util.Base64"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.models.ClassList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        
         
        List<ClassList> students = (List<ClassList>)request.getAttribute("allstudents");
        
        
        %>
    <body>
        
        
        <% for (int i = 0; i < students.size(); i++) {  
        
        
        String img = "data:image/png;base64,"+Base64.getEncoder().encodeToString(students.get(i).getStu_photo());
        %>
    

           <table border="1">
            <tbody>
                <tr>
                    <td>name:</td>
                    <td><%=students.get(i).getName()%></td>
                </tr>
                <tr>
                    <td>surname:</td>
                    <td><%=students.get(i).getSurname()%></td>
                </tr>
      
                <tr>
                    <td>Student Number:</td>
                    <td><%=students.get(i).getStudentNum()%></td>
                </tr>
                <tr>
                    <td>Photo:</td>
                    <td><img src="<%=img%>" alt="alt"/></td>
                </tr>
                
            </tbody>
        </table>
        <%}%>
        <p>
                         click <a href="index.html">here</a> to go back to menu 
        </p>
        
    </body>
</html>
