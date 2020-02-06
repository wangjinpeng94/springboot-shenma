<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="content-Type" content="text/html;charset=utf-8">
<title>用户列表展示</title>

</head>
<body>
<h3>用户列表展示</h3>
<table border="1">
<tr>
<th>姓名</th>
<th>年龄</th>
</tr>

<c:foreach items="${list}" var="user">
<tr>
<td>${user.name}</td>
<td>${user.age}</td>
</tr>
</c:foreach>
</table>
</body>
</html>