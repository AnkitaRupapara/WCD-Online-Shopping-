import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/AddClothServlet")
@MultipartConfig(maxFileSize=99999999999L)
public class AddClothServlet extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 {
	 String clothname=req.getParameter("clothname");
	 String clothbrand=req.getParameter("clothbrand");
	 float clothprice=Float.parseFloat(req.getParameter("clothprice"));
	 Part part=req.getPart("image");
	 InputStream is=part.getInputStream();
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","Ankita2704");
		PreparedStatement ps =con.prepareStatement("insert into clothes(clothname,clothbrand,clothprice,image)values(?,?,?,?)");
		ps.setString(1, clothname);
		ps.setString(2, clothbrand);
		ps.setFloat(3, clothprice);
		ps.setBlob(4, is);
		ps.executeUpdate();
		
		PrintWriter out=resp.getWriter();
		out.println("<script>"
				+"alert('Cloth added succesfully!!');"
				+"window.location='cloth.jsp'"
				+"</script>");
	} catch (Exception e) {
		System.out.print(e);
	}
}
}
