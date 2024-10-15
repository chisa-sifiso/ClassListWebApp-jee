/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.security.Timestamp;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import za.ac.tut.bl.ClassListFacadeLocal;
import za.ac.tut.models.ClassList;

@MultipartConfig
public class addStudentServlet extends HttpServlet {
@EJB ClassListFacadeLocal clf;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Long stuNum = Long.parseLong(request.getParameter("studentnumber"));
       
       String name = request.getParameter("name");
       String surname = request.getParameter("surname");
       Part file = request.getPart("file");
       
       
       byte[] photo_source = new byte[0];
       if(file.getContentType()!=null){
           InputStream input = file.getInputStream();
           //convecting the file into byte
           ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int byte_num=0;
            while ((byte_num=input.read(buffer))!=-1) {               
               baos.write(buffer, 0, byte_num);
           }
          photo_source = baos.toByteArray();
           
       }
        
        ClassList cl = new ClassList();
        cl.setId(stuNum);
        cl.setName(name);
        cl.setStu_photo(photo_source);
        cl.setSurname(surname);
        Date time = new Date(System.currentTimeMillis());
        cl.setTime(time);
        request.setAttribute("cl", cl);
        
        clf.create(cl);
        request.getRequestDispatcher("add_student_outcome.jsp").forward(request, response);
        
    }


}
