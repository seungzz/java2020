<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
(보관소 뒤지는 순서) jspContext -> ServletRequest -> HttpSession ->ServletContext  -> null(그래도 없으면 null을 반환한다.)

<EL에서 검색범위 지정>
EL도 jsp:useBean 처럼 4군데 보관소에서 값을 꺼낼수가 있다.
EL은 4곳 보관소에서 자동으로 해당되는 이름의 값을 꺼낼수가 있지만, 스코프를 지정해서 그 범위 안에서 해당값을 찾을 수도 있다.

${requestScope.member.email}
${sessionScope.member.email}

pageScop사용    -> jspContext	보관소를 뒤지게 된다.
requestScope -> ServletRequest
sessionScope -> HttpSession
applicationScope -> ServletContext

</body>
</html>