<%--
  Created by IntelliJ IDEA.
  User: shaowenhao
  Date: 2022/2/27
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<!--点击注册按钮 就会把表单发送给save方法-->
<body>
    <form action="/hello/save" method="post">
        用户id: <input type="text" name="id"/> <br/>
        用户名: <input type="text" name="name"/> <br/>
        用户地址:<input type="text" name="address.value"/><br/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
