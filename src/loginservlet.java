import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class loginservlet extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String username =req.getParameter("Username");
	String password=req.getParameter("password");
  try 
	{
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","Ankita2704");
     PreparedStatement ps=con.prepareStatement("select * from register where Username=? and password=?");
     ps.setString(1, username);
     ps.setString(2,password);
     ResultSet rs=ps.executeQuery();
     resp.setContentType("text/html");
     PrintWriter out=resp.getWriter();
     
     if(rs.next())
    	 
     {
    	 HttpSession hs=req.getSession();
    	 hs.setAttribute("role", rs.getString("role"));
    	 out.print("<script>"
    			 +"alert('Welcome "+username+"');"
    			 +"window.location='cloth.jsp'"
    			 +"</script>");
     }
     else
     {
    	 out.println("<script>"
    			 +"alert('inocrrect username')"
    			 +"</script>");
    	 
     }
	
	} catch (Exception e)
	{
	 System.out.println(e);
	}
}
}
