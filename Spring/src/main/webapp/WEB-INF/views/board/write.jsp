<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판 글쓰기 화면</h1>
<form action="/board/write" method="post">
	제목 : <input type="text" name="title">
	내용 : <input type="text" name="content">
	<input type="submit" value="글쓰기">
</form>
</body>
</html>