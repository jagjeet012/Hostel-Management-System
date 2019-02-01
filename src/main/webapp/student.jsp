<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
 
<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Apna Hostel Student Page</title>
</head>
<body>

	<h1>Student page</h1>

	<form>
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
		</table>
	</form>
	
	<form action="feeDeposit" method="get">
		<input type='submit' value='Deposit Fee' />
	</form>
</body>
</html>