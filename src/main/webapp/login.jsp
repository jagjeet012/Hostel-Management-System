<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Apna Hostel login page</title>
</head>

<body>

	<h1>Apna Hostel Login Page</h1>

	<div>${errorMessage}</div>
	<form:form method='post' action='login' modelAttribute='user'>
		<table>
			<tr>
				<td>Username: <font color='red'><form:errors
							path='userName' /></font></td>
			</tr>
			<tr>
				<td><form:input path='userName' /></td>
			</tr>
			<tr>
				<td>Password: <font color='red'><form:errors
							path='password' /></font></td>
			</tr>
			<tr>
				<td><form:password path='password' /></td>
			</tr>
			<tr>
				<td><input type='submit' value='Login' /></td>
			</tr>

		</table>
	</form:form>

	<form action="register" method="get">
		<table>
			<tr>
				<td><input type='submit' value='Register' /></td>
			</tr>
		</table>
	</form>
</body>
</html>