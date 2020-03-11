<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>委托</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/menubar.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/regular.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/sideBar.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/content.css">
</head>
<body>
	<div class="top">
		<ul class="menubar">
			<li><a href="">首页</a>
			<li><a href="">画师</a>
			<li><a href="">委托</a>
		</ul>
    </div>
    <div class="left">
        <ul class="sidebar">
            <li><a id="side1" href="../items/additempage.do">商业委托</a></li>
            <li><a id="side1" href="">个人委托</a></li>
            <li><a id="side1" href="">我关注的</a></li>
        </ul>
    </div>
    <div class="middle">
        <div class="content">
            <div class="workcard">
            	<a href="">${itemlist.get(0).getId()}</a>
            	<a href="">${itemlist.get(0).getTitle()}</a>
            </div>
            <div class="workcard">
            	<a href="">${itemlist.get(1).getId()}</a>
            	<a href="">${itemlist.get(1).getTitle()}</a>
            </div>
            <div class="workcard">

            </div>
            <div class="workcard">

            </div>
            <div class="workcard">

            </div>
            <div class="workcard">

            </div>
        </div>
    </div>
</body>
</html>