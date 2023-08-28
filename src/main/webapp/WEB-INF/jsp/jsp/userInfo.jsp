<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보</title>
</head>
<body>

	<h1>사용자 정보</h1>
	
	<h2>${result.name }</h2>
	
	<h3>email : ${result.email }</h3>
	<h3>생년월일 : ${result.yyyymmdd }</h3>
	<h3>자기소개 : ${result.introduce }</h3>

</body>
</html>