<%--
  Created by IntelliJ IDEA.
  User: z00498ta
  Date: 3/2/2022
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<!--点击注册按钮 就会把表单发送给save方法-->
<body>
<form action="/data/map" method="post">
    用户1id: <input type="text" name="users['a'].id"/> <br/>
    用户1名: <input type="text" name="users['a'].name"/> <br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
