<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link type="text" rel="stylesheet" href="css/listEmp.css">
</head>
<body>
<table>
   <tr>
    <td class="heading">User Name</td>
    <td class="heading">First Name</td>
    <td class="heading">Last Name</td>
    <td class="heading">Birthday</td>
    <td class="heading">Gender</td>
    <td class="heading">Address</td>
    <td class="heading">City</td>
    <td class="heading">State</td>
    <td class="heading">Country</td>
    <td class="heading">PIN</td>
    <td class="heading">Phone Number</td>
    <td class="heading">Email</td>
    <td class="heading">Actions</td>
   </tr>
   <c:forEach  var="user" items="${userList}">
    <tr>
     <td>${user.userName}</td>
     <td>${user.firstName}</td>
     <td>${user.lastName}</td>
     <td>${user.dateOfBirth}</td>
     <td>${user.gender}</td>
     <td>${user.address}</td>
     <td>${user.city}</td>
     <td>${user.state}</td>
     <td>${user.country}</td>
     <td>${user.PIN}</td>
     <td>${user.phone}</td>
     <td>${user.emailId}</td>
     
     <td><form action="/EMSUsingSpringMVC/updateEmployee" method="post">
	 <button name="userName" value="${user.userName}">Update</button>
	 </form>
	 <form action="/EMSUsingSpringMVC/delete" method="post">
	 <button name="userName" value="${user.userName}">Delete</button>
	 </form>
	 </td>
	 </tr>
    </c:forEach>
  </table>
</body>
</html>