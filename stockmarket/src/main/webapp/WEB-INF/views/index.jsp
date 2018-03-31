<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<body>
<h2>Hello World!</h2>

<table>
<c:forEach items="${floordata}" var="floor">
    <tr>
        <td>${floor.getRate()}</td>
    </tr>
</c:forEach>
</table>

</body>
</html>
