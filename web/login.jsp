<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="/login" method="get">
    账号：<input type="text" name="account" value="admin"><br><br>
    密码：<input type="text" name="password" value="123"><br><br>

    <select name="selectDay">
        <option value="1">每次都需要登录</option>
        <option value="2">10天</option>
        <option value="3">30天</option>
    </select>
    <br><br>

    <input type="submit" value="登录">
</form>

</body>
</html>
