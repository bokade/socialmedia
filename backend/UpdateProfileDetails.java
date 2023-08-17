/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package in.sp.backend;

import in.sp.dbqueries.DbQueries;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author admin
 */
public class UpdateProfileDetails extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String name = request.getParameter("name1");
        String email = request.getParameter("email1");
        String gender = request.getParameter("gender1");
        String city = request.getParameter("city1");
        
        boolean status = DbQueries.updateProfile(name, email, gender, city);
        if(status)
        {
            HttpSession session = request.getSession();
            session.setAttribute("session_name", name);
            session.setAttribute("session_gender", gender);
            session.setAttribute("session_city", city);
            
            request.setAttribute("success_message", "User details updated successfully");
            RequestDispatcher rd1 = request.getRequestDispatcher("success.jsp");
            rd1.include(request, response);
            
            RequestDispatcher rd2 = request.getRequestDispatcher("edit-my-profile.jsp");
            rd2.include(request, response);
        }
        else
        {
            request.setAttribute("error_message", "User details not updated due to some error");
            RequestDispatcher rd1 = request.getRequestDispatcher("error.jsp");
            rd1.include(request, response);
            
            RequestDispatcher rd2 = request.getRequestDispatcher("edit-my-profile.jsp");
            rd2.include(request, response);
        }
    }

}
