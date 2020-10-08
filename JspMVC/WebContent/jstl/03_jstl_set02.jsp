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
<h3>객체의 속성값 변경</h3>
<%!
public static class MyMember {
	int no;
	String name;
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

%>
<%
MyMember member = new MyMember();
member.setNo(100);
member.setName("홍길동");
pageContext.setAttribute("member", member);
%>
${member.name}<br>
<c:set target="${member }" property="name" value="임꺽정"></c:set>
${member.name }

<%--
c:set로 속성(property)을 바꿀 수 있는데 setter 메소드가 반환값이 void일때만 사용 가능합니다.

 --%>

</body>
</html>