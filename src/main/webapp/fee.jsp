<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Apna Hostel Fee Form</title>
</head>
<body>

	<form action="fee" method="post">
		<table>
			<tr>
				<td><label for="userId">User Id</label></td>
				<td><input type="text" name="userId" value='${userId}' /><br></td>
			</tr>
			<tr>
				<td><label>Name of the Student</label></td>
				<td><input type="text" name="feeName" value='${userName}' /><br></td>
			</tr>
			<tr>
				<td><label>Amount of fee</label></td>
				<td><input type="number" name="feeAmount" value='' /><br></td>
			<tr>
				<td><label>Fee Due</label></td>
				<td><input type="number" name="dueFee" value='' /><br></td>
			</tr>
			<tr>
				<td>Please enter <br> 0 = paid || 1 = unpaid
				</td>
			</tr>
			<tr>
				<td><input type='submit' value='Deposit Fee' /></td>
			</tr>
		</table>
	</form>

</body>
</html>