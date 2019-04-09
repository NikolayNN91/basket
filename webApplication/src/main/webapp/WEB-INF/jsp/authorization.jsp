<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8"/>
	<title>Authorization</title>
	<link href="css/style_authorization.css" rel="stylesheet" type="text/css"/>
	<!-- <script type="text/javascript" src="jquery-3.3.1.min.js"></script> -->
	<!-- <script type="text/javascript" src="script.js"></script> -->
</head>
<body>
<div class=title id="ff">
			<h1>Введите логин и пароль для авторизации, либо пройдите регистрацию нажав по кнопке "Регистрация"</h1>
		</div>
		
		<form>
			<p align=center>
				User name:<br>
				<input type="text" name="userid">
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
		
		<a class=bot  href="/registration">Регистрация</a><br/>
		<input type="button" onclick="alert('Нажмите по ссылке!')" value="Регистрация">
</body>
</html>