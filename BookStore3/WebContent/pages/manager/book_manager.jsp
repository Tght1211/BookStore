<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书管理</title>
<%@ include file="/WEB-INF/include/base.jsp"%>
</head>
<body>

	<div id="header">
		<img class="logo_img" alt="" src="static/img/logo.gif"> <span
			class="wel_word">图书管理系统</span>
		<%@ include file="/WEB-INF/include/base.jsp"%>
	</div>

	<div id="main">
		<table>
			<tr>
				<td>名称</td>
				<td>价格</td>
				<td>作者</td>
				<td>销量</td>
				<td>库存</td>
				<td colspan="2">操作</td>
			</tr>
			<tr>
				<td>时间简史</td>
				<td>20.00</td>
				<td>霍金</td>
				<td>200</td>
				<td>400</td>
				<td><a href="book_edit.html">修改</a></td>
				<td><a href="#">删除</a></td>
			</tr>

			<tr>
				<td>时间简史</td>
				<td>20.00</td>
				<td>霍金</td>
				<td>200</td>
				<td>400</td>
				<td><a href="book_edit.html">修改</a></td>
				<td><a href="#">删除</a></td>
			</tr>

			<tr>
				<td>时间简史</td>
				<td>20.00</td>
				<td>霍金</td>
				<td>200</td>
				<td>400</td>
				<td><a href="book_edit.html">修改</a></td>
				<td><a href="#">删除</a></td>
			</tr>

			<tr>
				<td>时间简史</td>
				<td>20.00</td>
				<td>霍金</td>
				<td>200</td>
				<td>400</td>
				<td><a href="book_edit.html">修改</a></td>
				<td><a href="#">删除</a></td>
			</tr>

			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="book_edit.html">添加图书</a></td>
			</tr>
		</table>
	</div>

	<div id="bottom">
		<span> 尚硅谷书城.Copyright &copy;2015 </span>
	</div>
</body>
</html>