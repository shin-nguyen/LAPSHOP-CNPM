<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<META HTTP-EQUIV="Content-language" CONTENT="vi">--%>

<!doctype html>
<html class="no-js" lang="zxx">

<!-- shop-3-column31:48-->
<head>
    <c:url value="/Client" var="url"></c:url>

    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Search Product</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Favicon -->
    <link rel="shortcut icon"  href="${url}/images/favicon.png">
    <!-- Material Design Iconic Font-V2.2.0 -->
    <link rel="stylesheet" href="${url}/css/material-design-iconic-font.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${url}/css/font-awesome.min.css">
    <!-- Font Awesome Stars-->
    <link rel="stylesheet" href="${url}/css/fontawesome-stars.css">
    <!-- Meanmenu CSS -->
    <link rel="stylesheet" href="${url}/css/meanmenu.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="${url}/css/owl.carousel.min.css">
    <!-- Slick Carousel CSS -->
    <link rel="stylesheet" href="${url}/css/slick.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="${url}/css/animate.css">
    <!-- Jquery-ui CSS -->
    <link rel="stylesheet" href="${url}/css/jquery-ui.min.css">
    <!-- Venobox CSS -->
    <link rel="stylesheet" href="${url}/css/venobox.css">
    <!-- Nice Select CSS -->
    <link rel="stylesheet" href="${url}/css/nice-select.css">
    <!-- Magnific Popup CSS -->
    <link rel="stylesheet" href="${url}/css/magnific-popup.css">
    <!-- Bootstrap V4.1.3 Fremwork CSS -->
    <link rel="stylesheet" href="${url}/css/bootstrap.min.css">
    <!-- Helper CSS -->
    <link rel="stylesheet" href="${url}/css/helper.css">
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="${url}/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="${url}/css/responsive.css">
    <!-- Modernizr js -->
    <script src="${url}/js/vendor/modernizr-2.8.3.min.js"></script>
