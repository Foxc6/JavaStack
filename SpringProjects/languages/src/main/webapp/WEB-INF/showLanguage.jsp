<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<a href="/languages">Dashboard</a>



<p>Name: <c:out value="${language.name}"/></p>
<p>Created By: <c:out value="${language.creator}"/></p>
<p>Version: <c:out value="${language.version}"/></p>

<td><a href="/languages/delete/${language.id}">Delete</a></td>
<td><a href="/languages/edit/${language.id}">Edit</a></td>