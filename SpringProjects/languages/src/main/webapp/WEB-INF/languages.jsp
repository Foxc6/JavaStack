<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="languages/new">Add New</a>

<table class="table">
	<tr>
		<th>Name</th>
		<th>Creator</th>
		<th>Version</th>
		<th>Actions</th>
	</tr>
	<c:forEach items="${languages}" var="language" varStatus="loop">
		<tr>
			<td><a href="/languages/${language.id}">${language.name}</td>
			<td><c:out value="${language.creator}" /></td>
			<td><c:out value="${language.version}" /></td>
			<td><a href="/languages/delete/${language.id}">Delete</a></td>
			<td><a href="/languages/edit/${language.id}">Edit</a></td>
		</tr>
	</c:forEach>
</table>
