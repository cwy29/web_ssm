<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/23
  Time: 9:31
  To change this template use File | Settings | File Templates.
  【${pageContext.request.contextPath}用于解决使用相对路径时出现的问题
  注意：web.xml必须放在WEB-INF文件夹下】
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/controller/login" method="post">
    <p>昵称:<input type="text" name="name" id="name"></p>
    <p>密码:<input type="text" name="pwd" id="pwd"></p>
    <input type="submit" value="登录">
</form>
<a href="${pageContext.request.contextPath}/controller/toReg">新用户注册</a>
</body>
</html>
