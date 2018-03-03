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
	员工管理 &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
	<form action="${pageContext.request.contextPath }/employee/findEmployee">
		部门：<select name="department" id="departmentid" onchange="selectEmployee(this.value)">
				<option value="0">---请选择---</option>
				<c:forEach items="${SessionDepartments}" var="department">
					<option value="${department.did }">${department.dname}</option>		
				</c:forEach>
			</select>
		职务：<select id="job" name="job">
			<option value="0">---请选择---</option>
			<c:forEach items="${SessionJobs}" var="job">
				<option value="${job.jid }">${job.jname}</option>		
			</c:forEach>
		</select>
		姓名：<input type="text" name="ename">
		<input type="submit" value="高级查询">
		
	</form>
	<button onclick="location.href='${pageContext.request.contextPath }/employee/toAddEmployee'">添加</button>
	
	<table border="1px">
		
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>入职时间</td>
			<td>所属部门</td>
			<td>职务</td>
			<td>编辑</td>
			
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.eid}</td>
				<td>${employee.ename}</td>
				<c:if test="${employee.gender==1}">
					<td>男</td>
				</c:if>
				<c:if test="${employee.gender==0}">
					<td>女</td>
				</c:if>
				<td>${employee.entrytime}</td>
				<td>${employee.em_job.department.dname}</td>
				<td>${employee.em_job.jname}</td>
				<td>
					<a href="${pageContext.request.contextPath }/employee/deleteEmployee?eid=${employee.eid}">删除</a>|
					<a href="${pageContext.request.contextPath }/employee/toUpdateEmployee?eid=${employee.eid}">修改</a>
					
				</td>
			</tr>
		</c:forEach>
		
	</table>
	<tr>
			<c:if test="${em_pageBean.currentpage!=1}">
				<a href="${pageContext.request.contextPath }/employee/listemployee?currentpage=${em_pageBean.currentpage-1}">上一页</a>
			</c:if>
			<c:if test="${em_pageBean.currentpage==1}">
				<a>上一页</a>
			</c:if>
			<c:forEach begin="1" end="${em_pageBean.totalpage }" var="page">
					<c:if test="${page!=em_pageBean.currentpage }">
						<a href="${pageContext.request.contextPath }/employee/listemployee?currentpage=${page}">${page }</a>
					</c:if>
					<c:if test="${page==em_pageBean.currentpage }">
						<font size="40px">${page }</font>
					</c:if>
			</c:forEach>
			
			
			<c:if test="${em_pageBean.currentpage!=em_pageBean.totalpage}">
				<a href="${pageContext.request.contextPath }/employee/listemployee?currentpage=${em_pageBean.currentpage+1}">下一页</a>
			</c:if>
			<c:if test="${em_pageBean.currentpage==em_pageBean.totalpage}">
				<a>下一页</a>
			</c:if>
		</tr>	
</body>

<!-- <script>
			function selectEmployee(val){
				var job = document.getElementById("job");
				//清空select中的option的值
				job.length = 0;
				var department = new Array();
				
				department[1] = new Array("1");
				department[2] = new Array("暂时无职务");
				department[3] = new Array("6");
				department[4] = new Array("2", "5");
				
				for(var i=0;i<department[val].length;i++){
					//获得文本内容并生成文本节点，并生成option标签节点，并添加到select中
					var textNode = document.createTextNode(department[val][i]);
					var optNode = document.createElement("option");
					optNode.appendChild(textNode);
					job.appendChild(optNode);
				}
			}
			
			
	</script> -->
</html>