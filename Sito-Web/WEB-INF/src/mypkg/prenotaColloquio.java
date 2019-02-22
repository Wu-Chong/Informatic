package mypkg;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class prenotaColloquio extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      
      try {
          String cognome = request.getParameter("cognome");

         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Date</title></head>");
         out.println("<body>");
         
         if (cognome == null)
                {
            out.println("<p>Name: Attenzione! Inserire il cognome</p>");
         } else {
            out.println("<p>Benvenuto: " + cognome + "</p>");
         }
         
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
      
      
    }
 
}