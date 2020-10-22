<%--
  Created by IntelliJ IDEA.
  User: hxb227797
  Date: 2020/10/22
  Time: 上午8:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/register.action" method="post" >
    <label><input type="text" id="username"></label>
    <iut type="password" id="password">
    <input type="submit" value="注册" >
</form>

</body>
</html>
