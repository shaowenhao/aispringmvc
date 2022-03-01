<%--
  Created by IntelliJ IDEA.
  User: shaowenhao
  Date: 2022/3/1
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/data/list" method="post">
    用户1id: <input type="text" name="users[0].id"/> <br/>
    用户1名: <input type="text" name="users[0].name"/> <br/>
    <input type="submit" value="注册"/>
    </form>
</body>
</html>
