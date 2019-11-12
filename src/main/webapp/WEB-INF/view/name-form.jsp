<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NAME FORM</title>
</head>
<body>
What is your name?
<br>
<br>
<form action="/setName" method="get">
    <input type="text" name="humanName" placeholder="Type your name here"/>
    <input type="submit"/>
</form>

</body>
</html>