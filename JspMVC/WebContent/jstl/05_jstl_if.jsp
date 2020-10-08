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
c:if태그는 test속성 값이 참이면 태그 안의 구문이 실행된다. 참거짓 태스트 결과를 보관소에 저장할 수 있다.
<c:if test="조건" var="변수명" scope="">
 --%>
<c:if test="${10>20 }" var="result1">10은 20보다 크다.</c:if>
${result1 }<br>
<c:if test="${10<20 }" var="result2">10은 20보다 작다.</c:if><br>
${result2 }
</body>
</html>