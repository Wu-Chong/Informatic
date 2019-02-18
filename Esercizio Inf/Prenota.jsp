<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
        <title>Date</title>
    </head>
    <body>
    
        <%  if ( request.getParameter("cognome") == ""){ %>
        <p>Name: Attenzione! Inserire il cognome</p>
        <% } else {%>
        <p>Benvenuto: <%= request.getParameter("cognome") %></p>
        <% }%>
        
        <%  if ( request.getParameter("Classe") == ""){ %>
        <p>Name: Attenzione! Inserire la classe</p>
        <% } else {%>
        <p>Classe: <%= request.getParameter("Classe") %></p>
        <% }%>
        
        <%  if ("Si".equals(request.getParameter("scelta"))) { %>
        <p>Ha svolto il compito di Informantica.</p>
        <% }%>
        
        <% if (request.getParameter("prof") == "") {%>
        <p>Scegli 1 o più prof.</p>
        <% } else {%>
        <p> Colloquio con<% String []val = request.getParameterValues("prof");
        for(int i = 0; i < val.length; i++){
            out.println(val[i] + ", ");
        }
        %></p> 
        <% }%>
        
    </body>
</html>