<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 입력</title>
</head>
<body>
	<h2>사용자 추가</h2>
	
	<label>이름 : </label> <input type="text" id="nameInput"> <br>
	<label>생년월일 : </label> <input type="text" id="birthdayInput"> <br>
	<label>이메일 : </label> <input type="text" id="emailInput"><button type="button" id="duplicateBtn">중복확인</button> <br>
	<button type="button" id="addBtn">추가</button>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			
			$("#duplicateBtn").on("click", function() {
				let email = $("#emailInput").val();
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return ;
				}
				
				$.ajax({
					type:"get"
					, url:"/ajax/user/duplicate-email"
					, data:{"email":email}
					, success:function(data) {
						// 중복됨 :  {"isDuplicate":true}
						// 중복안됨 : {"isDuplicate":false}
						if(data.isDuplicate) {
							// 중복됨
							alert("중복된 이메일 입니다.");
						} else {
							// 중복안됨
							alert("사용가능한 이메일 입니다");
						}
					
					}
					, error:function() {
						alert("중복확인 에러");
					}
				});
				
				
			});
			
			$("#addBtn").on("click", function() {
				let name = $("#nameInput").val();
				let birthday = $("#birthdayInput").val();
				let email = $("#emailInput").val();
				
				console.log(name + " " + birthday + " " + email);
				
				// 유효성 검사 (Validation)
				if(name == "") {
					alert("이름을 입력하세요");
					return ;
				}
				
				if(birthday == "") {
					alert("생년월일을 입력하세요");
					return ;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return ;
				}
				
				$.ajax({
					type:"get"
					, url:"/ajax/user/create"
					, data:{"name":name , "birthday":birthday , "email":email }
					, success:function(data) {
						// 성공 실패 여부 
						// 성공 : {"result":"success"}
						// 실패 : {"result":"fail"}
						
						if(data.result == "success") {
							// 성공
							// 리스트 페이지로 이동
							location.href = "/ajax/user/list";
						} else {
							// 실패
							alert("추가 실패!!");
						}
					}
					, error:function() {
						alert("추가 에러!!");
					}
				});
				
				
				
				
				
			});
			
			
			
		});
	
	</script>
</body>
</html>