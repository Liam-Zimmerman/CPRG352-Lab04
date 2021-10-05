<%-- 
    Document   : viewnote.jsp
    Created on : Oct 1, 2021, 1:12:45 PM
    Author     : 854292
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p>Title: ${title}</p>
        <p>Contents: ${contents}</p>  
        <a href="note?edit">Edit</a>
    </body>
</html>
