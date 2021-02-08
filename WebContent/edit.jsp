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
<div class="container">
		<form action="UpdateServlet" method="post" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
			<div class="form-group">
				<label></label>
				<input type="hidden" name="clothid" placeholder="" value="${ param.cid}" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Cloth Name</label>
				<input type="text" name="clothname" placeholder="Enter Cloth Name" value="${ param.cn}" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Brand</label>
				<input type="text" name="clothnrand" placeholder="Enter Brand" value="${ param.cb}" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Price</label>
				<input type="text" name="clothprice" placeholder="Enter Price" value="${ param.cp}" class="form-control"/>
			</div>
			
			<div class="form-group">
				<input type="submit" value="Update Cloth" class="btn btn-primary btn-block"/>
				<input type="reset" value="Reset" class="btn btn-danger btn-block"/>
			</div>
		</form>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>