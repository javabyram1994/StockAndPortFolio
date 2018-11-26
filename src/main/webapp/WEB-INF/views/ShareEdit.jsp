<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
</head>
<body>
	<%@include file="AdminPage.jsp"%>
	<div align="center">
		<h3 style="color: blue;">Update Share Details</h3>
		<table border="1">
			<form:form action="updateshare" method="post" modelAttribute="share">
				<tr>
					<th>SelectCompanySymbol:</th>
					<th><form:select path="id">
							<%-- <form:option value="">--select--</form:option> --%>
							<form:options items="${companies}" itemLabel="companySymbol"
								itemValue="id"/>
						</form:select></th>
				</tr>
				<%-- 
				<tr>
					<th>Previous PriceForShare :</th>
					<th></th>
				</tr>
				<tr>
					<th>New PriceForShare :</th>
					<th><form:input path="sharePrice" /></th>
				</tr> 
				--%>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="add"></td>
				</tr>
			</form:form>
		</table>
		${msg }
	</div>
</body>
</html>