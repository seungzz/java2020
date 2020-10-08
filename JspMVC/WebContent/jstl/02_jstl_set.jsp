<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	c:set 태그는 변수를 생성하거나 기존 변수의 값을 수정할 때 사용합니다.
	jsp 페이지의 로컬변수가 아니라 보관소(jspContext, ServletRequest, HttpSession, ServletContext)에 저장된다.
	scope를 생략하면 page로 자동 선택된다. value는 태그와 태그 사이에 적어도 된다.
	
	<c:set var = "변수명" value="값" scope="page/request/session/application"></c:set>
--%>




<h3>값</h3>
<c:set var ="username1" value="홍길동"></c:set>
<c:set var ="username2">임꺽정</c:set>
${username1 }<br>
${username2 }

<h3>기본 보관소 -page</h3>
${pageScope.username1 }
${requestScope.username1 }


<h3>보관소 지정 - scope속성</h3>
<c:set var ="username3" value="일지매" scope="request"></c:set>
${pageScope.username3 }<br>
${requestScope.username3 }


<h3>기존의 값 덮어씀</h3>
<% pageContext.setAttribute("username4", "똘이장군"); %>
기존값= ${usernabe4 }<br>
<c:set var="username4" value="주먹대장"></c:set>
덮어씌운값= ${username4 }
</body>
</html>