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
	
	<form action="${pageContext.request.contextPath }/job/updateJob">
	<input type="hidden" name="jid" value="${selectJobById.jid}"/>
	<table border="1px">
		<tr>
			<td>修改职务名称</td>
			<td>
				<input type="text" value="${selectJobById.jname }" name="jname"> 
			</td>
		</tr>
		<tr>
				<td>修改所属部门</td>
				<td>
					<select name="departmentid" id="departmentid">
						<c:forEach items="${SessionDepartments}" var="department">
							
								<option value="${department.did }">${department.dname}</option>
							
						</c:forEach>
					</select>
				</td>
			</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="修改">
			</td>
		</tr>
		
		
	</table>
	</form>
</body>
</html>