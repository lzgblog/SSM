<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath}/user/recivedID.do" method="post">
    	ID:<input type="text" name="id">
    	<input type="submit" value="提交">
    </form>
    <hr size="12" color="red"/>
    <form action="${pageContext.request.contextPath }/user/recivedName.do" method="post">
    	用户名:<input type="text" name="username">
    	<input type="submit" value="提交	">
    </form>
    <hr size="12" color="red"/>
    <form action="${pageContext.request.contextPath}/user/recivedArgu.do" method="post">
    	ID:<input type="checkbox" name="ids" value="1">
    	ID:<input type="checkbox" name="ids" value="2">
    	ID:<input type="checkbox" name="ids" value="3">
    	<input type="submit" value="提交">
    </form>
    <hr size="12" color="red"/>
    <form action="${pageContext.request.contextPath }/user/recivedPOJO.do" method="post">
    	ID:<input type="text" name="id">&nbsp;&nbsp;
    	姓名:<input type="text" name="name">&nbsp;&nbsp;
    	年龄:<input type="text" name="age">&nbsp;&nbsp;
    	<input type="submit" value="提交">
    </form>
     <hr size="12" color="red"/>
    <form action="${pageContext.request.contextPath }/user/recivedUserCost.do" method="post">
    	ID:<input type="text" name="user.id">&nbsp;&nbsp;
    	姓名:<input type="text" name="user.name">&nbsp;&nbsp;
    	年龄:<input type="text" name="user.age">&nbsp;&nbsp;
    	<input type="submit" value="提交">
    </form>
     <hr size="12" color="red"/>
    <form action="${pageContext.request.contextPath }/user/recivedList.do" method="post">
    	ID:<input type="text" name="userList[0].id">&nbsp;&nbsp;
    	姓名:<input type="text" name="userList[0].name">&nbsp;&nbsp;
    	
    	ID:<input type="text" name="userList[1].id">&nbsp;&nbsp;
    	姓名:<input type="text" name="userList[1].name">&nbsp;&nbsp;
    	<input type="submit" value="提交">
    </form>
     <hr size="12" color="red"/>
    <form action="${pageContext.request.contextPath }/user/recivedMap.do" method="post">
    	ID:<input type="text" name="maps['id']">&nbsp;&nbsp;
    	姓名:<input type="text" name="maps['name']">&nbsp;&nbsp;
    	年龄:<input type="text" name="maps['age']">&nbsp;&nbsp;
    	<input type="submit" value="提交">
    </form>
  </body>
</html>
