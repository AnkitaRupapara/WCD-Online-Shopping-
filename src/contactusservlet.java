import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/contactusservlet")
public class contactusservlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
 String name=req.getParameter("name");
 String lastname=req.getParameter("lastname");
 String email=req.getParameter("email");
 String comment=req.getParameter("comment");
 try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","Ankita2704");
		PreparedStatement ps =con.prepareStatement("insert into contact values(?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,lastname);
		ps.setString(3,email);
		ps.setString(4,comment);
		
		ps.executeUpdate();
		Email e=new Email(email, "Feedback Recieve",   "From Ankita Cloth Broject ");
		e.sendEmail();
		resp.sendRedirect("home.jsp");
		
	} catch (Exception e) {
		System.out.println(e);
		
	}
   
 
}

}
