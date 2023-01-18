<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Web Form</title>
<link rel="stylesheet"href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap4.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.4.8/dist/sweetalert2.all.min.js"></script>

</head>
<body>

<div class="form-control text-red">${valid }</div>

<div class="container mt-3" style="margin-left: 200px">
<form action="/productWeb/saveData" method="post">
  <div class="form-group row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Product Name</label>
    <div class="col-sm-5">
      <select class="form-control" id="productId" name="productId">
      	<option >SELECT</option>
      	<c:forEach items="${product }" var="p">
      		<option value="${p.productId }">${p.productName }</option>
      	</c:forEach>
      </select>
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Quantity</label>
    <div class="col-sm-5">
      <input type="number" class="form-control" id="inputPassword" id = "availbleQty" name="availbleQty">
    </div>
  </div>
  
  <div>
  	<button class="btn btn-success">SUBMIT</button>
  	<input type="button" value="reset" class="btn btn-warning">
  </div>
  
</form>
</div>

</body>
</html>