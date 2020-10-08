<%@page import="spms.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <jsp:useBean id="member" scope="session" class="spms.vo.MemberVO"></jsp:useBean>
   
   
    <%
    
 //   MemberVO member = (MemberVO)session.getAttribute("member");
    %>
<div style="background-color:#00008b;color:#ffffff; height:20px;padding:5px;">
SPMS(Simple Project Management System)
<% if(member.getEmail() !=null) {
	
	%>


<span style ="float:right;">
<%=member.getName() %>
<a style="color:white;" 

href="<%=request.getContextPath()%>/auth/Logout">로그아웃</a></span> 

<%} else { %>
	
<span style ="float:right;">
<a style="color: white; href="../auth/login>로그인</a>
</span>
<%} %>

</div>
