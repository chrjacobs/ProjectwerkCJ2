<%-- 
    Document   : Degustatie
    Created on : 26-jan-2015, 10:53:04
    Author     : Christel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>


        <style> 
            body {
                background-image: url("degustatie1.JPG");
                background-size: 1000px 800px;
                background-repeat: no-repeat;
            }

        </style>
    </head>
    <%@include file="header1.jsp" %>

    <body>
        <%@include file="header2.jsp" %>


        <div style="position: absolute; bottom: 0.6; left: 15.0em; width: 800px; font-weight: bold; color: #cccc00;">
            <br/>
            <font size="10">OPENDEURWEEKEND 2015 </font>
            <br/><br/><br/>
            <font size="6">
            Vrijdag 27 maart    van 19u tot 22u<br/>
            Zaterdag 28 maart   van 14u tot 19u<br/>
            Zondag 29 maart     van 14u tot 18u </font>
            <br/><br/><br/>
            <font size="10">Almal Welkom !</font>

        </div>
    <html>
        <head>
            <style>
                div.background {
                    background: url(degustatie1.JPG);
                    border: 2px solid black;
                }

                div.transbox {
                    margin: 30px;
                    background-color: #ffffff;
                    border: 1px solid black;
                    opacity: 0.6;
                    filter: alpha(opacity=60); /* For IE8 and earlier */
                }

                div.transbox p {
                    margin: 5%;
                    font-weight: bold;
                    color: #000000;
                }
            </style>
        </head>
        <body>

            <div class="background">
                <div class="transbox">
                    <p>This is some text that is placed in the transparent box.</p>
                </div>
            </div>

        </body>
    </html> 
</body>
</html>
