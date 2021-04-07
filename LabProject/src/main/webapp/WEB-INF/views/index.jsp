<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PtSkies</title>
</head>
<body>
	<h1>Planes over ${country}</h1>
        
        <table>
            <tr>
                <th>Call Sign</th>
                <th>Latitude</th>
                <th>Longitude</th>
                <th>Origin Country</th>
            </tr>
            <c:forEach items="${vectors}" var="vector">
                <tr>
                    <td><c:out value="${vector.callSign}"/></td>
                    <td><c:out value="${vector.latitude}"/></td>
                    <td><c:out value="${vector.longitude}"/></td>
                    <td><c:out value="${vector.originCountry}"/></td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>