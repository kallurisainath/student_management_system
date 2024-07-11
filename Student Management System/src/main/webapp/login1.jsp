<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management System</title>
<style>
body {
	background-color: pink;
	font-family: Arial, sans-serif;
	color: #333;
	text-align: center;
}

h1 { //
	display: inline-block;
	text-align: center;
	margin: auto;
	padding: 5px;
}

.container {
	width: 80%;
	margin: 20px auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 10px;
	background-color: white;
	text-align: left;
}

form {
	width: 50%;
	margin-left: auto;
	margin-right: auto;
}

table {
	width: 100%;
	margin-top: 20px;
	border-collapse: collapse;
}

table, th, td {
	border: 1px solid #ccc;
	padding: 10px;
}

th {
	background-color: #f2f2f2;
}

input[type="text"], input[type="email"], input[type="password"] {
	width: 100%;
	padding: 8px;
	box-sizing: border-box;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	display: block;
	margin: auto;
}

input[type="submit"]:hover {
	background-color: #45a049;
}

.forgot {
	text-align: center;
	margin: auto;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Student Management System</h1>
		<form action="Viewallservlet">
			<table>
				<tr>
					<th colspan="2">Login Form</th>
				</tr>
				<tr>
					<td>Enter UserName:</td>
					<td><input type="text" name="firstName" required></td>
				</tr>
				<tr>
					<td>Enter password:</td>
					<td><input type="password" name="lastName" required></td>
				</tr>

				<tr>
					<td colspan="2" id="sub" style="text-align: center;"><input
						type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
		<br>
		<div class="forgot">
			<a href="forgot1password.jsp">Forgot Password</a>
		</div>
	</div>
</body>
</html>