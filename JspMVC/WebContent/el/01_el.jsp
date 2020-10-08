<%@page import="spms.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
EL(Expression Language)는 콤마와 대괄호를 사용하여 자바 빈의 속성이나 앱, 리스트, 배열의 값을 보다 쉽게 꺼내게 해주는 기술이다.
또한 스태틱으로 선언된 메소드를 호출할 수도 있다. EL을 사용하면 액션태그를 사용하는 것보다 훨씬 더 간단히 보관소에 들어있는 객체에 접근하여 값을 꺼내거나 
메소드를 호출할 수 있다. 
 -->


<%//MemberVO member = (MemberVO)request.getAttribute("Member"); %>
<%//=member.getEmail() %>

${member.email}	
-->
(자바 형식으로 작성해보기)
MemberVO obj = (MemberVO)pageContext.findAttribute("member");
-->보관소를 뒤져서 객체를 찾는 메소드, 
(보관소 뒤지는 순서) jspContext -> ServletRequest -> HttpSession ->ServletContext  -> null(그래도 없으면 null을 반환한다.)
EL은 모든 저장소를 뒤지기 때문에scope자체를 사용하지 않아도 된다.
String email = obj.getEmail();
</body>
</html>