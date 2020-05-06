<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 읽기</title>
</head>
<body>
	<h1>게시글 보기</h1>
	<form action="">
		작성자 : ${contentDataVo.memberVo.m_nick }<br>
		제목 : ${contentDataVo.boardVo.b_title }<br>
		내용 <br>
		${contentDataVo.boardVo.b_content }<br>
		
		<a href="./main_page.do">목록으로</a>
		<c:if test="${!empty sessionUserInfo && sessionUserInfo.m_no == contentDataVo.memberVo.m_no}">
			<a href="./delete_content_process.do?b_no=${contentDataVo.boardVo.b_no }">삭제</a>
			<a href="./update_content_page.do?b_no=${contentDataVo.boardVo.b_no }">수정</a>
		</c:if>
		
	</form>
</body>
</html>