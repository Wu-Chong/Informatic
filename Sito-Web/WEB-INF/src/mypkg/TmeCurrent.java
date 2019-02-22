package mypkg;

import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
 
public class TmeCurrent extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8"); //charset carattere impostanto su Europa
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
 
      // Write the response message, in an HTML page
      try {
         String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ITALY).format(Calendar.getInstance().getTime());
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Time Current</title></head>");
         out.println("<body>");
         out.println("<h1>"+ timeStamp +"</h1>");  // says Hello
         // Echo client's request information
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