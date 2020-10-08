<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  c:out 태그는 출력문을 만드는 태그이다.
value 속성의 값으로 EL표현식을 사용할 수 있다. 보통 value에 쓴 값이 출력이 되지만 value가 null값이라면  기본값 출력.-->
<c:out value="출력할 값">기본값</c:out><br>
<c:out value="안녕하세요"></c:out><br>
<c:out value="${null }">반갑습니다.</c:out><br>
<c:out value="안녕하세요">반갑습니다.</c:out>
<c:out value="${null }"></c:out>
</body>
</html>