<%-- 
    Document   : fotos
    Created on : 20-dec-2014, 18:50:47
    Author     : Christel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>De Druiwekorrel</title>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap op local PC
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
           <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
          -- Bootstrap voor carrousel 
           <link href="css/bootstrap.min.css" rel="stylesheet">
           <script src="js/jquery-2.1.1.min.js"></script>
           <script src="js/bootstrap.min.js"></script>
           <script src="js/wow.min.js"></script> 
        -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
        <!-- Bootstrap voor carrousel -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/jquery-2.1.1.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/wow.min.js"></script> 
        <!-- deze code gebruiken want bovenstaande URL is niet correct -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/jquery-2.1.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script> 

        <style>
            .carousel-inner > .item > img,
            .carousel-inner > .item > a > img {
                width: 60%;
                margin: auto;
            }
        </style>
    </head>

    <BODY style="background-color: #ffffcc">

        <img src="Banner01.png" alt="DeDruiwekorrel"> 
        <img src="Banner02.png" alt="DeDruiwekorrel"> 
        <img src="Banner03.jpg" alt="DeDruiwekorrel"> 
        <img src="Banner04.jpg" alt="DeDruiwekorrel"> 
        <img src="Banner05.jpg" alt="DeDruiwekorrel"> 

        <ul class="nav nav-tabs" style="background-color: #ffffcc">
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="menu.html">Home</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="WijnhuisController">Wijnhuizen</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="WijnController">Wijnen</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="lijstFotos.jsp">Foto's</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="contact.jsp">Contact</a></li>
        </ul>


        <div class="container">
            <br>
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                    <li data-target="#myCarousel" data-slide-to="3"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">

                    <div class="item active">
                        <img src="oceaan.JPG" alt="Zuid-Afrika" width="460" height="345">
                        <div class="carousel-caption">
                            <h3>Zuid-Afrika</h3>
                            <p>Mooie landschappen</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="Terras.JPG" alt="Terras" width="460" height="345">
                        <div class="carousel-caption">
                            <h3>Constantia Uitsig</h3>
                            <p>Lekkere wijn</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="alleebleue.jpg" alt="AlleeBleue" width="460" height="345">
                        <div class="carousel-caption">
                            <h3>Allee Bleue</h3>
                            <p>Gastvrijheid</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="OomSammie.JPG" alt="Zuid-Afrika" width="460" height="345">
                        <div class="carousel-caption">
                            <h3>Zuid-Afrika</h3>
                            <p>Gezelligheid</p>
                        </div>
                    </div>

                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>

            </div>
        </div>

        <footer> &#169; 2014&nbsp;   't Wijnhuisje BVBA - Provinciesteenweg 442   2530 Boechout - Gsm: 0485/63.86.37</footer>



    </body>
