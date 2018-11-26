<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>CustomerPage</title>
<style type="text/css">
body {
	background-color: AntiqueWhite;
}
</style>
</head>
<header>
	<hr>
	<div align="center">
		<h2 style="color: green;">
			<b>STOCK AND PORTFOLIO MANAGEMENT</b>
		</h2>
	</div>
	<hr>
</header>
<nav>
	<div align="center">
		<div class="btn-group">
			<a href="home"><button type="button">HOME</button></a>
			<a href="viewagents"><button type="button">VIEW AGENTS</button></a>
			<a href="viewcompanies"><button type="button">VIEW COMPANIES</button></a>

			<div class="btn-group">
				<button type="button" data-toggle="dropdown">PURCHASE SHARES</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">PurchaseShares</a> <a
						class="dropdown-item" href="#">PurchaseHistory</a>
				</div>
			</div>

			<div class="btn-group">
				<button type="button" data-toggle="dropdown">SALE SHARES</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">SaleShares</a> <a
						class="dropdown-item" href="#">SaleHistory</a>
				</div>
			</div>
				<a href="#"><button type="button">VIEW PORTFOLIO</button></a>

			<a href="../home"><button type="button">LOGOUT</button></a>

		</div>
	</div>
</nav>
<body>
</body>
</html>