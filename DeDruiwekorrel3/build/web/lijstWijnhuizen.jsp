<%-- 
    Document   : lijstWijnhuizen
    Created on : 19-jan-2015, 22:56:48
    Author     : Christel
--%>

<%@page import="DAL.Wijnhuistbl"%>
<%@page import="ViewModels.LijstWijnhuisViewModel"%>
<%
    LijstWijnhuisViewModel vm
            = (LijstWijnhuisViewModel) session.getAttribute("ViewModel2");

%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header1.jsp" %>

    <BODY style="background-color: #ffffcc">

        <%@include file="header2.jsp" %>
        
        <h1>Lijst wijnhuizen</h1>
      
        <table class="table">
            <tr>
                <th>Naam</th>
                <th>Omschrijving</th>
                <th></th>
            </tr>
            <%                for (Wijnhuistbl wijnhuis : vm.getWijnhuis()) {
            %>

            <tr>

                <td><img src="<%= wijnhuis.getFototbl().getFilenaam()%>" width="80" height="80"></td>
                <td><%= wijnhuis.getNaam()%></td>
                <td><%= wijnhuis.getOmschrijving()%></td>
                <%-- 
                                <td><a class="btn btn-primary btn-sm" href="WijnhuisDetail?id=<%=wijnhuis.getId()%>"> Detail </a>
                                </td>
                --%>

            </tr>

            <%  }%>

        </table>


        <p>Er zijn <%=vm.getAantal()%> records gevonden</p>

  
        <%@include file="footer.jsp" %>

    </BODY>
</HTML>