<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="row">
    <div class="col-md-12"><h2><spring:message code="car.flowTitle.start"/></h2></div>
</div>
<div class="row">
    <form:form>
        <div class="col-md-6">
            <h3><spring:message code="car.brand"/></h3>
            <div class="row">
                <div class="col-md-6">
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/logo/audi.jpg"
                           class="img-responsive" name="_eventId_next"/>
                </div>
                <div class="col-md-6">
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/logo/volkswagen.jpg"
                           class="img-responsive" name="_eventId_next"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/logo/seat.jpg"
                           class="img-responsive" name="_eventId_next"/>
                </div>
                <div class="col-md-6">
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/logo/skoda.png"
                           class="img-responsive" name="_eventId_next"/>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <h3><spring:message code="car.type"/></h3>
            <div class="row">
                <div class="col-md-6">
                    <h4>Berline</h4>
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/type/berline.png"
                           class="img-responsive" alt="berline" name="_eventId_next"/>
                </div>
                <div class="col-md-6">
                    <h4>Break</h4>
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/type/break.png"
                           class="img-responsive" alt="break" name="_eventId_next"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h4>Coup&eacute;</h4>
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/type/coupe.png"
                           class="img-responsive" alt="coupé" name="_eventId_next"/>
                </div>
                <div class="col-md-6">
                    <h4>Hatchback</h4>
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/type/hatchback.png"
                           class="img-responsive" alt="hatchback" name="_eventId_next"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h4>Jeep</h4>
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/type/jeep.png"
                           class="img-responsive" alt="jeep" name="_eventId_next"/>
                </div>
                <div class="col-md-6">
                    <h4>Monovolume</h4>
                    <input type="image" src="<%=request.getContextPath() %>/resources/img/type/monovolume.png"
                           class="img-responsive" alt="monovolume" name="_eventId_next"/>
                </div>
            </div>
        </div>
    </form:form>
</div>
<div class="row">
    <form:form>
        <input type="submit" value="Next" name="_eventId_next"
               class="btn btn-success"/>
    </form:form>
</div>