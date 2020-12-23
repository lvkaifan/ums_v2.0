<%--
  Created by IntelliJ IDEA.
  User: lkf
  Date: 2020/12/23
  Time: 13:23
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
			var formData=$("#deteleForm").serialize();
			//进行异步添加
			$.ajax({
				//异步提交
				url:"detele1",
				type:"POST",
				//请求参数
				data:formData,
				//返回数据格式
				dataType:"json",
				success:function (data){
					if (data){
						alert("删除成功");
					}else {
						alert("删除失败");
					}
				}
			});
		}
	</script>
</head>
<body>
<form  id="deteleForm">
	<table>
		<tr>
			<td style="text-align: right">
				<label>删除用户：</label>
			</td>
			<td>
				<input type="text" name="id" style="width: 300px;" placeholder="请填写您要删除的用户ID">
			</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align: right">
				<button type="button" onclick="save()">删除</button>
			</td>
		</tr>
	</table>
</form>
</body>
</html>
