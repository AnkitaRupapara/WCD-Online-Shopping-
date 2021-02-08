<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<sql:setDataSource driver="com.mysql.jdbc.Driver"
                    url="jdbc:mysql://localhost:3306/online"
                    user="root"
                    password="Ankita2704"
                    var="con"/>
   <c:if test="${parm.clothname!=null}">
   <sql:query var="rs" dataSource="${con}">
   select * from clothes where Clothname like '%' ? '%'
   <sql:param>${param.clothname}</sql:param>
   </sql:query>
   
   </c:if>
   <c:if test="${param.clothname==null}">
   <sql:query var="rs" dataSource="${con}">
  select * from clothes
  </sql:query>
   </c:if>
   <div class="container">
			<div class="row">
			<c:forEach items="${rs.rows}" var="row">
				<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 text-center" style="border:1px solid black;">
					<img src="ImageServlet?clothid=${row.clothid}" height="300px" class="col-lg-12"/>
					<h3>${row.clothname}</h3>
					<p>${row.clothbrand}</p>
					<p>${row.clothprice}</p>
					<p>
						<c:if test="${row.clothprice>0}">
							<a href="buy.jsp"  class="btn btn-primary btn-block">Buy</a>
						</c:if>
					</p>
					
					<p>
						<c:if test="${role=='admin'}">
							<a class="btn btn-primary btn-block" href="edit.jsp?cid=${row.clothid}&cn=${row.clothname}&cb=${row.clothbrand}&cp=${row.clothprice}">Edit</a><a class="btn btn-danger btn-block" href="DeleteServlet?clothid=${row.clothid}">Delete</a></
						</c:if>
					</p>
				</div>
		</c:forEach>
		</div>
	</div>

 <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>