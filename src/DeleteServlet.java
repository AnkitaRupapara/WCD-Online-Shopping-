import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int clothid=Integer.parseInt(req.getParameter("clothid"));
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","Ankita2704");
		PreparedStatement ps =con.prepareStatement("delete from clothes where clothid=?");
		ps.setInt(1, clothid);
		ps.executeUpdate();
		PrintWriter out=resp.getWriter();
		out.println("<script>"
				+"alert('Cloth delete succesfully!');"
				+"window.location='cloth.jsp'"
				+"</script>");
	} 
	catch (Exception e) 
	
	{
		System.out.println(e);
	}
}
}
