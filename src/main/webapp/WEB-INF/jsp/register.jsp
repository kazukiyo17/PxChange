<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>index</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/lib/jquery-3.4.1.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/offer.js"></script>
</head>
<body>
	<form id="newofferform" method="post">
		<table>
			<tr>
				<td>邮箱</td>
				<td><input id="regi-email" type="text" /></td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input id="regi-name" type="text" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input id="regi-password" type="text" /></td>
			</tr>
			<tr>
				<td>确认密码</td>
				<td><input id="regi-password-again" type="text" /></td>
			</tr>

		</table>
		<input type="submit" onclick="sendOfferInfo()" value="提交">
	</form>
</body>
</html>