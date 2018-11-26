<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
<style type="text/css">
tr{
text-align:center;
background-color:white;
}
th{
color:white;
background-color:red;
}
.edit:hover{
background-color:darkorange;
}
.edit{
color:white;
text-align: center;
cursor: pointer;
background-color:green;
}
</style>
</head>
<body>
<%@include file="AdminPage.jsp" %>
<br>
<div align="center">
<table border="1">
<tr>
<th>COMPANY NAME</th>
<th>COMPANY SYMBOL</th>
<th>Operation</th>
</tr>
<c:forEach items="${companies}" var="c">
<tr>
<td><c:out value="${c.companyName }" /></td>
<td><c:out value="${c.companySymbol }" /></td>
<td><a href="updatecompany?id=${c.id}"><button class="edit">EDIT</button></a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>