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

<!--  Login Card -->
<div class="row">
<div class="d-print-inline card text-center m-2 " style="width: 18rem;">
  <img src="https://cdn-icons-png.flaticon.com/512/5087/5087579.png" class="card-img-top" alt="Login Image">
  <div class="card-body">
  <a href="http://localhost:8080/MVCtry1/mylogin/login">
    <p class="card-text">Click Here to go to Login Page</p></a>
  </div>

</div>

<!--  Registration Card -->
<div class="card text-center m-2" style="width: 18rem;">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeNh82HZOWMPwSSjkKf3xsyCMW8aF9axE28A&usqp=CAU" class="card-img-top" alt="Registration Image">
  <div class="card-body">
  <a href="myregister/register">
    <p class="card-text">Click here to go to Registration page</p></a>
  </div>
</div>
</div>
</body>
</html>