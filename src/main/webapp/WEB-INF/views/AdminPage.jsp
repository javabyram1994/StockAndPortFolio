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

<title>AdminPage</title>
<style type="text/css">
body {
	background-color: AntiqueWhite;
}
</style>
</head>
<header>
	<hr>
	<div align="center">
		<h2 style="color: green;"><b>STOCK AND PORTFOLIO MANAGEMENT</b></h2>
	</div>
	<hr>
</header>
<nav>
	<div align="center">
		<div class="btn-group">
			<a
				href="home"><button
					type="button">HOME</button></a>

			<div class="btn-group">
				<button type="button" data-toggle="dropdown">COMPANY</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="addcompany">Add Company</a> <a
						class="dropdown-item" href="allcompanies">View Companies</a> <a
						class="dropdown-item" href="editcompanies">Update Company</a> <a
						class="dropdown-item" href="deletecompany">Delete Companies</a>
				</div>
			</div>

			<div class="btn-group">
				<button type="button" data-toggle="dropdown">SHARES</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="addshare">Add Share</a> <a
						class="dropdown-item" href="allshares">View Shares</a> <a
						class="dropdown-item" href="editshare">Update Share</a> <a
						class="dropdown-item" href="deleteshare">Delete Shares</a>
				</div>
			</div>

			<div class="btn-group">
				<button type="button" data-toggle="dropdown">AGENTS</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Accepted Agents</a> <a
						class="dropdown-item" href="#">Rejected Agents</a> <a
						class="dropdown-item" href="#">Approve Agents</a>
				</div>
			</div>
			
			<div class="btn-group">
				<button type="button" data-toggle="dropdown">Reports</button>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Report On Purchase Shares</a> <a
						class="dropdown-item" href="#">Report On Sale Shares</a>
				</div>
			</div>
			
			<a
				href="../homepage/home"><button
					type="button">LOGOUT</button></a>

		</div>
	</div>
</nav>
<body>
</body>
</html>