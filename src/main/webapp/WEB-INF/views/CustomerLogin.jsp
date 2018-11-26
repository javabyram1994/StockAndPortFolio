<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CustomerPage</title>
</head>
<body>
<%@include file="HomePage.jsp" %>
<div align="center">
<a href="customer/home">CustomerLogin</a><br>
<a href="customerregister">CLICKHERE</a>ForRegistration
<br>
${msg}
</div>
</body>
</html>