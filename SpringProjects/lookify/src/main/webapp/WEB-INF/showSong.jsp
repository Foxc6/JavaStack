<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<a href="/songs">Dashboard</a>



<p>Title: <c:out value="${song.title}"/></p>
<p>Artist: <c:out value="${song.artist}"/></p>
<p>Rating(1-10): <c:out value="${song.rating}"/></p>

<td><a href="/songs/delete/${song.id}">Delete</a></td>
<td><a href="/songs/edit/${song.id}">Edit</a></td>