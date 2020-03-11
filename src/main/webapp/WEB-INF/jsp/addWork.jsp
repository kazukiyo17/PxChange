<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>上传作品</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menubar.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/regular.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sideBar.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/uploadItem.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/workItem.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/lib/jquery-3.4.1.js"></script>
<script>
$(document).ready(function(){
	$("#uploadfile").on("change",uploadFile);
})
</script>
</head>
<body>
	<div class="top">
		<ul class="menubar">
			<li><a href="">按钮1</a>
			<li><a href="">按钮2</a>
			<li><a href="">按钮3</a>
		</ul>
    </div>
    <div class="left">
        <ul class="sidebar">
            <li><a id="side1" href="../items/additempage.do">发布作品</a></li>
            <li><a id="side1" href="">侧按钮2</a></li>
            <li><a id="side1" href="">侧按钮3</a></li>
        </ul>
    </div>
    <div class="middle">
		<div class="uploadImgBtn" id="uploadImgBtn">
			<input class="inputfile" type="file" name="uploadfile" id="uploadfile">
		</div>
		<form method="post" id="work-form"${pageContext.request.contextPath}/js/workItem.js>
			<br>
			作品编号：<input type="text" id="item_id" readonly value="${itemId}">
			<br>
			作品标题：<input type="text" id="item_title">
			<br>
			作者：<input type="text" id="author_id">
			<br>
			作品副标题：<input type="text" id="item_subtitle">
			<br>
			<input type="submit" onclick="addItem()" value="提交">
		</form>
</div>
</body>
</html>