<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 라이브러리</title>
</head>
<body>

	<h2>JSTL core 라이브러리</h2>
	
	<h3>1. 변수 만들기</h3>
	
	<%-- int number1 = 100; --%>
	<c:set var="number1" value="100" />
	<c:set var="number2">200</c:set>
	
	<h4>숫자 1 : ${number1 }</h4>
	<h4>숫자 2 : ${number2 }</h4>
	
	<h3>2. 변수 출력하기</h3>
	
	<h4>숫자 1 : <c:out value="100" /> </h4>
	<h4>숫자 2 : <c:out value="${number2 }" /> </h4>
	
	<%--  <script>alert("안녕")</script>  --%>
	<c:out value="<script>alert('안녕')</script>" />
	
	
	<%--  <c:out value="<script>alert('안녕')</script>" escapeXml="false" /> --%>
	
	<h3>3. 조건문</h3>
	
	<%-- if(true) { } --%>
	<c:if test="true">
		<h4>조건문 결과</h4>
	</c:if>
	
	<%-- if(number1 > 50) {} --%>
	<c:if test="${number1 > 50}">
		<h4>50보다 크다!!</h4>
	</c:if>
	
	<%-- if(number2 == 200) {} --%>
	<c:if test="${number2 eq 200 }">
		<h4>number2가 200이다</h4>
	</c:if>
	
	<%-- if(number2 != 200) {} --%>
	<c:if test="${number2 ne 200 }">
		<h4>number2는 200이 아니다</h4>
	</c:if>
	
	<%-- if(number3 == null) { } --%>
	<%-- null, 없는 변수, 리스트가 비어있다, 맵이 비어있다. --%>
	<c:if test="${empty number3 }">
		<h4>number3은 없다</h4>
	</c:if>
	
	<c:if test="${not empty number2 }">
		<h4>number2는 있다</h4>
	</c:if>
	
	
	
	
	
	
	

</body>
</html>