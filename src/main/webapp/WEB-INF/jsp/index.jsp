<%--
  Created by IntelliJ IDEA.
  User: zenko
  Date: 01.02.19
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Spring Application</title>
</head>
<body>
    <h1>::: Employee list :::</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Salary</th>
        </tr>
        <c:forEach var="e" items="${employees}">
            <tr>
                <td>${e.getId()}</td>
                <td>${e.getName()}</td>
                <td>${e.getAge()}</td>
                <td>$${e.getSalary()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
