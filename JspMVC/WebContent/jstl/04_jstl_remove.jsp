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
c:remove 태그는 var 속성에 이름을 지정하면, 보관소에서 해당 이름을 지닌 값을 제거한다. 물론 scope에서 보관소를 명시할 수 있다.
(scope의 기본값은 page)
 --%>
<h3>보관소에 보관된 값 제거</h3>
<% pageContext.setAttribute("username1", "홍길동"); %>
${username1 }<br>
<c:remove var ="username1"/>
현재 username1:
${username1 }<br>
</body>
</html>