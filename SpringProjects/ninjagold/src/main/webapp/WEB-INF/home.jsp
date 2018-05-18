<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h1>Gold: <c:out value="${gold}" /></h1>

<form action="/process" method="POST">
	<p>Visit Farm: <input type="submit" value="Find Gold"></p>
	<input type="hidden" name="building" value="farm">
</form>

<form action="/process" method="POST">
	<p>Visit House: <input type="submit" value="Find Gold"></p>
	<input type="hidden" name="building" value="house">
</form>

<form action="/process" method="POST">
	<p>Visit Castle: <input type="submit" value="Find Gold"></p>
	<input type="hidden" name="building" value="castle">
</form>