<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 포맷 라이브러리</title>
</head>
<body>

	<h2>JSTL 포맷 라이브러리</h2>
	<h3>숫자 출력</h3>
	<c:set var="number" value="123456789" />
	<h4><fmt:formatNumber value="${number }" /> </h4>
	
	<h3>퍼센트</h3>
	<h4><fmt:formatNumber value="0.35" type="percent" /> </h4>
	<h4><fmt:formatNumber value="${2 / 7 }" type="percent" /> </h4>
	
	<h3>통화</h3>
	<h4><fmt:formatNumber value="${number }" type="currency" /> </h4>
	<h4><fmt:formatNumber value="${number }" type="currency" currencySymbol="$" /> </h4>
	
	<h3>소수점 표현</h3>
	<c:set var="pi" value="3.141592" />
	
	<h4>${pi }</h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##" /> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="#.##########" /> </h4>
	<h4><fmt:formatNumber value="${pi }" pattern="0.0000000000" /> </h4>
	
	<h3>포맷 결과 변수</h3>
	<fmt:formatNumber value="${pi }" pattern="#.##" var="pi2" />
	
	<h4>${pi2 }</h4>
	
	
	
	<h3>날짜 포맷</h3>
	
	<h4>${now }</h4>
	
	<h4><fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초" /> </h4>
	
	<%-- 전달된 값 "2023/08/31 17:52:23" --%>
	
	<%-- 표현할 값 "2023-8-31 5:52:12 --%>
	<%-- String -> Date --%>
	<fmt:parseDate value="${dateString }" pattern="yyyy/MM/dd HH:mm:ss" var="date" />
	
	<h4>${date }</h4>
	
	
	

</body>
</html>