<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
request.getParameter("id") :
<%=request.getParameter("id") %><br>
param.id : ${param.id}
<!-- request.getParameter()의 역할을 \${param.매개변수}로 가능합니다. -->
</body>
</html>