<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");

%>

<!-- parameter에서 꺼내왔다 (파이썬의 타겟과 비슷함.)
	%의 아이디에서 꺼내서 씀	
 -->

<h1>안녕하세요<%=id %>	</h1>			
<h1>회원님의 이름은 <%=name %>입니다.</h1>
