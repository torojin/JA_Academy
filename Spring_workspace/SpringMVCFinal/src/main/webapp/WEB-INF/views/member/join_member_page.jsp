<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
<form action="./join_member_process.do" method="post">
	ID : <input type="text" name="member_id" placeholder="email를 입력하세요"><br>
	PW : <input type="password" name="member_pw"><br>
	Nick : <input type="text" name="member_nick"><br>
	Gender : <input type="radio" name="member_sex" value="M" >남
			 <input type="radio" name="member_sex" value="W" checked="checked">여<br>
	<%-- value를 배열 방식으로 받아서 옴 --%> 
	Hobby : <input type="checkbox" name="member_hobby" value="1">농구 
			<input type="checkbox" name="member_hobby" value="2">축구 
			<input type="checkbox" name="member_hobby" value="3">야구 
			<input type="checkbox" name="member_hobby" value="4">독서 <br>
	<input type="submit" value="회원가입">
</form>
</body>
</html>