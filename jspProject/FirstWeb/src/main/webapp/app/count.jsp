<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	//application 객체의 속성에 cnt 이름의 속성이 저장되어있다 !
	//숫자 저장 String 타입의 데이터로 저장해서 사용.
	String cntStr = (String) application.getAttribute("cnt");

	int cnt = cntStr == null ? 0 : Integer.parseInt(cntStr);
	
	out.print("방문자 수 : " + cnt);
	
	cnt++;
	
	application.setAttribute("cnt", String.valueOf(cnt));
	%>










</body>
</html>