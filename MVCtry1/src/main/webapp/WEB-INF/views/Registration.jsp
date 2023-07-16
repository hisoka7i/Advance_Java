<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</head>
<body>
<%@include file="Navbar.jsp" %>

<form method="post" action="add">
<div class="row m-4">
  <div class="col-auto">
    <label for="staticEmail1" class="visually">Enter you name here</label>
    <input type="text" class="form-control" name="regName" id="staticEmail1" >
  </div>

  <div class="col-auto">
    <label for="staticEmail2" class="visually">Email</label>
    <input type="text" class="form-control" id="staticEmail2" name="regEmail" placeholder="email@example.com">
</div>
  <div class="col-auto">
    <label for="inputPassword2" class="visually">Password</label>
    <input type="password" class="form-control" id="inputPassword2" name="regPass" placeholder="Password">
  </div>
<div class="col-auto">
 <label for="staticEmail2" class="visually">Type of user</label>
    <input type="text" class="form-control" name="regType" id="staticEmail2" >
</div>
<div class="col-auto">
 <label for="staticEmail3" class="visually">Gender</label>
    <input type="text" class="form-control" name="regGen"  id="staticEmail3" >
</div>
<div class="col-auto mt-3">
    <button type="submit" class="btn btn-primary mb-3">Confirm identity</button>
  </div>
</div>

</form>
</body>
</html>