<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: parkjihyoung
  Date: 15. 4. 27.
  Time: 오전 1:31
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
<h1>Hello, World.</h1>

<c:forEach items="${userCnt}" var="cnt">
  ${userCnt.cnt}
  <br />
</c:forEach>

</body>
</html>
