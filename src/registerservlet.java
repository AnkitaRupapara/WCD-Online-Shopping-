import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegistrartionServlet")
public class registerservlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		String lastname=req.getParameter("lastname");
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String contact=req.getParameter("contact");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","Ankita2704");
			PreparedStatement ps =con.prepareStatement("insert into register(name,lastname,username,email,password,contact,role) values(?,?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,lastname);
			ps.setString(3,username);
			ps.setString(4,email);
			ps.setString(5,password);
			ps.setString(6,contact);
			ps.setString(7,"user");
			ps.executeUpdate();
			Email e=new Email(email, "Registered Sucessfully!!!",   "Welcome to Wcd Cloth Broject ");
			e.sendEmail();
			resp.sendRedirect("home.jsp");
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
