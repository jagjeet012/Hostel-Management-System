<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Apna Hostel Registration Page</title>
</head>

<h1>Apna Hostel Registration</h1>

<body>
	<div>${errorMessage}</div>
	<form:form method='post' action='register' modelAttribute='user'>
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
				<td>Address: <font color='red'><form:errors
							path='address' /></font></td>
			</tr>
			<tr>
				<td><form:input path='address' /></td>
			</tr>
			<tr>
				<td>Contact Number: <font color='red'><form:errors
							path='contactNumber' /></font></td>
			</tr>
			<tr>
				<td><form:input path='contactNumber' /></td>
			</tr>
			<tr>
				<td>Qualification: <font color='red'><form:errors
							path='qualification' /></font></td>
			</tr>
			<tr>
				<td><form:input path='qualification' /></td>
			</tr>
			<tr>
				<td>Role: <font color='red'><form:errors path='role' /></font></td>
			</tr>
			<tr>
				<td><form:input path='role' /></td>

			</tr>
			<tr>
				<td>Please enter <br> 0 = admin || 1 = student || 2 =
					emloyee
				</td>
			</tr>


			<tr>
				<td><input type='submit' value='Register' /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>