<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AGE FORM</title>
</head>
<body>
How old are you, ${humanName}?
<br>
<br>
<form action="/setAge" method="get">
    <input type="text" name="humanAge" placeholder="Type your age here"/>
    <input type="submit"/>
</form>

</body>
</html>