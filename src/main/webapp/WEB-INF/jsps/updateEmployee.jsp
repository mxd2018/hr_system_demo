<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>

	<form
		action="${pageContext.request.contextPath }/employee/updateEmployee.action">
		<input type="hidden" name="eid" value="${selectEmployeeById.eid}">
		<table border="1px">
			<tr>
				<td>员工姓名</td>
				<td><input type="text" name="ename"
					value="${selectEmployeeById.ename}"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="radio" name="gender" value="1">男 <input
					type="radio" name="gender" value="0">女</td>
			</tr>
			<tr>
				<td>入职时间</td>
				<td><input type="date" name="entrytime"
					value="${selectEmployeeById.entrytime }"></td>
			</tr>

			<tr>
				<td>所属部门</td>
				<td><select name="department" id="departmentid"
					onchange="updateEmployee(this.value)">
						<option value="0">---请选择---</option>
						<c:forEach items="${SessionDepartments}" var="department">

							<option value="${department.did }">${department.dname}</option>

						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>职务</td>
				<td><select id="job" name="job">
					<option value="0">---请选择---</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="修改"></td>
			</tr>


		</table>
	</form>
</body>

<script>
	function updateEmployee(val) {
		var job = document.getElementById("job");
		//清空select中的option的值
		job.length = 0;
		var department = new Array();

		department[1] = new Array("1");
		department[2] = new Array("暂时无职务");
		department[4] = new Array("2", "5");
		department[3] = new Array("6");
		for (var i = 0; i < department[val].length; i++) {
			//获得文本内容并生成文本节点，并生成option标签节点，并添加到select中
			var textNode = document.createTextNode(department[val][i]);
			var optNode = document.createElement("option");
			optNode.appendChild(textNode);
			job.appendChild(optNode);
		}
	}
</script>

<script>
	window.onload = function() {
		var gender = "${selectEmployeeById.gender}";

		var genders = document.getElementsByName("gender");

		for (var i = 0; i < genders.length; i++) {
			if (genders[i].value == gender) {

				genders[i].checked=true;
			}
		} 
		
		var department = "${selectEmployeeById.department}";
		var departmentid = document.getElementById("departmentid");
		var options = departmentid.getElementsByTagName("option");
		for (var i = 0; i < options.length; i++) {
			if (options[i].value == department) {
				options[i].selected=true;
				
			}
		}
		
		/* var job = "${selectEmployeeById.job}";
		alert(job);
		var job_element = document.getElementById("job");
		var job_options = departmentid.getElementsByTagName("option");
		for (var i = 0; i < job_options.length; i++) {
			if (job_options[i].value == job) {
				job_options[i].selected=true;
				
			}
		} */

	}
</script>


</html>