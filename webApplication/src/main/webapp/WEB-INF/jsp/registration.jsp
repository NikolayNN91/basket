<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<title>registration</title>
</head>
<body>
	<form action="registration" method="post" id="registration-form">
			<p align=center>
				Name:<br>
				<input type="text" name="userid">
			</p>
			<br>
			<p align=center>
				Login:<br>
				<input type="text" name="login">
			</p>
			<br>
			<p align=center>
				User password:<br>
				<input type="password" name="psw">
			</p>
			<br><br>
			<p align=center>
				<input type="submit" value="Submit">
			</p>
			<br><br>
		</form>

</body>
</html>