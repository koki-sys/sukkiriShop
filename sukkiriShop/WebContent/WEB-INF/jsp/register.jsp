<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ商店</title>
</head>
<body>
	<form action="/sukkiriShop/RegisterServlet" method="post">
		ユーザID:
		<input type="text" name="userId">
		<br>ユーザ名:
		<input type="text" name="username">
		<br>Email:
		<input type="text" name="email">
		<br>年齢:
		<input type="text" name="age">
		<br> パスワード:
		<input type="password" name="pass">
		<br>
		<input type="submit" value="登録">
	</form>
</body>
</html>