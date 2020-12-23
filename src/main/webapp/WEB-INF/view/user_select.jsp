<%--
  Created by IntelliJ IDEA.
  User: lkf
  Date: 2020/12/23
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
	<script type="application/javascript" src="../static/js/jquery-3.5.1.min.js"></script>
	<script type="application/javascript">
		function update(){
			//通过jquery的serialize()函数，将表数据进行序列化
			var formData=$("#updateForm").serialize();
			//进行异步添加
			$.ajax({
				//异步提交
				url:"update1",
				type:"POST",
				//请求参数
				data:formData,
				//返回数据格式
				dataType:"json",
				success:function (data){
					if (data){
						alert("修改成功");
					}else {
						alert("修改失败");
					}
				}
			});
		}
	</script>
</head>
<body>
<form  id="updateForm">
	<table>
		<h6>${name}</h6>
	</table>
</form>
</body>
</html>


