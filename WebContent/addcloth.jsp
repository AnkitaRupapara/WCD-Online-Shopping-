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
		<form action="AddClothServlet" method="post" class="col-lg-6 col-md-6 col-sm-12 col-xs-12" enctype="multipart/form-data">
			<div class="form-group">
				<label>Enter Cloth Name</label>
				<input type="text" name="clothname" placeholder="Enter Cloth Name" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Cloth Brand</label>
				<input type="text" name="clothbrand" placeholder="Enter Cloth Brand" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Cloth Price</label>
				<input type="text" name="clothprice" placeholder="Enter Cloth Price" class="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Select File</label>
				<input type="file" name="image" accept="image/*" placeholder="Select Image" class="form-control"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Add Cloth" class="btn btn-primary btn-block"/>
				<input type="reset" value="Reset" class="btn btn-danger btn-block"/>
			</div>
		</form>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>