<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apna Hostel Room Allotment Form</title>
</head>
<body>

	<form action="appointRoom" method="post">
		<table>
			<tr>
				<td><label for="userId">User Id</label></td>
				<td><input type="text" name="userId" value='' /><br></td>
			</tr>
			<tr>
				<td><label>Room Number</label></td>
				<td><input type="number" name="roomNumber" value='' /><br></td>
			</tr>
			<tr>
				<td><label>Number Of Students</label></td>
				<td><input type="number" name="noOfStudent" value='' /><br></td>
			</tr>
			<tr>
				<td><input type='submit' value='Appoint Room' /></td>
			</tr>
		</table>
	</form>

</body>
</html>