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
	职务管理 &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
	<button onclick="location.href='${pageContext.request.contextPath }/job/toAddJob'">添加</button>
	<table border="1px">
		
		<tr>
			<td>部门名称</td>
			<td>职务编号</td>
			<td>职务名称</td>
			<td>编辑</td>
			
		</tr>
		<c:forEach items="${jobs}" var="job">
			<tr>
				<td>${job.department.dname}</td>
				<td>${job.jid}</td>
				<td>${job.jname}</td>
				
				<td>
					<a href="${pageContext.request.contextPath }/job/deleteJob?jid=${job.jid}">删除</a>|
					<a href="${pageContext.request.contextPath }/job/toUpdateJob?jid=${job.jid}">修改</a>
					
				</td>
			</tr>
		</c:forEach>
		
	</table>
	<tr>
			<c:if test="${job_pageBean.currentpage!=1}">
				<a href="${pageContext.request.contextPath }/job/listjob?currentpage=${job_pageBean.currentpage-1}">上一页</a>
			</c:if>
			<c:if test="${job_pageBean.currentpage==1}">
				<a>上一页</a>
			</c:if>
			<c:forEach begin="1" end="${job_pageBean.totalpage }" var="page">
					<c:if test="${page!=job_pageBean.currentpage }">
						<a href="${pageContext.request.contextPath }/job/listjob?currentpage=${page}">${page }</a>
					</c:if>
					<c:if test="${page==job_pageBean.currentpage }">
						<font size="40px">${page }</font>
					</c:if>
			</c:forEach>
			
			
			<c:if test="${job_pageBean.currentpage!=job_pageBean.totalpage}">
				<a href="${pageContext.request.contextPath }/job/listjob?currentpage=${job_pageBean.currentpage+1}">下一页</a>
			</c:if>
			<c:if test="${job_pageBean.currentpage==job_pageBean.totalpage}">
				<a>下一页</a>
			</c:if>
		</tr>	
</body>
</html>