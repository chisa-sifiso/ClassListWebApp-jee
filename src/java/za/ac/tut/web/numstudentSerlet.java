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

/**
 *
 * @author Student
 */
public class numstudentSerlet extends HttpServlet {


    @EJB ClassListFacadeLocal clf;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     int count = clf.count();
     request.setAttribute("count", count);
     request.getRequestDispatcher("numberofstu.jsp").forward(request, response);   
     
    }

 

}
