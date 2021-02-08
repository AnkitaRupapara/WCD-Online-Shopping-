<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%
session.removeAttribute("role");
session.invalidate();
%>
<jsp:include page="Header.jsp"></jsp:include>
<form action="LoginServlet" method="post" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
  <div class="form-group row">
    <label for="inputEmail3" class="control-label col-sm-2">Enter Your Username</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="Username" placeholder="Enter Your Username">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="control-label col-sm-2">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="password" id="inputPassword3" placeholder="Password">
    </div>
  </div>


  <div class="form-group row">
    <div class="col-sm-2"></div>
    <div class="col-sm-10">
      <button type="Submit" value="Login" class="btn btn-outline-primary">Sign in</button>
  
      <button type="Reset"  value="reset" class="btn btn-outline-danger">Reset</button>
     
    </div>
  </div>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>