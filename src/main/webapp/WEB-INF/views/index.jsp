<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<div class="row">
    <div class="col-md-12"><h2>Choose!</h2></div>
</div>
<div class="row">
    <div class="col-md-6">
        <h3><spring:message code="car.brand"/></h3>

        <div class="row">
            <div class="col-md-6">
                <img src="<%=request.getContextPath() %>/resources/img/logo/audi.jpg" class="img-responsive"/>
            </div>
            <div class="col-md-6">
                <img src="<%=request.getContextPath() %>/resources/img/logo/volkswagen.jpg" class="img-responsive"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <img src="<%=request.getContextPath() %>/resources/img/logo/seat.jpg" class="img-responsive"/>
            </div>
            <div class="col-md-6">
                <img src="<%=request.getContextPath() %>/resources/img/logo/skoda.png" class="img-responsive"/>
            </div>
        </div>
    </div>
    <div class="col-md-6">
        <h3><spring:message code="car.type"/></h3>
        <div class="row">
            <div class="col-md-6">
                <h4>Berline</h4>
                <img src="<%=request.getContextPath() %>/resources/img/type/berline.jpg" class="img-responsive" alt="berline"/>
            </div>
            <div class="col-md-6">
                <h4>Break</h4>
                <img src="<%=request.getContextPath() %>/resources/img/type/break.jpg" class="img-responsive" alt="break"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <h4>Coup&eacute;</h4>
                <img src="<%=request.getContextPath() %>/resources/img/type/coupe.jpg" class="img-responsive" alt="coupé"/>
            </div>
            <div class="col-md-6">
                <h4>Hatchback</h4>
                <img src="<%=request.getContextPath() %>/resources/img/type/hatchback.jpg" class="img-responsive" alt="hatchback"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <h4>Jeep</h4>
                <img src="<%=request.getContextPath() %>/resources/img/type/jeep.jpg" class="img-responsive" alt="jeep"/>
            </div>
            <div class="col-md-6">
                <h4>Monovolume</h4>
                <img src="<%=request.getContextPath() %>/resources/img/type/monovolume.jpg" class="img-responsive" alt="monovolume"/>
            </div>
        </div>
    </div>
</div>
