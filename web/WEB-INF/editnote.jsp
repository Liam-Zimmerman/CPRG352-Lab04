<%-- 
    Document   : editnote
    Created on : Oct 1, 2021, 1:13:22 PM
    Author     : 854292
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        
        <form method="POST" action="note">
            <label>Title:</label>
            <input type="text" name="editTitle" value="${title}"></input>
            <br>
            <label>Contents:</label>
            <textarea name="editContents">${contents}</textarea>
            <br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
