<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width='device-width', initial-scale='1'"/>
	<link href="/css/home.css" rel="stylesheet"/>
	<title>Hotel</title>
</head>
<body>
	<ul class='list' style='list-style-type:none'>
		<li><a href="/home">Home</a></li>
		<li><a href="/registration">Registration</a></li>
		<li><a href="/authorization">Authorization</a></li>
		<li><a href="/admin">Administration</a></li>
	</ul>
		${helloPhrase}${userName}
		<form action="home" method="post" id="home-form">
			<br>
			<p align=center>
				Количество спальных мест<br>
				<input type="text" name="numberOfSeats">
			</p>
			<p align=center>
				Стоимость за ночь:<br>
				<input type="text" name="price">
			</p>
			<p align=center>
			Класс аппартаментов:<br>
			  <input type="radio" name="roomClass" value="BUSINESS" checked>Business<br>
			  <input type="radio" name="roomClass" value="DE_LUXE" checked>De_luxe<br>
			  <input type="radio" name="roomClass" value="STANDART" checked>Standart<br>
			  <input type="radio" name="roomClass" value="SUPERIOR" checked>Superior<br>
			</p>
			<br><br>
			<p align=center>
				<input type="submit" value="Поиск">
			</p>
			<c:forEach var="error" items="${errors}">
			${error.defaultMessage}<br>
			</c:forEach>
			<br><br>
		</form>
	<table>
		<tr>
			<th>Класс аппартаментов</th>
			<th>Количество спальных мест</th>
			<th>Стоимость за ночь</th>

		</tr>
		<c:forEach items="${rooms}" var="room">
			<tr>
				<td>${room.roomClass_roomClass}</td>
				<td>${room.numberOfSeats}</td>
				<td>${room.price}</td>

			</tr>
		</c:forEach>
		</table>

</body>
</html>