<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8">
<title>클래식기타 커뮤니티</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/header.css">
<link rel="stylesheet" type="text/css" href="css/footer.css">
<link rel="stylesheet" type="text/css" href="css/board_left.css">
<link rel="stylesheet" type="text/css" href="css/board_write_main.css">
</head>
<body>
<div id="wrap">
<header>
  <a href="index.jsp"><img id="logo" src="img/logo.png"></a>
<nav id="top_menu">
  HOME | LOGIN | JOIN | NOTICE
</nav>
<nav id="main_menu">
  <ul>
    <li><a href="board_list.jsp">자유 게시판</a></li>
    <li><a href="#">기타 연주</a></li>
    <li><a href="#">공동 구매</a></li>
    <li><a href="#">연주회 안내</a></li>
    <li><a href="#">회원 게시판</a></li>
  </ul>
</nav>
</header> <!-- header -->
<aside>
  <article id="login_box">
  <form action="login_process.jsp" method="GET">
    <img id="login_title" src="img/ttl_login.png">
    <!-- 로그인 처리-->
    <%
    	//login_process.jsp에서 session.setAttribute("sessionNick", m_nick);를 받아옴
    	String sessionNick = (String)session.getAttribute("sessionNick");
    	if(sessionNick == null){
    	%>
	<div id="input_button">  
    	<ul id="login_input">
    	<li><input type="text" name="login_id"></li>
    	<li><input type="password" name="login_pw"></li>
		</ul>
		<input id="login_btn" type="image" src="img/btn_login.gif">
    	<!-- <img id="login_btn" src="img/btn_login.gif"> -->
    </div> 
    <div class="clear"></div>
    <div id="join_search">
      	<a href="./join/join_member_page.jsp"><img src="img/btn_join.gif"></a>
      	<img src="img/btn_search.gif">
    </div>
    <% }else{ %>
    <ul id="login_input">
    	<li><%=sessionNick %>님 환영합니다</li>
    	<li><a href='logout_process.jsp'>로그아웃</a></li>
	</ul>
	<%} %>
  </form>
  </article>
  <nav id="sub_menu">
    <ul>
      <li><a href="board_list.jsp">+ 자유 게시판</a></li>
      <li><a href="#">+ 방명록</a></li>
      <li><a href="#">+ 공지사항</a></li>
      <li><a href="#">+ 등업요청</a></li>
      <li><a href="#">+ 포토갤러리</a></li>
    </ul>
  </nav>
  <article id="sub_banner">
    <ul>
      <li><img src="img/banner1.png"></li>
      <li><img src="img/banner2.png"></li>		
      <li><img src="img/banner3.png"></li>
    </ul>	
  </article>
</aside> 

<section id="main">
<form action="./board_write_process.jsp">
  <img src="img/comm.gif">
  <h2 id="board_title">자유 게시판 </h2>
  <div id="write_title"><h2>글쓰기</h2></div>
  <table>
    <tr id="name">
      <td class="col1">이름</td>
      <td class="col2"><%=sessionNick %></td>
    </tr>
    <tr id="subject">
      <td class="col1">제목</td>
      <td class="col2"><input type="text" name="write_title"></td>
    </tr>		
    <tr id="content">
      <td class="col1">내용</td>
      <td class="col2"><textarea name="write_content"></textarea></td>
    </tr>	
    <tr id="upload">
      <td class="col1">업로드 파일</td>
      <td class="col2"><input type="text"> <input type="file"></td>
    </tr>	
  </table>
  <div id="buttons">
  	<input type="image" src="img/ok.png">
    <!-- <a href="#"><img src="img/ok.png"></a> -->
    <a href="board_list.jsp"><img src="img/list.png"></a>
  </div>
</form>
</section> <!-- section main -->
<div class="clear"></div>
<footer>
  <img id="footer_logo" src="img/footer_logo.gif">
  <ul id="address">
    <li>서울시 강남구 삼성동 1234 우 : 123-1234</li>  
    <li>TEL : 031-123-1234  Email : email@domain.com</li>
    <li>COPYRIGHT (C) 루바토 ALL RIGHTS RESERVED</li>
  </ul>
  <ul id="footer_sns">
    <li><img src="img/facebook.gif"></li>  
    <li><img src="img/blog.gif"></li>
    <li><img src="img/twitter.gif"></li>
  </ul>
</footer> <!-- footer -->

</div> <!-- wrap -->
</body>
</html>
