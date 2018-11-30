<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" name="viewport"
	content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<title>AdminPage</title>
</head>
<body>
<%@include file="AdminPage.jsp"%>
 	<br>
	
	<div align="center">
		<table border="1" width="50%">
		<tr><h4 style="color:purple;"><b>Aceepted Agents</b></h4></tr>
			<tr>
			<th>UserName</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Address</th>
			<th>Mobile</th>
			<th>Email</th>
			<th>Occupation</th>
			<th>status</th>
			</tr>
			<c:forEach items="${agents}" var="ag">
				<tr>
					<td><c:out value="${ag.userName }" /></td>
					<td><c:out value="${ag.firstName }" /></td>
					<td><c:out value="${ag.lastName }" /></td>
					<td><c:out value="${ag.address }" /></td>
					<td><c:out value="${ag.mobile }" /></td>
					<td><c:out value="${ag.email }" /></td>
					<td><c:out value="${ag.occupation }" /></td>
					<td><c:out value="${ag.status }" /></td>
					</tr>
			</c:forEach>
		</table>
		${msg}
	</div>


</body>
</html>