<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
<style type="text/css">
input{
color:white;
background-color:red;
}
input type=submit:hover{
background-color:green;
}
</style>
</head>
<body>
<%@include file="AdminPage.jsp" %>
<br>
<div align="center">
<h4>Company Delete</h4>
<form:form action="delete" method="get" modelAttribute="company">
CompanyName :<form:select path="id">
<form:option value="">--select--</form:option>
<form:options items="${companies}" itemLabel="companyName" itemValue="id"/>
</form:select>
<input type="submit" value="delete">
</form:form>
${msg}
</div>
</body>
</html>