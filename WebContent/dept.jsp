<%@page import="jsp_kyh_example1.dto.DeptDto"%>
<%@page import="java.util.List"%>
<%@page import="jsp_kyh_example1.dao.DeptDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	DeptDao dao = new DeptDao();
	List<DeptDto> dtos = dao.getDepts();
	
	for(DeptDto dto : dtos){
		out.print("부서번호 : " + dto.getDeptno() +
				"직종이름 : " + dto.getDname() +
				"지역 : " + dto.getLoc() + "<br>");
	}
%>
</body>
</html>