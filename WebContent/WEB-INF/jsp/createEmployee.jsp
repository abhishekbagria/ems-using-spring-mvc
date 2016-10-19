<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/createUser.css">
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<script src="https://code.jquery.com/jquery-3.1.0.js" integrity="sha256-slogkvB1K3VOkzAI8QITxV3VzpOnkeNVsKvtkYLMjfk=" crossorigin="anonymous"></script>
<script>
function checkExist(userName){
/* 	console.log('asdf');
 */	 $.ajax({
		  url: "/EMSUsingSpringMVC/checkUserName",
		  beforeSend: function( xhr ) {
		    xhr.overrideMimeType( "text/plain; charset=x-user-defined" );
		  }
		})
		  .done(function( data ) {
		    if ( console && console.log ) {
		      console.log( "Sample of data:", data.slice( 0, 100 ) );
		    }
		  }); 
}
</script>
<title>Insert title here</title>
</head>
<body>
<h3>Lets Create an Employee.</h3>
<form action="/EMSUsingSpringMVC/insert" method="post" name="regF">
<br><input type="text" name="userName" placeholder="User Name" onkeypress="checkExist(ame)" required><span id="isE"></span>
<!-- <br><input type="text" name="userName" onblur="checkExist()" placeholder="User Name" required/><br><br>-->
<br><input type="password" name="passWord" placeholder="Create Password" required>
<input type="password" name="passWord" placeholder="Confirm Password" required>
<br><input type="text" name="firstName" placeholder="First Name" required>
<input type="text" name="lastName" placeholder="Last Name" required>
<br><input type="text" name="dateOfBirth" placeholder="Birthday(DD/MM/YYYY)" required>
<br><input type="text" name="gender" placeholder="Gender" required>
<br><textarea rows="4" cols="19" name="address" placeholder="Your Address Goes Here!"></textarea>
<br><input type="text" name="city" placeholder="City" required>
<br><input type="text" name="state" placeholder="State" required>
<br><input type="text" name="country" placeholder="Country" required>
<br><input type="text" name="PIN" placeholder="PIN Code" required>
<br><input type="text" name="phone" placeholder="Phone Number" required>
<br><input type="email" name="emailId" placeholder="email(user@example.com)" required>
<br><input type="submit" value="Submit">
</form>


</body>
</html>