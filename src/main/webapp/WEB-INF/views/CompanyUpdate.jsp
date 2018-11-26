<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
</head>
<body>
<%@include file="AdminPage.jsp" %>
<br>
<div align="center">
<h3 style="color:Blue;">Update Company</h3>
<br>
<form:form action="update" method="post" modelAttribute="company">
<pre>
               <form:hidden path="id"/>
CompanyName  : <form:input path="companyName"/>
CompanySymbol: <form:input path="companySymbol"/>
 <form:hidden path="companyShare.id"/>
<input type="submit" value="Update">
</pre>
</form:form>
${msg}
</div>
</body>
</html>