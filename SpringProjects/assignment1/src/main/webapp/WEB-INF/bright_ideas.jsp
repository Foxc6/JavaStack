<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/style.css" />
<title>Bright Ideas</title>
</head>
<body>
	<a href="/logout">Logout</a>
	<h2>Welcome, ${userName}</h2>
	<div class="container">
		<form:form method="POST" action="/add_idea" modelAttribute="idea">
			<p>
				<form:label path="content">
					<form:input path="content" />
				</form:label>
			</p>

			<input type="submit" value="Idea">
		</form:form>


		<c:forEach var="idea" items="${ideas}">
			<p>
				<a href="/users/${idea.user_id}"><c:out value="${idea.user_id}" /></a>
				says:
				<c:out value="${idea.content}" />
			</p>
		</c:forEach>
	</div>
</body>
</html>