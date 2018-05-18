<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/style.css" />
<title>Login Registration</title>
</head>
<body>
	<a href="/logout">Logout</a>
	<a href="/allUsers">All Users</a>
	<div class="container">
		<h2>Hi ${user.name}!</h2>
		
		<p>Description: ${user.description}!</p>
		
		<p>Your Professional Network:</p>
		<table style="width: 300px">
			<tr>
				<th>Name</th>
			</tr>
			<c:forEach var="friend" items="${user.friends}">
			<tr>
				<td><a href="users/${friend.id}">${friend.name}</a></td>
			</tr>
			</c:forEach>
		</table>
		
		
		
		<h3>Invitations:</h3>
		<p>The following people asked to be your network:</p>
		
		<table style="width: 300px">
			<tr>
				<th>Name</th>
				<th>Action</th>
			</tr>
			<c:forEach var="pFriend" items="${user.potential_friends}">
			<tr>
				<td><a href="users/${pFriend.id}">${pFriend.name}</a></td>
				
				
				<td><form:form action="/addFriend" method="POST" modelAttribute="friend">
					<form:hidden path="friend" value="${pFriend.id}"></form:hidden>
					<input type="submit" value="Accept" />
				</form:form></td>
				
				<td><form:form action="/ignore" method="POST" modelAttribute="friend">
					<form:hidden path="friend" value="${pFriend.id}"></form:hidden>
					<input type="submit" value="Ignore" />
				</form:form></td>
			</tr>
			</c:forEach>
		</table>
		
	</div>
</body>
</html>