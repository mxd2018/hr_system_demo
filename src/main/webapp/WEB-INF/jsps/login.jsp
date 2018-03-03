<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="employeeForm" action="${pageContext.request.contextPath}/employee/login.action" method="get">
		账号：<input type="text" name="ename"><br>
		密码：<input type="password" name="password"><br>
		<input type="submit" value="登录">
		<b><font color="red" id="mess"></font></b>
	</form>
	
</body>

<!-- <script type="text/javascript">
	$(function(){
		$("#employeeForm").validate({
			rules:{
				ename:"required",
				password:"required"
			},
			messages:{
				ename:"工号不能为空",
				password:"密码不能为空"
			},
			submitHandler:function(){
				//Ajax提交表单
				$.ajax({
					data:$("#employeeForm").serialize(),
					dataType:"text",
					type:"post",
					url:"${pageContext.request.contextPath}/employee/login.action",
					success:function(rec){
						if(rec=="0"){
							$("#mess").html("用户名或密码错误");
						}else{
							location.href = "${pageContext.request.contextPath}/employee/toindex.action"
						}	
					}
				});
			}
		});
		
		
	})
</script> -->
</html>
