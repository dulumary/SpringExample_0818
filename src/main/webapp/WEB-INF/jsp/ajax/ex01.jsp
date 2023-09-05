<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Ajax 테스트</h1>
	
	<button type="button" id="requestBtn">요청</button>
	
	
	<div id="name"></div>
	<div id="age"></div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script>
	
		$(document).ready(function() {
			$("#requestBtn").on("click", function() {
				
				// /ajax/person 
				$.ajax({
					type:"get"
					, url:"/ajax/person"
					, data:{"name":"김인규", "birthday":"20010323"}
					, success:function(data) {
						// {"name": "유재석", "age": 21}
						// jquery가 respnose로 전달된 json문자열을 자바스크립트 객체로 변환 
						console.log("나이 : " + data.age);
						
						$("#name").text("이름 : " + data.name);
						$("#age").text("나이 : " + data.age);
					}
					, error:function() {
						alert("에러!!");
					}
				});
			});
			
		});
	
		
		
	
	</script>

</body>
</html>