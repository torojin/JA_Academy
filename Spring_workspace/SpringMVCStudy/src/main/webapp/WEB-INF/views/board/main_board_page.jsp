<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 메인페이지</title>
</head>
<body>
<c:choose>
	<c:when test="${!empty sessionUser}">
		${sessionUser.member_nick}님 환영합니다
		<a href="${pageContext.request.contextPath}/member/logout_process.do">로그아웃</a>
	</c:when>
	
	<c:otherwise>
		<a href="${pageContext.request.contextPath}/member/login_page.do">로그인</a>
	</c:otherwise>
</c:choose>
</body>
</html>