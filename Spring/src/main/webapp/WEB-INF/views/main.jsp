<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/list" method="get">
	<div>
		<div>
			<input type="text" placeholder="ID">
		</div>
		<div>
			<input type="text" placeholder="PW">
		</div>
		<input type="submit" value="로그인">
		<input type="submit" value="회원가입" formaction="member/joinMember">
	</div>
</form>
</body>
</html>