<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<ul style="list-style:none;line-height:28px;">

    <li>
        <spring:url value="/" var="homeUrl" htmlEscape="true" />
        <a href="${homeUrl}">Home</a>
    </li>
</ul>