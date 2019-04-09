<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>admin</title>
</head>
<body>

	<table>
		<tr>
			<th>Номер комнаты</th>
			<th>Количество спальных мест</th>
			<th>Свободные аппартаменты</th>
			<th>Стоимость апартаментов</th>
			<th>ID гостя</th>
			<th>Класс аппартаментов</th>
		</tr>
		<c:forEach items="${rooms}" var="room">
			<tr>
				<td>${room.roomNumber}</td>
				<td>${room.numberOfSeats}</td>
				<td>${room.numberIsEmpty}</td>
				<th>${room.price}</th>
				<td>${room.clients_idClient}</td>
				<td>${room.roomClass_roomClass}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>