<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<a href="/languages">Dashboard</a>

<form:form method="POST" action="/languages/edit/${id}" modelAttribute="language">
    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:input path="creator"/></form:label>
    
    <form:label path="version">Version
    <form:errors path="version"/>     
    <form:input type="version" path="rating"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>


<td><a href="/languages/delete/${language.id}">Delete</a></td>
