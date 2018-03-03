<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	部门管理 &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
	<button onclick="location.href='${pageContext.request.contextPath }/department/toAddDepartment'">添加</button>
	<table border="1px">
		
		<tr>
			<td>部门编号</td>
			<td>部门名称</td>
			<td>编辑</td>
			
		</tr>
		<c:forEach items="${departments}" var="department">
			<tr>
				<td>${department.did}</td>
				<td>${department.dname}</td>
				
				<td>
					<a href="${pageContext.request.contextPath }/department/deleteDepartment?did=${department.did}">删除</a>|
					<a href="${pageContext.request.contextPath }/department/toUpdateDepartment?did=${department.did}">修改</a>
					
				</td>
			</tr>
		</c:forEach>
		
	</table>
	<tr>
			<c:if test="${pageBean.currentpage!=1}">
				<a href="${pageContext.request.contextPath }/department/listdepartment?currentpage=${pageBean.currentpage-1}">上一页</a>
			</c:if>
			<c:if test="${pageBean.currentpage==1}">
				<a>上一页</a>
			</c:if>
			<c:forEach begin="1" end="${pageBean.totalpage }" var="page">
					<c:if test="${page!=pageBean.currentpage }">
						<a href="${pageContext.request.contextPath }/department/listdepartment?currentpage=${page}">${page }</a>
					</c:if>
					<c:if test="${page==pageBean.currentpage }">
						<font size="40px">${page }</font>
					</c:if>
			</c:forEach>
			
			
			<c:if test="${pageBean.currentpage!=pageBean.totalpage}">
				<a href="${pageContext.request.contextPath }/department/listdepartment?currentpage=${pageBean.currentpage+1}">下一页</a>
			</c:if>
			<c:if test="${pageBean.currentpage==pageBean.totalpage}">
				<a>下一页</a>
			</c:if>
		</tr>	
</body>
</html>