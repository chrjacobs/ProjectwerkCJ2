<%-- 
    Document   : contact
    Created on : 25-jan-2015, 15:41:49
    Author     : Christel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <body>

        <h2>Send e-mail to someone@example.com:</h2>

        <form action="MAILTO:info@dedruiwekorrel.be" method="post" enctype="text/plain">
            Name:<br>
            <input type="text" name="name" value="your name"><br>
            E-mail:<br>
            <input type="text" name="mail" value="your email"><br>
            Comment:<br>
            <input type="text" name="comment" value="your comment" size="50"><br><br>
            <input type="submit" value="Send">
            <input type="reset" value="Reset">
        </form>

    </body>
</html>
