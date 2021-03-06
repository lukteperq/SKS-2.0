<%--
  Created by IntelliJ IDEA.
  User: Thomas
  Date: 09.01.14
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div class="col-md-4">

    <h1>Administrer emne</h1>

    <h3>Endre emne</h3>
    <select  class="form-control" id="emnevalg" onchange="adminFagOperasjon(this.value)">
        <option value="ingen"><i>Ingen valgt</i></option>
        <option value="emne2">Fag 2</option>
        <option value="emne3">Fag 3</option>
        <option value="emne4">Fag 4</option>
    </select>

    <form:form method="post" modelAttribute="emne">
        <h3>
            <div id="operasjonstekst">
                Lag nytt fag
            </div>
        </h3>
        <div class="form-group">
            <label for="emnekode">Emnekode:</label>
            <form:input  class="form-control" path="kode" id="emnekode" placeholder="Emnekode"/>
            <form:errors path="kode"/>
        </div>
        <div class="form-group">
            <form:label for="emnenamn" path="navn">Emnenamn:</form:label>
            <form:input  class="form-control" id="emnenamn" placeholder="Emnenamn" path="navn"/>
            <form:errors path="navn"/>
        </div>
        <input class="btn btn-md btn-primary" type="submit" value="Lag fag" id="LagFag">
    </form>
</div>
<script src="<c:url value="/resources/js/admin.js"/>"></script>
