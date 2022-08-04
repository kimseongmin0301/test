<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/write">
	<div>
		<div>
			<table border="1">
				<tr>
					<th>글번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>날짜</th>
				</tr>
			</table>
		</div>
		<div>
			<input type="submit" value="글쓰기">
		</div>
	</div>
</form>
</body>
</html>