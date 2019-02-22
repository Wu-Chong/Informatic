package mypkg;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class gestioneAppuntamenti extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      
       try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Date</title></head>");
         out.println("<body>");
         
         
         out.println("<form method='get' action='prenota'>");
         out.println("Inserisci il tuo cognome:<br><br>");
         out.println("<input type='text' name='cognome' value='cognome'>");
         out.println("<br><br><input type='submit' value='SEND'>");
         out.println("</form>");
         
         
         out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
         out.println("<p>Protocol: " + request.getProtocol() + "</p>");
         out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
         out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>"); //prende l'indirizzo IP del cliente
         // Generate a random number upon each request
         out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
      
   }
}