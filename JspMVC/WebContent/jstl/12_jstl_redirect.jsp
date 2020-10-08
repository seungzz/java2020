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
c:redirect 
이 태그를 사용하여 리다이렉트를 처리할 수 있습니다.  즉 내부적으로 
HttpServletResponse의 sendRedirect()를 호출합니다. 즉시 지정된 
사이트로 이동합니다. 
 --%>
<c:redirect url="http://www.daum.net"></c:redirect>


</body>
</html>