/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.ClassListFacadeLocal;
import za.ac.tut.models.ClassList;


public class searchStudentServlet extends HttpServlet {
    @EJB ClassListFacadeLocal clf;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("====================================");
      Long stuNum = Long.parseLong(request.getParameter("studentnumber"));
        System.out.println("==========================");
        System.out.println(stuNum);
     ClassList student =clf.find(stuNum);
     if(student==null){
        request.getRequestDispatcher("notfound.html").forward(request, response); 
         
         
     }else{
       request.setAttribute("student", student);
        
       request.getRequestDispatcher("search_student.jsp").forward(request, response);   
     }
    }



}
