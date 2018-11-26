<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
</head>
<body>
	<%@include file="AdminPage.jsp"%>
	<div align="center">
		<h3 style="color: blue;">Add Share Details</h3>
		<table>
			<form:form action="insertshare" method="post" modelAttribute="share">
				<tr>
					<th>SelectCompanySymbol:</th>
					<th><form:select path="id">
							<%-- <form:option value="">--select--</form:option> --%>
							<form:options items="${companies}" itemLabel="companySymbol"
								itemValue="id" />
						</form:select></th>
				</tr>
				<tr>
					<th>PriceForShare :</th>
					<th><form:input path="sharePrice" /></th>
				</tr>
				<tr>
					<th>NumberOfShares :</th>
					<th><form:input path="numberOfShares" /></th>
				</tr>
				<tr>
					<th colspan="2"><input type="submit" value="add"></th>
				</tr>
			</form:form>
		</table>
		${msg }
	</div>
</body>
</html>