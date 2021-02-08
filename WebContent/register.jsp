<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<center>
<form action="RegistrartionServlet" method="post" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Enter Your Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="name" placeholder="Enter Your Name">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Enter Your Lastname</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="lastname" placeholder="Enter Your Lastname">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Enter Your Username</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="username" placeholder="Enter Your Username">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Enter Your Email</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="email" placeholder="Enter Your Email">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Enter Your Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputEmail3" name="password" placeholder="Enter Your Password">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">Enter Your Contact Number</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputEmail3" name="contact" placeholder="Enter Your Contact Number">
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
  </center>
</body>
</html>