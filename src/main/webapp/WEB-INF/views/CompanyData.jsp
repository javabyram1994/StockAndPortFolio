<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
<style type="text/css">
tr{
background-color:white;
text-align:center;
}
tr:nth-child(even){
background-color:azure;
}
tr:hover{
background-color:aqua;
}
th{
color:white;
background-color:green;
}
/* td{
text-align:center;
} */
</style>
</head>
<body>
	<%@include file="AdminPage.jsp"%>
	<br>
	<div align="center">
		<table border="1" width="50%">
		<tr><h4 style="color:purple;"><b>Companies List</b></h4></tr>
			<tr>
				<th>COMPANY NAME</th>
				<th>COMPANY SYMBOL</th>
			</tr>
			<c:forEach items="${companies}" var="c">
				<tr>
					<td><c:out value="${c.companyName }" /></td>
					<td><c:out value="${c.companySymbol }" /></td>
					</tr>
			</c:forEach>
		</table>
		${msg }
	</div>
</body>
</html>