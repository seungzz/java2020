
<%@page import="java.util.ArrayList"%>
<%@page import="spms.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/Header.jsp"></jsp:include>
<!-- 
JSP 액션 태그
JSP 페이지를 작성할 때, 가능한 자바 코드의 삽입을 최소화 하는 것이 유지보수에 좋다.
이를 위해 JSP에서는 다양한 전용 태그를 제공하고 있다.
JSP에서 기본으로 제공하는 태그들의 집합을 JSP액션 이라고 한다. 
 -->
<h1>회원목록</h1>
<p><a href='add.do'>신규 회원</a></p>
<jsp:useBean id="members" scope="request" class="java.util.ArrayList" type="java.util.ArrayList<spms.vo.MemberVO>"></jsp:useBean>


<%
//List<MemberVO> members = (ArrayList<MemberVO>)request.getAttribute("members");

for(MemberVO member : members) {
%>	
<%=member.getNo() %>,
<a href = 'update.do?no=<%=member.getNo() %>'>
<%=member.getName() %></a>,
<%=member.getEmail() %>,
<%=member.getCreateDate() %>
<a href ='delete.do?no=<%=member.getNo() %>'>[삭제]</a><br>
<%
}
%>

<jsp:include page="/Tail.jsp"></jsp:include>
</body>
</html>