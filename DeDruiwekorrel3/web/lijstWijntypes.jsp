<%-- 
    Document   : lijstWijntypes
    Created on : 21-jan-2015, 16:36:35
    Author     : Christel
--%>

<%@page import="DAL.Wijntypetbl"%>
<%@page import="ViewModels.LijstWijntypeViewModel"%>
<%
    LijstWijntypeViewModel vm
            = (LijstWijntypeViewModel) session.getAttribute("ViewModel3");

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header1.jsp" %>

    <BODY style="background-color: #ffffcc">

        <%@include file="header2.jsp" %>

        <h1>Lijst wijntypes</h1>

      
        <table class="table">
            <tr>
                <th>Naam</th>
                <th>Omschrijving</th>
                <th></th>
            </tr>
            <%                for (Wijntypetbl wijntype : vm.getWijntype()) {
            %>

            <tr>
                <td><%= wijntype.getNaam()%></td>
                <%--            
                           <td><%= wijntype.getWijntbls().getNaam()%></td>
                --%> 
            </tr>

            <%  }%>

        </table>

        <div class="row">
            <div class="col-sm-9">
                Er zijn <%=vm.getAantal()%> records gevonden
            </div>
        </div>

        <%@include file="footer.jsp" %>

    </BODY>
</HTML>