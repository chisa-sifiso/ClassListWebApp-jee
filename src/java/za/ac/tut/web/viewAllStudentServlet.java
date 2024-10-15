/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.ClassListFacadeLocal;
import za.ac.tut.models.ClassList;

/**
 *
 * @author Student
 */
public class viewAllStudentServlet extends HttpServlet {
   @EJB ClassListFacadeLocal clf;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       List<ClassList> allstudents = clf.findAll();
       request.setAttribute("allstudents", allstudents);
       request.getRequestDispatcher("viewAll_student.jsp").forward(request, response); 
        
        
    }



}
