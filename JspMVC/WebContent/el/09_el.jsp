<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
and, or, not, sq, ne, lt, gt, le, ge, true, false, null, instanceof, empty, div, mod
<!-- EL에서 사용하거나   사용하기로 한 예약어들은 사용이 불가능합니다.-->

<%
pageContext.setAttribute("ne", "될까?");
%>

<%--${ne} --%>

</body>
</html>