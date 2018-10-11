<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/23
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/controller/reg" method="post">
    <p>昵称:<input type="text" name="name" id="name"></p>
    <p>密码:<input type="text" name="pwd" id="pwd"></p>
    <input type="submit" value="提交注册信息">
</form>
</body>
</html>
