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
		function save(){
			//通过jquery的serialize()函数，将表数据进行序列化
			var formData=$("#saveForm").serialize();
			//进行异步添加
			$.ajax({
				//异步提交
				url:"save1",
				type:"POST",
				//请求参数
				data:formData,
				//返回数据格式
				dataType:"json",
				success:function (data){
					if (data){
						alert("保存成功");
					}else {
						alert("保存失败");
					}
				}
			});
		}
	</script>
</head>
<body>
<form  id="saveForm">
		<table>
			<tr>
				<td style="text-align: right">
					<label>用户姓名：</label>
				</td>
				<td>
					<input type="text" name="name" style="width: 300px;" placeholder="请填写您的姓名">
				</td>
			</tr>
			<tr>
				<td style="text-align: right">
					<label>手机号码：</label>
				</td>
				<td>
					<input type="text" name="cellphone" style="width: 300px;" placeholder="请填写您的手机号">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right">
					<button type="button" onclick="save()">保存</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
