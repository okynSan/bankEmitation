<%-- 
    Document   : greatings
    Created on : Apr 4, 2017, 11:05:32 PM
    Author     : andrey_zatvornitskiy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <style>
            <%@include file='/WEB-INF/css/navigation.css' %>
        </style>

        <script>
            function startTime() {
                var today = new Date();
                var h = today.getHours();
                var m = today.getMinutes();
                var s = today.getSeconds();
                m = checkTime(m);
                s = checkTime(s);
                document.getElementById('txt').innerHTML =
                        h + ":" + m + ":" + s;
                var t = setTimeout(startTime, 500);
            }
            function checkTime(i) {
                if (i < 10) {
                    i = "0" + i
                }
                ;  // add zero in front of numbers < 10
                return i;
            }
        </script>

    </head>
    <body onload="startTime()">


        <div class="navigation_bar">
            <nav>
                <ul>
                    <li><a href="index">Home</a></li>
                    <li><a href="book">User administration</a></li>
                    <li><a href="welcome.htm">Bill list</a></li>
                    <li style="float:right" ><a href="logout.htm" >Logout</a></li>
                    <li style="float:right" ><a> User name</a></li>
                    <li style="float:right" ><a id="txt" ></a></li>

                </ul>
            </nav>
        </div>

        <div align="center" >
            <img src="http://99px.ru/sstorage/53/2014/11/tmb_115004_7046.jpg" width="800" height="350" />
        </div>



        <div>

        </div>

        <div align="center">
            <div>
                <h1>${message}</h1>
            </div>
        </div>


    </body>
</html>
