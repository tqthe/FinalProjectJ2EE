<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%-- Required login to view this page --%>
<%--
<%@ include file="/WEB-INF/views/user/requiredLogin.jsp" %>
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.Date"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Phone Store</title>
        <link href="css/3_col.css" media="all" rel="stylesheet" />
        <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
        <script type="text/javascript">
        	$(document).ready(function() {
				$("div#regTitle").click(function(){
					$("div#regContainer").toggle("fast");
				});
			});
        </script>
    </head>
    <body>
        <div id="container">
        	<!-- Header -->
            <%@ include file="/WEB-INF/views/include/header.jsp" %>
            
			<!-- Menu -->
			<%@ include file="/WEB-INF/views/include/menu.jsp" %>
			
            <!-- Content -->
            <div id="content-container">
            
            	<!-- Include Left Column -->
                <%@ include file="/WEB-INF/views/include/leftColumn.jsp" %>
            	
                
                
                <!-- Middle Column -->
                <div id="content">
                	
                	<!-- Register Form -->
					<div class="block01">
						<div class="blockTitle" id="regTitle">Nhận xét cho điện thoại <c:out value="${param.name}" /></div>
						<div class="contentCenter" id="regContainer">
							<c:if test="${not empty model.isSuccess}">
								<div class="<c:choose><c:when test="${model.isSuccess eq 'yes'}"><c:out value="successInfo"/></c:when><c:otherwise><c:out value="failedInfo"/></c:otherwise></c:choose>">
									<c:if test="${model.isSuccess eq 'yes'}">
										<span class="successInfoText">${model.status}</span>
										<a href="phoneDetails.html?id=<c:out value="${param.pid}" />">Quay lại</a>
									</c:if>
								</div>
							</c:if>
							<div class="guideInfo">Thêm nhận xét cho điện thoại</div>
							<div style="padding: 10px 10px 10px 10px;">
								<spring:nestedPath path="nhanXetDienThoai">
									<form action="addComment.html" method="post">
										<input type="hidden" name="pid" value="<c:out value="${param.pid}" />" />
										<table width="100%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="3">
											<tr>
												<td colspan="2" align="left" width="20%">Tổng quan: <span class="error"> *</span></td>
											</tr>
											<tr>
												<spring:bind path="tongQuan">
											    	<td width="70%">
											    		<textarea class="boxInput" rows="5" cols="100" id="suggestionContent" name="${status.expression}" >${status.value}</textarea>
											    	</td>
											    	<td width="30%">
														<span class="error" id="titleError"><c:out value="${status.errorMessage}"/></span>
											    	</td>
										    	</spring:bind>
											</tr>
											<tr>
												<td colspan="2" align="left" width="20%">Ưu điểm: <span class="error"> *</span></td>
											</tr>
										    <tr>
										    	<spring:bind path="uuDiem">
											    	<td>
											    		<textarea class="boxInput" rows="5" cols="100" id="suggestionContent" name="${status.expression}" >${status.value}</textarea>
											    	</td>
											    	<td>
											    		<c:if test="${status.error}">
															<span class="error" id="passwordError"><c:out value="${status.errorMessage}"/></span>
														</c:if>
											    	</td>
										    	</spring:bind>
										    </tr>
										    <tr>
												<td colspan="2" align="left" width="20%">Nhược điểm: <span class="error"> *</span></td>
											</tr>
										    <tr>
										    	<spring:bind path="nhuocDiem">
											    	<td>
											    		<textarea class="boxInput" rows="5" cols="100" id="suggestionContent" name="${status.expression}" >${status.value}</textarea>
											    	</td>
											    	<td>
											    		<c:if test="${status.error}">
															<span class="error" id="passwordError"><c:out value="${status.errorMessage}"/></span>
														</c:if>
											    	</td>
										    	</spring:bind>
										    </tr>
										    <tr>
										    	<spring:bind path="danhGia">
										    		<td>
										    			Đánh giá
										    			<select name="${status.expression}">
										    				<c:forEach var="i" begin="1" end="10">
										    					<option value="${i}" <c:if test="${i eq status.value}">selected</c:if>>${i}</option>
										    				</c:forEach>
										    			</select>
										    		</td>
										    		<td>
											    		<c:if test="${status.error}">
															<span class="error" id="passwordError"><c:out value="${status.errorMessage}"/></span>
														</c:if>
											    	</td>
										    	</spring:bind>
										    </tr>
										    <tr>
										    	<td width="70%" align="right" style="padding-right: 2px;">
										    		<input type="submit" value="Đồng ý">
										    	</td>
										    	<td width="30%"></td>
										    </tr>
										</table>
									</form>
								</spring:nestedPath>
							</div>
							<div style="padding-left: 10px;"><span class="error">( * )</span>: Các trường bắt buộc nhập liệu</div>
						</div>
						<div style="clear:both;"></div>
					</div>
                </div> <!-- end midlle column -->
                
                <!-- Include Right Column -->
                <%@ include file="/WEB-INF/views/include/rightColumn.jsp" %>
                
            </div> <!-- end content -->
            
            <!-- Footer -->
            <%@include file="/WEB-INF/views/include/footer.jsp" %>
        </div>
    </body>
</html>

