<%-- 
    Document   : numberofstu
    Created on : 02 May 2024, 10:46:41
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        
         int numOfStu = Integer.parseInt(request.getAttribute("count").toString());
        %>
    <body>
        <p>
            
            <b><%=numOfStu%></b> are in your class. 
            
            
        </p>
        <p>
                         click <a href="index.html">here</a> to go back to menu 
        </p>   
          
    </body>
</html>
