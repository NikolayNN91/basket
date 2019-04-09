<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>admin</title>
<link href="/css/home.css" rel="stylesheet"/>
<meta name="viewport" content="width='device-width', initial-scale='1'"/>
</head>
<body>
	<ul class='list' style='list-style-type:none'>
		<li><a href="/home">Home</a></li>
		<li><a href="/registration">Registration</a></li>
		<li><a href="/authorization">Authorization</a></li>
		<li><a href="/admin">Administration</a></li>
	</ul>

	<table>
		<tr>
			<th>Номер комнаты</th>
			<th>Количество спальных мест</th>
			<th>Класс апартаментов</th>
			<th>Стоимость апартаментов</th>
			<th>ID гостя</th>
			<th>Период проживания</th>
		</tr>
		<c:forEach items="${rooms}" var="rooms">
			<tr>
				<td>${rooms.roomNumber}</td>
				<td>${rooms.numberOfSeats}</td>
				<td>${rooms.roomClass}</td>
				<th>${rooms.price}</th>
				<td>${rooms.idClient}</td>
				<td>${rooms.residenceTime}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>