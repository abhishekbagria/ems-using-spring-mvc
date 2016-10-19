<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/uniform_css_structure.css">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<title>Welcome Mr. Admin</title>
</head>
<body data-ng-app="myApp">
<p>${message}</p>
<img class="admin_top_left_ems_logo" alt="ems.png" src="images/ems.png">


<hr/>
<table>
<tr>
<th class="admin_ops">
<ul>
  <li>Administrator Operations</a></li>
  <li><a href="#home">Administrator Home</a></li>
  <li><a href="#userCreate">Create Employee</a></li>
  <li><a href="#userList">List Employee</a></li>
  <li><a href="#logOut">Logout</a></li>
 </ul>
 <ul>
 
 <li><form name="searchForm" action="/EMSUsingSpringMVC/search" method="get">
 Search By: <select name="category">
  <option value="first_name" >First Name</option>
  <option value="last_name" >Last Name</option>
  <option value="user_name">User Name</option>
  <option value="country">Country</option>
  <option value="city">City</option>
    <option value="state">State</option>
</select>
 <input class="search" type="text" name="term" placeholder="Search" />
 <button  ><i class="fa fa-search"></i></button>
 </form>
  </li>
 </ul>
 
 <form action="/EMSUsingSpringMVC/logout">
 <input type="submit" name="submit" value="Logout"/>
 </form>
</th>
<th class="view"><div data-ng-view></div></th>
</tr>
</table>

<script>
var app = angular.module("myApp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "home.jsp"
    })
    .when("/userCreate", {
        templateUrl : "userCreate.jsp"
    })
    .when("/userList", {
        templateUrl : "userList.jsp"
    })
    
});
</script>

</body>
</html>