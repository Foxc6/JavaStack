<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="/songs/new">Add New</a>
<a href="/songs/topTen">Top Songs</a>

<table class="table">
	<tr>
		<th>Title</th>
		<th>Rating</th>
		<th>Actions</th>
	</tr>
	<c:forEach items="${songs}" var="song" varStatus="loop">
		<tr>
			<td><a href="/songs/${song.id}">${song.title}</td>
			<td><c:out value="${song.rating}" /></td>
			<td><a href="/songs/delete/${song.id}">Delete</a></td>
			<td><a href="/songs/edit/${song.id}">Edit</a></td>
		</tr>
	</c:forEach>
