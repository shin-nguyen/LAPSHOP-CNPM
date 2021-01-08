<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<META HTTP-EQUIV="Content-language" CONTENT="vi">--%>

<!doctype html>

<html>

<!-- index28:48-->
<head>
    <c:url value="/Client" var="url"></c:url>

    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Home Page</title>
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
<!-- Begin Body Wrapper -->
<div class="body-wrapper">
    <!-- Header -->
    <jsp:include page="/Client/header.jsp" />
    <!-- Begin Slider With Banner Area -->

    <div class="slider-with-banner">
        <div class="container">
            <div class="row">
                <!-- Begin Slider Area -->
                <div class="col-lg-8 col-md-8">
                    <div class="slider-area">
                        <div class="slider-active owl-carousel">
                            <!-- Begin Single Slide Area -->
                            <c:if test="${not empty sessionScope.hangHoaSet}">
                            <c:forEach items = "${sessionScope.hangHoaSet}" var = "hangHoa">
                                <c:if test = "${hangHoa.giaBan < hangHoa.giaGoc}">

                                    <div class="single-slide align-center-left  animation-style-01 " id ="container">
                                        <img  src="data:image/jpg;base64,${hangHoa.base64Image}" alt="Li's Product Image">
                                        <div class="slider-progress">
                                        </div>
                                        <div class="slider-content">
                                            <h5>Sale Offer
                                                <span>
                                                     <fmt:formatNumber type = "percent" pattern="##.#"
                                                                       value = "${(hangHoa.giaGoc-hangHoa.giaBan)/hangHoa.giaGoc*100}" />%
                                                </span>
                                                This Day
                                            </h5>
                                            <h2> <c:out value = "${hangHoa.tenSP}"/></h2>
                                            <h3>Starting at <span>
                                                <fmt:setLocale value="vi_VN"/>
                                                <fmt:formatNumber value="${hangHoa.giaBan}" type="currency"/>
                                                </span></h3>

                                            <div class="default-btn slide-btn">
                                                <a class="links"
                                                   href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                                    Shopping Now
                                                </a>
                                            </div>
                                        </div>
                                    </div>>

                                </c:if>
                            </c:forEach>
                            </c:if>
                            <!-- Single Slide Area End Here -->
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>


    <!-- Slider With Banner Area End Here -->
    <!-- Begin Product Area -->
    <div class="product-area pt-60 pb-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="li-product-tab">
                        <ul class="nav li-product-menu">
                            <li><a class="active" data-toggle="tab" href="#li-new-product"><span>Featured Products</span></a></li>
                        </ul>
                    </div>
                    <!-- Begin Li's Tab Menu Content Area -->
                </div>
            </div>

            <div class="tab-content">
                <div id="li-new-product" class="tab-pane active show" role="tabpanel">
                    <div class="row">
                        <div class="product-active owl-carousel">
                            <c:if test="${not empty sessionScope.hangHoaSet}">
                            <c:forEach items = "${sessionScope.hangHoaSet}" var = "hangHoa">
                            <div class="col-lg-12">
                                <!-- single-product-wrap start -->
                                <div class="single-product-wrap">
                                    <div class="product-image">
                                        <a href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                            <img  src="data:image/jpg;base64,${hangHoa.base64Image}" alt="Li's Product Image">
                                        </a>
                                        <span class="sticker">New</span>
                                    </div>
                                    <div class="product_desc">
                                        <div class="product_desc_info">
                                            <div class="product-review">

                                                <h5 class="manufacturer">
                                                    <c:out value="${hangHoa.NSX.tenNSX}"></c:out>
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
                                            <h4><a class="product_name" href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                                <c:out value="${hangHoa.tenSP}"></c:out>
                                            </a></h4>
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
                                                <li><a class="links-details" href="${pageContext.request.contextPath}/YeuThichController?maSP=${hangHoa.maSP}&duongDan=home"><i class="fa fa-heart-o"></i></a></li>

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
            </div>
        </div>
    </div>

    <!-- Li's Static Banner Area End Here -->
    <br>

    <!-- Begin Li's Trendding Products Area -->
    <section class="product-area li-laptop-product li-trendding-products best-sellers pb-45">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="li-product-tab">
                        <ul class="nav li-product-menu">
                            <li><a class="active" data-toggle="tab" ><span>Manufacturer</span></a></li>
                        </ul>
                    </div>
                    <!-- Begin Li's Tab Menu Content Area -->
                </div>
            </div>
<c:if test="${not empty sessionScope.nsxSet}">
            <c:forEach items="${sessionScope.nsxSet}" var="nsx">
            <div class="row">
                 <!-- Begin Li's Section Area -->
                <div class="col-lg-12">
                    <div class="li-section-title">
                        <h2>
                            <span><c:out value="${nsx.tenNSX}"></c:out> </span>
                        </h2>
                    </div>


                    <div class="row">
                        <div class="product-active owl-carousel">
                            <c:if test="${not empty sessionScope.hangHoaSet}">
                            <c:forEach items = "${sessionScope.hangHoaSet}" var = "hangHoa">
                                <c:if test="${nsx.maNSX == hangHoa.NSX.maNSX}">
                                    <div class="col-lg-12">
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
                                                        <c:out value="${hangHoa.NSX.tenNSX}"></c:out>
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
                                                <h4><a class="product_name" href="${pageContext.request.contextPath}/HangHoaChiTietController?maSP=${hangHoa.maSP}">
                                                    <c:out value="${hangHoa.tenSP}"></c:out>
                                                </a></h4>
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
                                                    <li><a class="links-details" href="${pageContext.request.contextPath}/YeuThichController?maSP=${hangHoa.maSP}&duongDan=home"><i class="fa fa-heart-o"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- single-product-wrap end -->
                                </div>
                                </c:if>
                            </c:forEach>
                            </c:if>
                        </div>
                    </div>

                </div>
                <!-- Li's Section Area End Here -->
            </div>
            </c:forEach>
</c:if>
        </div>
    </section>
    <!-- Li's Trendding Products Area End Here -->
    <!-- Footer -->
    <%@ include file="/Client/footer.jsp" %>

    <!-- Quick View | Modal Area End Here -->
</div>
<!-- Body Wrapper End Here -->
<!-- jQuery-V1.12.4 -->

<%--<script type="text/javascript">--%>
<%--    (function() {--%>

<%--        var img = document.getElementById('container').firstChild;--%>
<%--        img.onload = function() {--%>
<%--            if(img.height > img.width) {--%>
<%--                img.height = '100%';--%>
<%--                img.width = 'auto';--%>
<%--            }--%>
<%--        };--%>

<%--    }());--%>
<%--</script>--%>

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

<!-- index30:23-->
</html>