<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title" /></title>
        <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap.css" rel="stylesheet"/>
        <link type="text/css" href="<%=request.getContextPath() %>/resources/css/style.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
            <!-- Header -->
            <div class="row">
                <tiles:insertAttribute name="header" />
            </div>
            <!-- Menu Page -->
            <div class="row">
                <tiles:insertAttribute name="menu" />
            </div>
            <!-- Body Page -->
            <div class="row">
                <tiles:insertAttribute name="body" />
            </div>
            <!-- Footer Page -->
            <div class="row">
                <tiles:insertAttribute name="footer" />
            </div>
        </div>
        <script type="application/javascript" src="<%=request.getContextPath() %>/resources/js/bootstrap.js"></script>
    </body>
</html>