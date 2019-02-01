<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="editUser" method="get">

		<h1>Edit User Form</h1>

		<table>
			<tr>
				<td><label for="userId">User Id</label></td>
				<td><input type="text" name="userId" value='${userId}' /> <br></td>
			</tr>
			<tr>
				<td><label for="userName">User Name</label></td>
				<td><input type="text" name="userName" value='${userName}' />
					<br></td>
			</tr>
			<tr>
				<td><label for="password">Password</label></td>
				<td><input type="password" name="password" value='${password}' />
					<br></td>
			</tr>
			<tr>
				<td><label for="address">Address</label></td>
				<td><input type="text" name="address" value='${address}' /> <br></td>
			</tr>
			<tr>
				<td><label for="contactNumber">Contact Number</label></td>
				<td><input type="text" name="contactNumber"
					value='${contactNumber}' /> <br></td>
			</tr>
			<tr>
				<td><label for="qualification">Qualification</label></td>
				<td><input type="text" name="qualification"
					value='${qualification}' /> <br></td>
			</tr>
			<tr>
				<td><input type='submit' value='edit' /></td>
			</tr>
		</table>

	</form>

</body>
</html>