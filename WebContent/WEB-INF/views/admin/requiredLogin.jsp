<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/include.jsp" %>

<%-- Required login to view this page --%>
<c:if test="${empty sessionScope.userType }">
	<c:redirect url="requiredLogin.html"/>
</c:if>

<c:if test="${(not sessionScope.userType eq 'NhanVienQuanTri')}">
	<c:redirect url="requiredLogin.html"/>
</c:if>