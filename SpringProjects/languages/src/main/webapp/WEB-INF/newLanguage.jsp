<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="POST" action="/languages/new" modelAttribute="language">
	<form:hidden path="id"/>
	
    <form:label path="name">Name
    <form:errors path="name"/>
    <form:input path="name"/></form:label>
    
    <form:label path="creator">Creator
    <form:errors path="creator"/>
    <form:input path="creator"/></form:label>
    
    <form:label path="version">Version
    <form:errors path="version"/>     
    <form:input type="version" path="version"/></form:label>
    
    <input type="submit" value="Submit"/>
</form:form>
