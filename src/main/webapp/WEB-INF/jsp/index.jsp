<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>TEST</title>
</head>
<body>
${test}
<br>
${id}-${name}
<div id="login_div">
    <form id="login_form" name="login_form" action="/loginAction" method="post">
        <label>ID : </label>
        <input name="id" type="text" value=""/>
        <label>Pass : </label>
        <input name="pass" type="password" value=""/>
        <input type="submit">

    </form>
</div>
</body>
</html>