</head>
<body>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->
<!-- Begin Body Wrapper -->
<div class="body-wrapper">
    <!-- Header -->
    <jsp:include page="/Client/header.jsp" />
    <!-- Begin Li's Content Wraper Area -->
    <div class="content-wraper pt-60 pb-60">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <!-- Begin Li's Banner Area -->

                    <!-- Li's Banner Area End Here -->
                    <!-- shop-top-bar start -->
                    <div class="shop-top-bar mt-30">
                        <div class="shop-bar-inner">
                            <div class="product-view-mode">
                                <!-- shop-item-filter-list start -->
                                <ul class="nav shop-item-filter-list" role="tablist">
                                    <li class="active" role="presentation"><a aria-selected="true" class="active show" data-toggle="tab" role="tab" aria-controls="grid-view" href="#grid-view"><i class="fa fa-th"></i></a></li>
                                    <li role="presentation"><a data-toggle="tab" role="tab" aria-controls="list-view" href="#list-view"><i class="fa fa-th-list"></i></a></li>
                                </ul>
                                <!-- shop-item-filter-list end -->
                            </div>

                        </div>

                    </div>
                    <!-- shop-top-bar end -->
                    <!-- shop-products-wrapper start -->
                    <div class="shop-products-wrapper">
                        <div class="tab-content">
                            <div id="grid-view" class="tab-pane fade active show" role="tabpanel">
                                <div class="product-area shop-product-area">
                                    <div class="row">
                                    <c:if test="${not empty hangHoaList}">
                                        <c:forEach items = "${hangHoaList}" var = "hangHoa">

                                        <div class="col-lg-4 col-md-4 col-sm-6 mt-40">
                                            <!-- single-product-wrap start -->
                                            <div class="single-product-wrap">
                                                <div class="product-image">
                                                    <a href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                                         <img src="data:image/jpg;base64,${hangHoa.base64Image}" alt="Li's Product Image">
                                                    </a>
                                                    <span class="sticker">New</span>
                                                </div>
                                                <div class="product_desc">
                                                    <div class="product_desc_info">
                                                        <div class="product-review">
                                                            <h5 class="manufacturer">
                                                                <a href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                                                    <c:out value="${hangHoa.NSX.tenNSX}"></c:out>
                                                                </a>
                                                            </h5>
                                                            <div class="rating-box">
                                            <c:choose>
                                                <c:when test="${hangHoa.sao > 0}">
                                                    <li><i class="fa fa-star-o"></i></li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                </c:otherwise>
                                            </c:choose>

                                            <c:choose>
                                                <c:when test="${hangHoa.sao > 1 }">
                                                    <li><i class="fa fa-star-o"></i></li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                </c:otherwise>
                                            </c:choose>

                                            <c:choose>
                                                <c:when test="${hangHoa.sao > 2}">
                                                    <li><i class="fa fa-star-o"></i></li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                </c:otherwise>
                                            </c:choose>

                                            <c:choose>
                                                <c:when test="${hangHoa.sao > 3}">
                                                    <li><i class="fa fa-star-o"></i></li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                </c:otherwise>
                                            </c:choose>

                                            <c:choose>
                                                <c:when test="${hangHoa.sao > 4}">
                                                    <li><i class="fa fa-star-o"></i></li>
                                                </c:when>
                                                <c:otherwise>
                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                </c:otherwise>
                                            </c:choose>
                                                            </div>
                                                        </div>
                                                        <h4><a class="product_name"href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                            <c:out value="${hangHoa.tenSP}"></c:out></a></h4>
                                                        <div class="price-box">
                                                            <span class="new-price">
                                                                  <fmt:setLocale value="vi_VN"/>
                                                                    <fmt:formatNumber value="${hangHoa.giaBan}" type="currency"/>
                                                            </span>
                                                        </div>
                                                    </div>
                                                    <div class="add-actions">
                                                        <ul class="add-actions-link">
                                                            <li class="add-cart active"><a href="${pageContext.request.contextPath}/GioHangInfoAddController?maSP=${hangHoa.maSP}&soLuong=1">Add to cart</a></li>
                                                            <li><a class="links-details" href="${pageContext.request.contextPath}/YeuThichController?maSP=${hangHoa.maSP}&duongDan=SearchProduct&tenSP=${tenSPTimKiem}"><i class="fa fa-heart-o"></i></a></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- single-product-wrap end -->
                                        </div>

                                        </c:forEach>
                                    </c:if>
                                    </div>
                                </div>
                            </div>

                            <div id="list-view" class="tab-pane product-list-view fade" role="tabpanel">
                                <div class="row">
                                    <div class="col">
                                        <c:if test="${not empty hangHoaList}">
                                        <c:forEach items = "${hangHoaList}" var = "hangHoa">

                                            <div class="row product-layout-list">
                                            <div class="col-lg-3 col-md-5 ">
                                                <div class="product-image">
                                                    <a href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                                        <img  src="data:image/jpg;base64,${hangHoa.base64Image}" alt="Li's Product Image">

                                                    </a>
                                                    <span class="sticker">New</span>
                                                </div>
                                            </div>
                                            <div class="col-lg-5 col-md-7">
                                                <div class="product_desc">
                                                    <div class="product_desc_info">
                                                        <div class="product-review">
                                                            <h5 class="manufacturer">
                                                                <a href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                        <c:out value="${hangHoa.NSX.tenNSX}"></c:out>

                                        </a>
                                                            </h5>
                                                            <div class="rating-box">
                                                                <ul class="rating">
                                        <c:choose>
                                            <c:when test="${hangHoa.sao > 0}">
                                                <li><i class="fa fa-star-o"></i></li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="no-star"><i class="fa fa-star-o"></i></li>
                                            </c:otherwise>
                                        </c:choose>

                                        <c:choose>
                                            <c:when test="${hangHoa.sao > 1 }">
                                                <li><i class="fa fa-star-o"></i></li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="no-star"><i class="fa fa-star-o"></i></li>
                                            </c:otherwise>
                                        </c:choose>

                                        <c:choose>
                                            <c:when test="${hangHoa.sao > 2}">
                                                <li><i class="fa fa-star-o"></i></li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="no-star"><i class="fa fa-star-o"></i></li>
                                            </c:otherwise>
                                        </c:choose>

                                        <c:choose>
                                            <c:when test="${hangHoa.sao > 3}">
                                                <li><i class="fa fa-star-o"></i></li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="no-star"><i class="fa fa-star-o"></i></li>
                                            </c:otherwise>
                                        </c:choose>

                                        <c:choose>
                                            <c:when test="${hangHoa.sao > 4}">
                                                <li><i class="fa fa-star-o"></i></li>
                                            </c:when>
                                            <c:otherwise>
                                                <li class="no-star"><i class="fa fa-star-o"></i></li>
                                            </c:otherwise>
                                        </c:choose>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                        <h4><a class="product_name" href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}"> <c:out value="${hangHoa.tenSP}"></c:out></a></h4>
                                                        <div class="price-box">
                                                            <span class="new-price">
                                                                 <fmt:setLocale value="vi_VN"/>
                                                                <fmt:formatNumber value="${hangHoa.giaBan}" type="currency"/>
                                                            </span>
                                                        </div>
                                                        <p><c:out value="${hangHoa.moTa}"></c:out></p>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="col-lg-4">
                                                <div class="shop-add-action mb-xs-30">
                                                    <ul class="add-actions-link">
                                                        <li class="add-cart active"><a href="${pageContext.request.contextPath}/GioHangInfoAddController?maSP=${hangHoa.maSP}&soLuong=1">Add to cart</a></li>
                                                        <li><a class="links-details" href="${pageContext.request.contextPath}/YeuThichController?maSP=${hangHoa.maSP}&duongDan=SearchProduct&tenSP=${tenSPTimKiem}"><i class="fa fa-heart-o"></i></a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div>
                                        </c:forEach>
                                        </c:if>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <!-- shop-products-wrapper end -->
                </div>
            </div>
        </div>
    </div>
    <!-- Content Wraper Area End Here -->
    <!-- Footer -->
    <%@ include file="/Client/footer.jsp" %>
    <!-- Begin Quick View | Modal Area -->

    <!-- Quick View | Modal Area End Here -->
