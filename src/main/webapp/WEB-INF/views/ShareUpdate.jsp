<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#price").val("");
});
</script>
</head>
<body>
	<%@include file="AdminPage.jsp"%>
	<div align="center">
		<h3 style="color: blue;">Update Share Details</h3>
		<table border="1">
			<form:form action="shareupdate" method="post" modelAttribute="share">
			<form:hidden path="id"/>
				<tr>
					<th>CompanySymbol</th>
					<th><input type="text" value="${company}" readOnly="true" style="background-color:grey;"></th>
				</tr>
				<tr>
					<th>PreviousPriceForShare</th>
					<th><input type="text" value="${sharePrice}" readOnly="true" style="background-color:grey;"></th>
				</tr>
				<tr>
					<th>NewPriceForShare :</th>
					<th><form:input path="sharePrice" id="price"/></th>
					<th><form:hidden path="numberOfShares"/></th>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="update"></td>
				</tr>
			</form:form>
		</table>
		${msg }
	</div>
</body>
</html>