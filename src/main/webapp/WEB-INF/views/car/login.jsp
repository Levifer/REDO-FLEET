<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
    <div class="col-md-12"><h2>LOGIN TO ORDER!</h2></div>
</div>
<div class="row">
    <h2>Some day, you can log in here to order your car.</h2>
</div>
<div class="row">
    <form:form>
        <input type="submit" value="Back" name="_eventId_back"
               class="btn btn-danger" />
        <input type="submit" value="Login!" name="_eventId_login"
               class="btn btn-primary" />
    </form:form>
</div>
