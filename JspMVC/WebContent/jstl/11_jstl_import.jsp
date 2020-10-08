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
c:import 
여러 사이트의 내용을 가지고와서 새로운 서비스를 만드는데 유용한 태그입니다. 
url 속성에 콘텐츠가 있는 주소를 지정하면, 해당주소로 요청하고, 응답 결과를 
받아서 반환합니다.
 --%>
 <textarea rows="10" cols="80">
 <c:import charEncoding="UTF-8" 
 url="http://localhost:8080/JspMVC/default.html">
  </c:import>
  </textarea>
 
 
 <c:import charEncoding="UTF-8" var="default11"
 url="http://localhost:8080/JspMVC/default.html">
 </c:import>
 <textarea rows="10" cols="80">${default11}</textarea>
 
 


</body>
</html>