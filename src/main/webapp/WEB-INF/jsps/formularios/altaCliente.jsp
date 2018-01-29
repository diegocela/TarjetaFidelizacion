<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="cliente" method="POST">
		<table>
			<tr>
				<td><spring:message code="alta.cliente.username"></spring:message></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><spring:message code="alta.cliente.password"></spring:message></td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td><spring:message code="alta.cliente.nombre"></spring:message></td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td><spring:message code="alta.cliente.apellidos"></spring:message></td>
				<td><form:input path="apellidos" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Alta" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>