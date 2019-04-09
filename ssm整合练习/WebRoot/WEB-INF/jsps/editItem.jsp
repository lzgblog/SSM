<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
<script type="text/javascript" src="jquery-1.8.3.js"></script>
<script type="text/javascript" src="jquery.form.js"></script>

<script type="text/javascript">
	function uploadpic(){	
	var option={
		url:"${pageContext.request.contextPath }/pic/upload",
		type:"POST",
		data:{"fileName":"pictureFile"},
		dataType:"text",
		success:function(data){
				//把json格式的字符串转换成json对象
				var jsonObj = $.parseJSON(data);
				//返回服务器图片路径，把图片路径设置给img标签
				$("#imgSize1ImgSrc").attr("src",jsonObj.fullPath);
				//数据库保存相对路径
				$("#imgSize1").val(jsonObj.relativePath);
			}
	};
	
		$("#itemForm").ajaxSubmit(option);
}
	

</script>
</head>
<body> 
<form id="itemForm" action="${pageContext.request.contextPath }/item/update" method="post">
<input type="hidden" name="id" value="${item.id }">
修改商品信息：
<table width="100%" border=1>
<tr>
	<td>商品名称</td>
	<td><input type="text" name="name" value="${item.name}"/></td>
</tr>
<tr>
	<td>商品价格</td>
	<td><input type="text" name="price" value="${item.price }"/></td>
</tr>
<tr>
	<td>商品生产日期</td>
	<td><input type="text" name="createtime" value="<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
</tr>
<tr>
	<td>商品图片</td>
	<td>		
			<img id="imgSize1ImgSrc" src='${picPath }${item.pic }' width=100 height=100/>
			<br/>
		<input type="file"  id="picture" name="pictureFile" onchange="uploadpic()"/> 
		<input type="hidden"  id="imgSize1" name="pic" value=""/> 
	</td>
</tr>
<tr>
	<td>商品简介</td>
	<td>
	<textarea rows="3" cols="30" name="detail">${item.detail }</textarea>
	</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>