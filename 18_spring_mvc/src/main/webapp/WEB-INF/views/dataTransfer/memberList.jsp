<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트</title>
</head>
<body>
	
	<h1>${method }</h1>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>성별</td>
			<td>연락처</td>
			<td>이메일</td>
			<td>거주지</td>
			
		</tr>
	
	
	<c:forEach var="member" items="${memberList }">
		<tr align="center">
			<td>${member.memberId }</td>
			<td>${member.memberName }</td>
			<td>${member.memberGender }</td>
			<td>${member.hp }</td>
			<td>${member.email }</td>
			<td>${member.regidence }</td>
		</tr>
	
	
	</c:forEach>
	
	
	
	
	
	</table>
	
	
</body>
</html>