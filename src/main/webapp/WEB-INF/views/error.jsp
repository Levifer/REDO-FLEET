<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/" var="homeUrl" htmlEscape="true" />
<h2>
    Something went terribly wrong!
</h2>
<p>If you want to, you can look up this HTTP-code: <em>${errorCode}</em>. Good luck!</p>
<p>I guess you should go back to the <a href="${homeUrl}">home page</a></p>