</div>
<!-- Body Wrapper End Here -->
<!-- jQuery-V1.12.4 -->
<script src="${url}/js/vendor/jquery-1.12.4.min.js"></script>
<!-- Popper js -->
<script src="${url}/js/vendor/popper.min.js"></script>
<!-- Bootstrap V4.1.3 Fremwork js -->
<script src="${url}/js/bootstrap.min.js"></script>
<!-- Ajax Mail js -->
<script src="${url}/js/ajax-mail.js"></script>
<!-- Meanmenu js -->
<script src="${url}/js/jquery.meanmenu.min.js"></script>
<!-- Wow.min js -->
<script src="${url}/js/wow.min.js"></script>
<!-- Slick Carousel js -->
<script src="${url}/js/slick.min.js"></script>
<!-- Owl Carousel-2 js -->
<script src="${url}/js/owl.carousel.min.js"></script>
<!-- Magnific popup js -->
<script src="${url}/js/jquery.magnific-popup.min.js"></script>
<!-- Isotope js -->
<script src="${url}/js/isotope.pkgd.min.js"></script>
<!-- Imagesloaded js -->
<script src="${url}/js/imagesloaded.pkgd.min.js"></script>
<!-- Mixitup js -->
<script src="${url}/js/jquery.mixitup.min.js"></script>
<!-- Countdown -->
<script src="${url}/js/jquery.countdown.min.js"></script>
<!-- Counterup -->
<script src="${url}/js/jquery.counterup.min.js"></script>
<!-- Waypoints -->
<script src="${url}/js/waypoints.min.js"></script>
<!-- Barrating -->
<script src="${url}/js/jquery.barrating.min.js"></script>
<!-- Jquery-ui -->
<script src="${url}/js/jquery-ui.min.js"></script>
<!-- Venobox -->
<script src="${url}/js/venobox.min.js"></script>
<!-- Nice Select js -->
<script src="${url}/js/jquery.nice-select.min.js"></script>
<!-- ScrollUp js -->
<script src="${url}/js/scrollUp.min.js"></script>
<!-- Main/Activator js -->
<script src="${url}/js/main.js"></script>
</body>

<!-- shop-3-column31:48-->
</html>
