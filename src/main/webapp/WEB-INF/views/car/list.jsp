<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.flowTitle.list"/></h2></div>
</div>
<div class="row">
    <div class="col-md-12">
        <table class="table">

        </table>
    </div>
</div>
<div class="row">
    <form:form>
        <input type="submit" value="Back" name="_eventId_back"
               class="btn btn-danger" />
        <input type="submit" value="Next" name="_eventId_next"
           class="btn btn-success" />
    </form:form>
</div>