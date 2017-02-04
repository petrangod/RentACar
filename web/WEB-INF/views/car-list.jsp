<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List Cars</title>
    <%-- Reference the css --%>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

<div id="wrapper">
    <div id="header">
        <h2>Rent A Car</h2>
    </div>
</div>

<div id="container">
    <div id="content">
        <table>
            <tr>
                <th>Brand</th>
                <th>Engine Power</th>
                <th>Year</th>
            </tr>
            <%-- Loop over and print cars --%>
            <c:forEach var="tempCar" items="${cars}">
                <tr>
                    <td>${tempCar.brand}</td>
                    <td>${tempCar.power}</td>
                    <td><fmt:formatDate value="${tempCar.year}" pattern="yyyy" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
