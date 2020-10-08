<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
c:choose 
자바의 switch , case 등과 같은 기능을 수행합니다. 
즉 여려가지 조건에 따라 다른 작업을 해야할 필요가 있을 때 이 태그를 사용합니다. 
--%>
<c:set var="userid" value="admin"></c:set>
<c:choose> <%--  switch 부분 --%>
	<c:when test="${userid=='hong'}"><%--  case 부분 --%>
		홍길동님 반갑습니다.              <%--  실행 부분 --%>
	</c:when>
	<c:when test="${userid=='leem'}">
		임꺽정님 반갑습니다. 
	</c:when>
	<c:when test="${userid=='admin'}">
		관리자 전용 페이지 입니다. 
	</c:when>
	<c:otherwise> 					<%--  default 부분 --%>
		등록되지 않은 사용자입니다. 
	</c:otherwise>
</c:choose>

</body>
</html>