<%@page import="java.util.HashMap"%>
<%@page import="com.sun.javafx.collections.MappingChange.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%pageContext.setAttribute("scores", new int[]{90,80,70,100}); %>
${scores[2]}
${pageScope.scores[2]}






<% 
Map<String, String> map = new HashMap<String, String>();
map.put("s01", "홍길동");
map.put("s02", "임꺽정");
map.put("s03","일지매");

%>
</body> 
</html>