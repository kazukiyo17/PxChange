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
				<td>委托用途</td>
				<td>
					<input id="usage" name="usage" type="radio" value="1" checked />商业委托
				 	<input id="usage" name="usage" type="radio" value="2" />个人委托
				 </td>
			</tr>
			<tr>
				<td>委托标题</td>
				<td><input id="title" type="text" /></td>
			</tr>
			<tr>
				<td>类型</td>
				<td>
					<select id="type-select" name="type" required>
						<c:forEach var="type" items="${typelist}">
							<option value="${type.typeid}">${type.typename}</option>
						</c:forEach>
					</select> 
					<input id="type-select-text" type="text" hidden />
				</td>
			</tr>
			<tr>
				<td>风格</td>
				<td>
					<input id="styles" type="checkbox" value="2" />日系 
					<input id="styles" type="checkbox" value="3" />古风 
					<input id="styles" type="checkbox" value="4" />欧美风
					<input id="add-styles" type="checkbox" value="1" />其它
					<br>
					<input id="styles-text" type="text" hidden />
				</td>
			</tr>
			<tr>
				<td>价格区间</td>
				<td>
					<input id="price-min" type="text" />-
					<input id="price-max" type="text" />
				</td>
			</tr>
			<tr>
				<td>颜色模式</td>
				<td>
					<c:forEach var="patten" items="${pattenlist}">
						<input id="color-patten" type="checkbox" value="${patten.pattenid}" />${patten.pattenname} 
					</c:forEach>
					<input id="add-color-patten" type="checkbox" value="1" />其它
					<br>
					<input id="color-patten-text" type="text" hidden />
				</td>
			</tr>
			<tr>
				<td>尺寸</td>
				<td>
					<input id="size-width" type="text" />x
					<input id="size-height" type="text" /> 
					<select id="size-unit" required>
							<option value="1" selected="selected">像素</option>
							<option value="2">厘米</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>文件格式</td>
				<td>
					<c:forEach var="format" items="${formatlist}">
						<input id="format" type="checkbox" value="${format.formatid}" />${format.formatname}  
					</c:forEach>
					<input id="add-format" type="checkbox" value="1" />其它
					<br>
					<input id="format-text" type="text" hidden />
			</tr>
			<tr>
				<td>是否需要试稿</td>
				<td>
					<input id="test-drw" name="test-drw" type="radio" value="1" checked />是 
					<input id="test-drw" name="test-drw" type="radio" value="2" />否
				</td>
			</tr>
			<tr>
				<td>是否需要定期反馈</td>
				<td>
					<input id="feedback" name="feedback" type="radio" value="1" checked />是 
					<input id="feedback" name="feedback" type="radio" value="2" />否
				</td>
			</tr>
			<tr>
				<td>截稿日期</td>
				<td><input id="deadline" type="date" /></td>
			</tr>
			<tr>
				<td>详细说明：</td>
				<td><input id="description" type="text" /></td>
			</tr>
			<tr>
				<td>参考图片：</td>
				<td></td>
			</tr>
		</table>
		<input type="submit" onclick="sendOfferInfo()" value="提交">
	</form>
</body>
</html>