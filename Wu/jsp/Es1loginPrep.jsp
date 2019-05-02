<%@ page contentType="text/html"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*,java.text.*"%>

<html>
    <body>
        <%
          String connection = "jdbc:sqlserver://213.140.22.237\\SQLEXPRESS:1433;databaseName=XFactor;user=wu.chong;password=xxx123#";
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection conn = DriverManager.getConnection(connection);
          
          String sql = "select * from Cittadino where username = ? and password = ?";
          
          PreparedStatement PrepStmt = conn.prepareStatement(sql);
          
          PrepStmt.setString (1, request.getParameter("username"));
          PrepStmt.setString (2, request.getParameter("psw"));
          
          ResultSet rs = PrepStmt.executeQuery();
          
          if(rs.next()){
              out.println(" Benvenuto " + rs.getString("username"));
              
              
              Statement stmt1 = conn.createStatement();
              String sql1 = "SELECT * FROM Evento inner join Communicazione C on Evento.ID = Communicazione.IDE inner join Cittadino Ci on C.IDC = Ci.ID ";
              ResultSet rs1 = stmt1.executeQuery(sql1);
              
              out.print("<table>");
			
			out.print("<tr><th align=left>Nome</th><th align=left>Descrizione</th></tr>");
			
    		while(rs1.next()){

				String nome = rs1.getString("nome");
				String descrizione = rs1.getString("descrizione");
                
                out.print("<tr><td>" + nome + "</td><td>" + descrizione + "</td></tr>");

	        }
	        
	        out.print("</table>");
	        
	        rs.close();
              
              
              
          }else{
              out.println("Utente non trovato " + request.getParameter("username")+ " o password sbagliata.");
          }
          
          rs.close();
          
          conn.close();
          %>