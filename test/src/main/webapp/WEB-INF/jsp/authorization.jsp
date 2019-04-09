<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8"/>
	<title>Authorization</title>
	<link href="/css/style.css" rel="stylesheet"/>
	
</head>
<body>
<div class=title id="ff">
			<h1>Введите логин и пароль для авторизации, либо пройдите регистрацию нажав по кнопке "Регистрация"</h1>
		</div>
		
		<form name=form action="../authorization" method="post">
			<p align=center>
				Login:<br>
				<input type="text" name="login">
			</p>
			<br>
			<p align=center>
				Password:<br>
				<input type="password" name="password">
			</p>
			<br><br>
			<p align=center>
				<input type="submit" value="Submit">
			</p>
			
			<br><br>
			<p align=center>
				${error}
			</p>
		</form>
		
		<a class=bot  href="/registration">Регистрация</a><br/>
		<input type="button" onclick="alert('Нажмите по ссылке!')" value="Регистрация">
</body>
</html>