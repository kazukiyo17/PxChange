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

<br>
<br>
${offerInfo.title}
<br>
<input id="apply-button" value="应征">
<br>
委托需求
<br>
用途:${offerInfo.usage}
<br>
风格：
<br>
颜色模式：${offerInfo.patten}
<br>
规格尺寸：${offerInfo.size}${offerInfo.sizeunit}
<br>
文件类型：${offerInfo.format}
<br>
价格：${offerInfo.price}
<br>
发布时间：${offerInfo.publishdate}
<br>
是否需要试稿：${offerInfo.testdrw}
<br>
是否需要反馈：${offerInfo.feedback}

<div id="applyblock" style="display: none;">
	价格：<input id="apply-price" type="text" />
	留言：<input id="comment" type="text" />
	<input type="submit" onclick="sendOfferInfo()" value="提交">
</div>
</body>