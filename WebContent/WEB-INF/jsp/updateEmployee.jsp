<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/createUser.css">
<title>Insert title here</title>
</head>
<body>
<h3>Lets Create an Employee.</h3>
<form:form action="/EMSUsingSpringMVC/update" method="post" modelAttribute="user">
<%-- <br><form:input path="userName" value="${userData.userName}" readonly="true"/>--%>
<br><form:input path="firstName" value="${userData.firstName}" required="required" />
<form:input path="lastName" value="${userData.lastName}" required="required" />
<br><form:input path="dateOfBirth" value="${userData.dateOfBirth}" required="required" />
<br><form:input path="gender" value="${userData.gender}" required="required" />
<form:textarea path="address" value="${userData.address}" required="required" />
<br><form:input path="city" value="${userData.city}" required="required" />
<br><form:input path="state" value="${userData.state}" required="required" />
<br><form:input path="country" value="${userData.country}" required="required" />
<br><form:input path="PIN" value="${userData.PIN}" required="required" />
<br><form:input path="phone" value="${userData.phone}" required="required" />
<br><form:input path="emailId" value="${userData.emailId}" required="required" />
<br><input type="submit" value="Submit" />
<form:hidden path="userName" value="${userData.userName}" />
</form:form>

</body>
</html>