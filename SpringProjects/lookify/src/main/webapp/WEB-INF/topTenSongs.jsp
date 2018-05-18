<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<a href="/songs">Dashbaord</a>
<h3>Top Ten Songs</h3>
<table class="table">
	<tr>
		<th>Title</th>
		<th>Rating</th>
		<th>Actions</th>
	</tr>
	<c:forEach items="${songs}" var="song" begin="0" end="9">
		<tr>
			<td><c:out value="${song.rating}" /></td>
			<td><a href="/songs/${song.id}">${song.title}</a></td>
			<td>${song.artist}</td>
		</tr>
	</c:forEach>
</table>