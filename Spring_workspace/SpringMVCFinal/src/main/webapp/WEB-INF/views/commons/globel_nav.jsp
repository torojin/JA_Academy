<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">자유게시판 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">쇼핑몰</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">경매</a>
      </li>
    <c:choose>
	<c:when test="${!empty sessionUser}">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
           ${sessionUser.member_nick}
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
        <%-- 절대경로 상대경로를 사용하는 것보다 아래와 같이 사용하는게 좋다 / html쪽 경로 / html쪽 경로가 절대경로여서 이렇게 사용한다 --%>
          <a class="dropdown-item" href="${pageContext.request.contextPath}/member/logout_process.do">로그아웃</a>
          <a class="dropdown-item" href="#">마이페이지</a>
        </div>
	</c:when>
	<c:otherwise>
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath}/member/login_page.do">로그인</a>
		</li>
	</c:otherwise>
    </c:choose>
    </ul>
  </div>
</nav>