<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/include/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Phone Store</title>
        <link href="css/3_col.css" media="all" rel="stylesheet" />
        <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
        <script type="text/javascript" src="js/productVisibility.js"></script>
        <script type="text/javascript">
        	$(document).ready(function() {
				$("div#accessoryListTitle").click(function(){
					$("div#accessoryListContainer").toggle("fast");
				});
				$("div#subTitle1").click(function(){
					$("div#subContent1").toggle("fast");
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
					<!-- List of accessories with sub categories -->
					<div class="block01">
						<div class="blockTitle" id="accessoryListTitle">Kết quả tìm kiếm phụ kiện <c:out value="${model.name} (${fn:length(model.result)})"/></div>
							<div class="contentCenter" id="accessoryListContainer">
								<div class="subContent">
									<div class="blockSubTitle01" id="subTitle1"/>
										<c:out value="${model.name} (${fn:length(model.result)} kết quả)"/>
									</div>
									<div class="subContent" id="subContent1">
										<c:choose>
											<c:when test="${fn:length(model.result) > 0}">
												<c:forEach var="a" items="${model.result}" varStatus="loop">
													<c:set var="v" value="${true}"/>
													<c:if test="${(a.hienThi eq false) and ((empty sessionScope.userType) or (sessionScope.userType eq 'KhachHang'))}">
														<c:set var="v" value="${false}"/>
													</c:if>
													<c:if test="${v eq true}">
														<div class="<c:choose><c:when test="${ loop.index eq 0 }"><c:out value="itemLeft"/></c:when><c:otherwise><c:out value="itemCenter"/></c:otherwise></c:choose>">
															<!-- New model or not -->
															<c:choose>
																<c:when test="${a.tinhTrangSanPham.id eq 3}">
																	<div class="isNewModel"></div>
																</c:when>
																<c:otherwise>
																	<div class="isNotNewModel"></div>
																</c:otherwise>
															</c:choose>
															<!-- Image & Name-->
															<div class="itemImageAndName">
																<!-- Choose one image from list -->
																<div class="itemImage">
																	<a href="accessoryDetails.html?id=<c:out value="${a.id}" />" ><img src="img/phukien/<c:out value="${ a.hinhAnh }"/>" width="50px" height="75px"/></a>
															    </div>
															    <!-- Name -->
																<div class="itemName01"><a href="accessoryDetails.html?id=<c:out value="${a.id}" />" ><c:out value="${a.ten}"/></a></div>
															</div>
															<!-- Price -->
															<div class="itemPrice"><fmt:formatNumber value="${a.giaHienHanh}" minFractionDigits="0" maxFractionDigits="0"/> VND</div>
															
															<!-- Function for employees -->
															<c:if test="${(sessionScope.userType eq 'NhanVien') or (sessionScope.userType eq 'NhanVienQuanLy') or (sessionScope.userType eq 'NhanVienBanHang')}">
																<div class="employeeTaskBox">
																
																	<input type="button" value="Cập nhật"/>
																	 
																	<c:set var="v" value="Hiển thị"/>
																	<c:if test="${a.hienThi eq true}">
																		<c:set var="v" value="Ẩn"/>
																	</c:if>
																	<input id="<c:out value="v${a.id}"/>" type="button" value="${v}" onclick="setVisibility('setVisibility.html?pid=${a.id}', ${a.id})"/>
																</div>
															</c:if>
														</div>
													</c:if>
												</c:forEach>
											</c:when>
											<c:otherwise>
												<div class="notFound">Không tìm thấy phụ kiện!</div>
											</c:otherwise>
										</c:choose>
									</div>
								</div>
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

