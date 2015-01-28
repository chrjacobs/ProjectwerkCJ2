<%-- 
    Document   : LijstWijnen2
    Created on : 20-jan-2015, 19:52:18
    Author     : Christel
--%>

<%@page import="Services.WijnhuisServices"%>
<%@page import="DAL.Wijntypetbl"%>
<%@page import="ViewModels.LijstWijntypeViewModel"%>
<%@page import="DAL.Wijntbl"%>
<%@page import="ViewModels.LijstWijnenViewModel"%>
<%@page import="DAL.Wijnhuistbl"%>
<%@page import="ViewModels.LijstWijnhuisViewModel"%>
<%@page import="javax.swing.JTextArea"%>
<%@page import="java.awt.BorderLayout"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%    LijstWijnhuisViewModel vm2
            = (LijstWijnhuisViewModel) session.getAttribute("ViewModel2");

%>

<%    LijstWijntypeViewModel vm3
            = (LijstWijntypeViewModel) session.getAttribute("ViewModel3");

%>

<%    LijstWijnenViewModel vm
            = (LijstWijnenViewModel) session.getAttribute("ViewModel");

%>

<!DOCTYPE html>
<html>
    <%@include file="header1.jsp" %>

    <BODY style="background-color: #ffffcc">

        <%@include file="header2.jsp" %>

        <div class="col-md-3">
            <form action="WijnController" method="POST">
                Kies wijnhuis :
                <select class="form-control" name="wijnhuis" size="5">
                    <%--
                    <% WijnhuisServices ws = new WijnhuisServices();
                       for (Wijnhuistbl wijnhuis : ws.getWijnhuis()) { %>
                    <option value=wijnhuis.getId()wijnhuis.getNaam()%></option>
                    <%  }%>  
                    --%> 
                    <% for (Wijnhuistbl wijnhuis : vm2.getWijnhuis()) {%> 
                    <%--   
                    <option value="<%= wijnhuis.getId()%>"><%= wijnhuis.getNaam() + " [" + wijnhuis.getId() + "]"%></option>
                    --%>                              
                    <option value="<%= wijnhuis.getId()%>"><%= wijnhuis.getNaam()%></option>
                    <%  }%>
               </select> 
                </br>
                Kies wijntype :
                <select class="form-control" name="wijntype" size="5">
                    <% for (Wijntypetbl wijntype : vm3.getWijntype()) {%>   
                    <%--   
                   <option value="<%= wijntype.getId()%>"><%= wijntype.getNaam() + " [" + wijntype.getId() + "]"%></option>
                    --%>
                    <option value="<%= wijntype.getId()%>"><%= wijntype.getNaam()%></option>
                    <%  }%>
                </select> 
                </br>
                Kies prijs : 
                </br>
                <select class="form-control" name="prijs" size="4">
                    <option value="<100">minder dan 10 euro</option> 
                    <option value="<150">minder dan 15 euro</option>
                    <option value="<200">minder dan 20 euro</option>      
                    <option value="<300">minder dan 30 euro</option>   
                </select> 
                <input type="submit" value="Zoek Wijn" />
                <p class="pos_parameters">
                    Wijnhuis : <%= request.getParameter("wijnhuis")%>
                    Wijntype : <%= request.getParameter("wijntype")%>
                    Prijs    : <%= request.getParameter("prijs")%><br>
                </p>
            </form>
        </div>

        <div class="col-md-8">

            <table class="table table-hover">
                <p class="t1">
                <tr>
                    <th>Foto        </th>
                    <th>Naam        </th>
                    <th>Omschrijving</th>
                    <th>Wijnhuis    </th>
                    <th>Verkoopprijs</th>
                </tr>
                <% for (Wijntbl wijn : vm.getWijnen()) {%>
                <tr>
                    <td><img src="<%= wijn.getFototbl().getFilenaam()%>" width="80" height="80"></td>
                    <td><%= wijn.getNaam()%></td>
                    <td><%= wijn.getOmschrijving()%></td>
                    <td><%= wijn.getWijnhuistbl().getNaam()%></td>
                    <td><%= wijn.getPrijsString()%></td>  
                </tr>
                <%  }%>
            </table>
            <div class="row">
                <div class="col-sm-9">
                    Er zijn <%=vm.getAantal()%> records gevonden
                </div>
            </div>
        </div>

        <%@include file="footer.jsp" %>


    </body>
</html>