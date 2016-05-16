<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>添加学生信息</h1>
<hr>
<div align="center" >
<form action="addCategory.action" method="post">
<font size="+3" color="yellow">
	学生姓名：<input type="text" name="name"/><br/>
	学号：<input type="text" name="number"/><br/>
	性别：<input type="text" name="sex"/><br/>
	专业：<input type="text" name="zy"/><br/>
	<input type="submit" value="添加"/>
</font>
</form>
</div>
</body>
</html>