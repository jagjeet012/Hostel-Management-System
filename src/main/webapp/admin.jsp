<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Admin Page</title>
</head>
<body>

	<form action="admin" method="post">
		<table style="width: 80%">
			<tr>
				<th>Role</th>
				<th>User Id</th>
				<th>User Name</th>
				<th>Password</th>
				<th>Address</th>
				<th>Contact Number</th>
				<th>Qualification</th>
				<th>Options</th>
			</tr>

			<c:forEach var="user" items="${sessionScope.userList}">
				<tr>
					<td style="text-align: center;">${user.role}</td>
					<td style="text-align: center;">${user.userId}</td>
					<td style="text-align: center;">${user.userName}</td>
					<td style="text-align: center;">${user.password}</td>
					<td style="text-align: center;">${user.address}</td>
					<td style="text-align: center;">${user.contactNumber}</td>
					<td style="text-align: center;">${user.qualification}</td>

					<td style="text-align: center;"><a href="editUser=${user.userId}">Edit</a>|
						<a href="deleteUser=${user.userId}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>

	</form>

	<form action="adminRoom" method="get">
		<input type='submit' value='Appoint Room' />
	</form>

</body>
</html>