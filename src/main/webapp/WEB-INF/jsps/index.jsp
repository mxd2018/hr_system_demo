<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎${sessionEmployee.ename}!<br>
	<a href="${pageContext.request.contextPath}/department/listdepartment.action">部门管理</a><br>
	<a href="${pageContext.request.contextPath}/job/listjob.action">职务管理</a><br>
	<a href="${pageContext.request.contextPath}/employee/listemployee.action">员工管理</a><br>
</body>

</html>
