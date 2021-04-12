<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IberianSkies</title>
</head>
<body>
    
	<h1>Planes over Iberian Peninsula </h1>
        <h1>${counter}</h1>
        <h1>${countery}</h1>}
        <table>
            <tr>
                <th>Call Sign</th>
                <th>Latitude</th>
                <th>Longitude</th>
                <th>Velocidade</th>
                <th>Origin Country</th>
            </tr>
            
            
            <c:forEach items="${flights}" var="vector">
                <tr>
                    <td><c:out value="${vector.callSign}"/></td>
                    <td><c:out value="${vector.latitude}"/></td>
                    <td><c:out value="${vector.longitude}"/></td>
                       <td><c:out value="${vector.velocidade}"/></td>
                    <td><c:out value="${vector.originCountry}"/></td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>