<%-- 
    Document   : login
    Created on : May 27, 2025, 8:40:31 PM
    Author     : Nguyen Tien Dat
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2>Login</h2>
<form action="LoginServlet" method="post">
    <label>Bạn là:</label>
    <select name="userType">
        <option value="coach">Coach</option>
        <option value="member">Member</option>
    </select><br><br>

    <label>ID:</label>
    <input type="text" name="userID" required><br><br>

    <label>Mật khẩu:</label>
    <input type="password" name="password" required><br><br>

    <input type="submit" value="Đăng nhập">
    
    
    alo alo
</form>
</body>
</html>
