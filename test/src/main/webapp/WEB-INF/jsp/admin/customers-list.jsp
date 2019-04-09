<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Список клиентов</title>
</head>
<body>
<table>
		<tr>
			<th>ID клиента</th>
			<th>Имя</th>
			<th>Фамилия</th>
			<th>Отчество</th>
			<th>Дата рождения</th>
			<th>ID аккаунта</th>
		</tr>
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.idClient}</td>
				<td>${customer.name}</td>
				<td>${customer.surname}</td>
				<th>${customer.patronymic}</th>
				<td>${customer.birthday}</td>
				<td>${customer.idAccount}</td>
			</tr>
		</c:forEach>
		</table>

</body>
</html>