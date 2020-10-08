<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--${}앞에 \가 붙으면 el 문법이 아닌 일반 텍스트로 인식됩니다. --%>
\${10 + 10 } = ${10+10} <br>
\${10 - 10 } = ${10-10} <br>
\${10 * 10 } = ${10*10} <br>
\${10 / 10 } = ${10/10} <br>
\${10 div 10 } = ${10  div 10} <br>
\${10 % 10 } = ${10%10} <br>
\${10 mod 10 } = ${10 mod 10} <br>
</body>
</html>