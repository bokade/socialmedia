/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package in.sp.backend;

import in.sp.dbqueries.DbQueries;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LikeStatus extends HttpServlet
{

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        
        String statusid = request.getParameter("statusid");
        
        
        HttpSession session = request.getSession();
        String session_email = (String) session.getAttribute("session_email");
        
        boolean status = DbQueries.likeStatus(statusid, session_email);
        if(status)
        {
            out.write("<i class=\"bi bi-hand-thumbs-up-fill\"id=\"");
            out.print(statusid);
            out.write("\"onclick=\"dislikeStatus(");
            out.print(statusid);
            out.write(")\"></i>");
        }
        else
        {
            out.write("<i class=\"bi bi-hand-thumbs-up\"id=\"");
            out.print(statusid);
            out.write("\"onclick=\"likeStatus(");
            out.print(statusid);
            out.write(")\"></i>");
        }
    }

}
