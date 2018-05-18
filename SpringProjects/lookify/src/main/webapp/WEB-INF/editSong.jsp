<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<a href="/songs">Dashboard</a>

<form:form method="POST" action="/songs/edit/${id}" modelAttribute="song">
    <form:label path="title">Title
    <form:errors path="title"/>
    <form:input path="title"/></form:label>
    
    <form:label path="artist">Artist
    <form:errors path="artist"/>
    <form:input path="artist"/></form:label>
    
    <form:label path="rating">Rating(1-10)
    <form:errors path="rating"/>     
    <form:input type="rating" path="rating"/></form:label>
    
    <input type="submit" value="Update Song"/>
</form:form>


<td><a href="/songs/delete/${song.id}">Delete</a></td>