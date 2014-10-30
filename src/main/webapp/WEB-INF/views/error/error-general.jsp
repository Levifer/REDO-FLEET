<%--
  Created by IntelliJ IDEA.
  User: AEIAT46
  Date: 30-10-2014
  Time: 08:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Error</title>
        <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap.css" rel="stylesheet"/>
    </head>
    <body>
        <h1>
            You seem to have misplaced something...
        </h1>
        <p>If you want to, you can look up this HTTP-code: <em>${errorCode}</em>. Good luck!</p>
        <script type="application/javascript" src="<%=request.getContextPath() %>/resources/js/bootstrap.js"></script>
    </body>
</html>
