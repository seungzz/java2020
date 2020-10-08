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
c:forTokens
이 태그를 사용해서 문자열을 특정 구분자로 분리하여 반복문을 돌릴 수 있습니다. 
 --%>
<%pageContext.setAttribute("tokens", "v1=20&v2=30&op=+"); %>

<ul>
<c:forTokens var="item" items="${tokens}" delims="&">
	<li>${item}</li>
</c:forTokens>

</ul> 
 
</body>
</html>