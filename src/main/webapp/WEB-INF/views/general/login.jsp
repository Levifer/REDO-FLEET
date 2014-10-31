<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
    <div class="col-md-12"><h2>LOGIN!</h2></div>
</div>
<div class="row">
    <h2>Some day, you can log in here.</h2>
</div>
<div class="row">
    <form:form>
        <input type="submit" value="Back" name="_eventId_back"
               class="btn btn-danger" />
        <input type="submit" value="Log in to order this car!" name="_eventId_login"
               class="btn btn-warning" />
    </form:form>
</div>
