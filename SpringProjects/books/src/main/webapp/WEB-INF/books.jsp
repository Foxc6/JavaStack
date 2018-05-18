<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table class="table">
	<tr>
		<th>Title</th>
		<th>Description</th>
		<th>Language</th>
		<th>Pages</th>
		<th>Actions</th>
	</tr>
	<c:forEach items="${books}" var="book" varStatus="loop">
		<tr>
			<td><c:out value="${book.title}" /></td>
			<td><c:out value="${book.description}" /></td>
			<td><c:out value="${book.language}" /></td>
			<td><c:out value="${book.numberOfPages}" /></td>
			<td><a href="/books/delete/${book.id}">Delete</a></td>
			<td><a href="/books/edit/${book.id}">Edit</a></td>
		</tr>
	</c:forEach>
</table>
