

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class bookservlet
 */
@WebServlet("/bookservlet")
public class bookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
        
               
        	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        		response.sendRedirect("Books.jsp");
        	}
        	
        	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        		
        				response.setContentType("text/html");
        				
        				PrintWriter out=response.getWriter();
        	try {
        		
        		Class.forName("com.mysql.cj.jdbc.Driver");
        		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
        		
        		String BookName=request.getParameter("Book Name");
        		String StudentName=request.getParameter("Student");
        		String ISBN=request.getParameter("ISBN");
        		String RegNo=request.getParameter("Reg");
        		
        		
        		String sql="insert into books (Book Name, Student, ISBN, Reg) VALUES(?,?,?,?)";
        		PreparedStatement pst=conn.prepareStatement(sql);
        		

        		pst.setString(1, BookName);
        		pst.setString(2, StudentName);
        		pst.setString(3, ISBN);
        		pst.setString(4, RegNo);
        		
        		int row=pst.executeUpdate();
        		if (row>0)
        		{
        			out.print("<h3>Proceed and Pick Your Book</h3>");
        			
        		}
        		else {
        			out.print("<h3>Failed</h3>");
        			
        		}
        		
        		conn.close();
        		
        	}
        	catch (Exception e) {
        		out.print("<h1> Try Again" +e.getMessage() +"</h1>");
        		
        	}
        	}

        }
	