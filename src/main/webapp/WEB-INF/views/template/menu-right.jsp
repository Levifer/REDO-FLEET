<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
    <c:when test="${isLoggedIn == false}">
        <li><a href="#">Login</a></li>
    </c:when>
    <c:otherwise>
        <li><a href="#">Logout</a></li>
    </c:otherwise>
</c:choose>