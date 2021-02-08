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
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet
{
@Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
	int clothid=Integer.parseInt(req.getParameter("clothid"));
	 String clothname=req.getParameter("clothname");
	 String clothbrand=req.getParameter("clothbrand");
	 float clothprice=Float.parseFloat(req.getParameter("clothprice"));
	 
	 try
	 {
		 Class.forName("com.mysql.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","Ankita2704");
			PreparedStatement ps =con.prepareStatement("update clothes set clothname=?,clothbrand=?,clothprice=? where clothid=?");
		    ps.setString(1, clothname);
		    ps.setString(2, clothbrand);
		    ps.setFloat(3, clothprice);
		    ps.setInt(4, clothid);
		    ps.executeUpdate();
		    PrintWriter out=resp.getWriter();
			out.println("<script>"
					+"alert('Cloth Update succesfully!!');"
					+"window.location='cloth.jsp'"
					+"</script>");
		    
	  }
	 catch (Exception e)
	 {
		System.out.println(e);
	}
  }
}
