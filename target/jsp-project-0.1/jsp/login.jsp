
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign Up!
    </div>
    <form method="post" action="/login">
        <label for="name">User name
            <input class="input-field" type="text" id="name" name="name">
        </label>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <input type="submit" value="Sign Up">
    </form>



    <form action="/registration" method="POST">
        Name: <input type="text" required="required" name="name"/><br/><br/>
        Password: <input type="password" required="required" name="password"/><br/><br/>
        Money: <input type="number" required="required" name="money"/><br/><br/>
        <hr>

        <br/><br/>
        <hr>
        <button type="submit">Registration</button>

    </form>


</div>
</body>
</html>
