<%--
  Created by IntelliJ IDEA.
  test.User: fxd
  Date: 2018/9/2
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>This is SpringMVC demo page</h2>
<c:forEach items="${users}" var="user">
    <c:out value="${user.username}"/><br/>
    <c:out value="${user.age}"/><br/>
</c:forEach>


</body>
</html>
