<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
c:url 
URL을 만들 때 사용하는 태그입니다.  이 태그를 사용하면 매개변수를 포함한 
URL을 손쉽게 만들수 있습니다. 
 --%>
	<c:url var="calcUrl" 
	value="http://localhost:8080/JspMVC/calc/Calculator.jsp">
	    <c:param name="v1" value="20"></c:param>
		<c:param name="v2" value="30"></c:param>
		<c:param name="op" value="+"></c:param>
	</c:url>
	<a href="${calcUrl}">계산하기</a>
	

</body>
</html>