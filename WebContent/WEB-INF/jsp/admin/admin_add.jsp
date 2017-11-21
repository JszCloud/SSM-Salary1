<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>辅导员用户列表</title>
</head>
<body>
 <p><a href="">添加</a></p>
        <form action="addAdminUser" method="post">
        <p><input type="index" name="adminId" /></p>
        <p><input type="text" name="adminName" "/></p>
        <p><input type="password" name="adminPassword"/></p>
        <p><input type="password" name="adminPassword1"/></p>
        <p><input type="submit" value="提交"/></p>
        </form>
        <script type="text/javascript">
        	
        </script>
</body>
</html>