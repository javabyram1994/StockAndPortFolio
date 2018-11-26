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
<h4 style="color:Blue;"><b>Add Company</b></h4>
<form:form action="insertcompany" method="post" modelAttribute="company">
<table border="1">
<tr><td>CompanyName  </td><td><form:input path="companyName"/></td></tr>
<tr><td>CompanySymbol</td><td><form:input path="companySymbol"/></td></tr>
 <form:hidden path="companyShare.id"/>
<tr><td colspan="2" align="right"><input type="submit" value="AddCompany"></td>
</table>
</form:form>
${msg}
</div>
</body>
</html>