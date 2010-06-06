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
            <div id="navigation">
                <ul>
                    <li>
                        <a href="index.jsp">TRANG CHỦ</a>
                    </li>
                </ul>
                <ul>
                    <li>
                        <a href="phoneListByBrand.html">ĐIỆN THOẠI</a>
                    </li>
                </ul>
                <ul>
                    <li>
                        <a href="accessoryList.html">PHỤ KIỆN</a>
                    </li>
                </ul>
                <ul>
                    <li>
                        <a href="#">GÓP Ý</a>
                    </li>
                </ul>
                <ul>
                    <li>
                        <a href="#">LIÊN HỆ</a>
                    </li>
                </ul>
            </div> <!-- end menu -->
			
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
																<c:forEach var="img" items="${a.dsHinhAnh}" begin="0" end="1" varStatus="loopCount">
															        <c:if test="${loopCount.index eq 0}">
															         	<a href="#"><img src="img/phukien/<c:out value="${ img.hinhAnh }"/>" width="50px" height="75px"/></a>
															        </c:if>
															    </c:forEach>
														    </div>
														    <!-- Name -->
															<div class="itemName01"><c:out value="${a.ten}"/></div>
														</div>
														<!-- Price -->
														<div class="itemPrice"><fmt:formatNumber value="${a.giaHienHanh}" minFractionDigits="0" maxFractionDigits="0"/> VND</div>
													</div>
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
