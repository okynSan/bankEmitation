<%-- 
    Document   : userAdministation
    Created on : Apr 5, 2017, 12:06:31 AM
    Author     : andrey_zatvornitskiy
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
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

        <div id="savedUsers">
            <c:if test="${!empty userList}">
                <table class="flatTable">
                    <tr class="titleTr">
                        <td class="titleTd">Users List</td>
                        <td colspan="4"></td>
                        <td class="plusTd button"></td>
                    </tr>
                    <tr class="headingTr">
                        <td>ID</td>
                        <td>Name</td>
                        <td>Surname</td>
                        <td>E-mail</td>
                        <td>Edit</td>
                        <td>Delete</td>
                    </tr>
                    
                    <c:forEach items="${bookList}" var="book">
                        <tr>
                            <td>${user.id}</td>
                            <td><a href="/bookdata/${book.id}" target="_blank">${book.bookName}</a></td>
                            <td>${user.userName}</td>
                            <td>${user.userSurname}</td>
                            <td><a href="<c:url value='/remove/$userbook.id}'/>">Edit</a></td>
                            <td><a href="<c:url value='/remove/${user.id}'/>">Delete</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </div>


    </body>
</html>
