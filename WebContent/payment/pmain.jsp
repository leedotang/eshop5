<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var ="context"><%=request.getContextPath()%></c:set>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="description" content="pmain.jsp">
<title>메인 페이지</title>
</head>
<body>
	<a href="payment/payment.do">[결제하기]</a>
	<a href="${context}/work/payment/payment.do" class="nav-link">회원가입</a>
</body>
</html>