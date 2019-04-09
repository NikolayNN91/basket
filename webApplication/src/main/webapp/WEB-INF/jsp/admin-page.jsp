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
			<th>Класс апартаментов</th>
			<th>Стоимость апартаментов</th>
			<th>ID гостя</th>
			<th>Период проживания</th>
		</tr>
		<c:forEach items="${room}" var="room">
			<tr>
				<td>${room.roomNumber}</td>
				<td>${room.numberOfSeats}</td>
				<td>${room.roomClass}</td>
				<th>${room.price}</th>
				<td>${room.idClient}</td>
				<td>${room.residenceTime}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>