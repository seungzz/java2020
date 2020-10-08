<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% pageContext.setAttribute("title", "EL 연산자"); %>


\${empty title} = ${empty title}  

\${empty title2} = ${empty title2 }
</body>
</html>