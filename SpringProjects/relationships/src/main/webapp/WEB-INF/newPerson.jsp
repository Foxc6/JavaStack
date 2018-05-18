<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="POST" action="/persons/new" modelAttribute="person">
	<form:hidden path="id"/>
	
    <form:label path="firstName">First Name
    <form:errors path="firstName"/>
    <form:input path="firstName"/></form:label>
    
    <form:label path="lastName">Last Name
    <form:errors path="lastName"/>
    <form:input path="lastName"/></form:label>
    
    <input type="submit" value="Create"/>
</form:form>