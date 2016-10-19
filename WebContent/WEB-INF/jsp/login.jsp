<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<body>
<div >

<img alt="Employee Management System Logo" src="images/ems.jpg"><br>
</div>
<div class="login">

Please Login
<p>${message}</p>
<form method="post" action="/EMSUsingSpringMVC/loginSecurityCheck" modelAttribute="user">
<input style="line-height: 2.0;" type="text" name="username" placeholder="Username" required><br/>
<input style="line-height: 2.0;" type="password" name="password" placeholder="Password" required></br>
<input id="si" type="submit" value="Sign in"/>
</form>

</div>
</body>
</html>