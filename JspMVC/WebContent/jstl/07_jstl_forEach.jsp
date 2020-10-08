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
c:forEach
반복적인 작업을 정의 할때 사용합니다. 목록에서 값을 꺼내어 처리하고 싶을때 사용하는 태그 입니다. (자바의 for문)
 --%>
 
<% 
pageContext.setAttribute("nameList", 
		new String[]{"홍길동","임꺽정","일지매"}); 
pageContext.setAttribute("nameList2", 
		new String[]{"홍길동","임꺽정","일지매","주먹대장","똘이장군"});		

pageContext.setAttribute("nameList3", 
		"홍길동,임꺽정,일지매,주먹대장,똘이장군");
%> 
<ul>
<c:forEach var="name" items="${nameList}">
	<li>${name}</li>
</c:forEach>
</ul>	
	
<ul>

<c:forEach var="name" items="${nameList2}" 
begin="0" end="3">
	<li>${name}</li>
</c:forEach>
</ul>	

<ul>
<c:forEach var="name" items="${nameList3}">
	<li>${name}</li>
</c:forEach>

</ul>


</body>
</html>