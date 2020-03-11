<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/user.js"></script>
</head>
<body>
<form id="login-form" method="post">
	用户名：<input id="useraccount" type="text" />
	密码：<input id="password" type="text" />
	<input type="submit" onclick="login()" value="提交">
</form>
</body>
</html>