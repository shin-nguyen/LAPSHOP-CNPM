<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<META HTTP-EQUIV="Content-language" CONTENT="vi">--%>

<!doctype html>
<html class="no-js" lang="zxx">

<!-- single-product31:30-->
<head>

    <c:url value="/Client" var="url"></c:url>

    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Single Product</title>
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
    <!-- Begin Li's Breadcrumb Area -->
    <div class="breadcrumb-area">
        <div class="container">
            <div class="breadcrumb-content">
                <ul>
                    <li><a href="${url}/home.jsp">Home</a></li>
                    <li class="active">Single Product</li>
                </ul>
            </div>
        </div>
    </div>
    <!-- Li's Breadcrumb Area End Here -->
    <!-- content-wraper start -->
    <div class="content-wraper">
        <div class="container">
            <div class="row single-product-area">
                <div class="col-lg-5 col-md-6">
                    <!-- Product Details Left -->
                    <div class="product-details-left">
                        <div class="product-details-images slider-navigation-1">
                            <c:if test="${not empty hangHoaImageList}">
                            <c:forEach items="${hangHoaImageList}" var="hinhAnh">
                            <div class="lg-image">
                                <a class="popup-img venobox vbox-item" data-gall="myGallery">
                                    <img  src="data:image/jpg;base64,${hinhAnh.base64HinhBu}"  alt="Hinh Anh Bu"/>
                                </a>
                            </div>
                            </c:forEach>
                            </c:if>
                        </div>
                        <div class="product-details-thumbs slider-thumbs-1">
                            <c:if test="${not empty hangHoaImageList}">
                            <c:forEach items="${hangHoaImageList}" var="hinhAnhNho">
                            <div class="sm-image"><img  src="data:image/jpg;base64,${hinhAnhNho.base64HinhNho}"  alt="Hinh Anh Nho"></div>
                            </c:forEach>
                            </c:if>
                        </div>
                    </div>
                    <!--// Product Details Left -->
                </div>

                <c:if test="${not empty hangHoa}">
                <div class="col-lg-7 col-md-6">
                    <div class="product-details-view-content pt-60">
                        <div class="product-info">
                            <h2>${hangHoa.tenSP }</h2>
                            <span class="product-details-ref">
                                <c:out value="${hangHoa.NSX.tenNSX}"></c:out>
                            </span>
                            <div class="rating-box pt-20">
                                <ul class="rating rating-with-review-item">

                                                                            <c:choose>
                                                                                <c:when test="${hangHoa.sao > 0}">
                                                                                    <li><i class="fa fa-star-o"></i></li>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                                                </c:otherwise>
                                                                            </c:choose>

                                                                            <c:choose>
                                                                                <c:when test="${hangHoa.sao > 1}">
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


                                    <li class="review-item"><a href="${pageContext.request.contextPath}/BinhLuanAddController?maSP=${hangHoa.maSP}">Write Review</a></li>
                                </ul>
                            </div>
                            <div class="price-box pt-20">
                                <span class="new-price new-price-2">
                                    <fmt:setLocale value="vi_VN"/>
                                    <fmt:formatNumber value="${hangHoa.giaBan}" type="currency"/>
                                </span>
                            </div>
                            <div class="product-desc">
                                <p>
                                    <span>
                                        <c:out value = "${hangHoa.moTa}"/>
                                    </span>
                                </p>
                            </div>

                            <div class="single-add-to-cart">
                                <form action="${pageContext.request.contextPath}/GioHangInfoAddController" method="get" class="cart-quantity">
                                    <div class="quantity">
                                        <input name="maSP" value="${hangHoa.maSP}" hidden>
                                        <label>Quantity</label>
                                        <div class="cart-plus-minus">
                                            <input class="cart-plus-minus-box" value="1" type="text" name="soLuong">
                                            <div class="dec qtybutton"><i class="fa fa-angle-down"></i></div>
                                            <div class="inc qtybutton"><i class="fa fa-angle-up"></i></div>
                                        </div>
                                    </div>
                                    <button class="add-to-cart" type="submit">Add to cart</button>
                                </form>
                            </div>
                            <div class="product-additional-info pt-25">
                                <a class="wishlist-btn" href="${pageContext.request.contextPath}/YeuThichController?maSP=${hangHoa.maSP}&duongDan=single-product">
                                <i class="fa fa-heart-o"></i>Add to wishlist</a>
                            </div>
                            <div class="block-reassurance">
                                <ul>
                                    <li>
                                        <div class="reassurance-item">
                                            <div class="reassurance-icon">
                                                <i class="fa fa-check-square-o"></i>
                                            </div>
                                            <p>Security policy </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="reassurance-item">
                                            <div class="reassurance-icon">
                                                <i class="fa fa-truck"></i>
                                            </div>
                                            <p>Delivery policy</p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="reassurance-item">
                                            <div class="reassurance-icon">
                                                <i class="fa fa-exchange"></i>
                                            </div>
                                            <p> Return policy </p>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                </c:if>
            </div>
        </div>
    </div>
    <!-- content-wraper end -->
    <!-- Begin Product Area -->
    <div class="product-area pt-35">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="li-product-tab">
                        <ul class="nav li-product-menu">
                            <li><a data-toggle="tab"><span>Product Details</span></a></li>
                        </ul>
                    </div>
                    <!-- Begin Li's Tab Menu Content Area -->
                </div>
            </div>

            <div class="tab-content">
                <div id="product-details" class="tab-pane active show " role="tabpanel">
                    <div class="product-details-manufacturer">
                                                <p><span>CPU</span> <c:out value = "${hangHoa.CPU}"/></p>
                                                <p><span>RAM</span> <c:out value = "${hangHoa.RAM}"/></p>
                                                <p><span>Hard Disk</span> <c:out value = "${hangHoa.OCung}"/></p>
                                                <p><span>Display</span> <c:out value = "${hangHoa.manHinh}"/></p>
                                                <p><span>Battery</span> <c:out value = "${hangHoa.PIN}"/></p>
                                                <p><span>Manufacturer</span> <c:out value = "${hangHoa.NSX.tenNSX}"/></p>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="product-area pt-35">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">

                    <div class="li-product-tab">
                        <ul class="nav li-product-menu">
                            <li><a data-toggle="tab"><span>Review</span></a></li>
                        </ul>
                    </div>
                    <!-- Begin Li's Tab Menu Content Area -->
                </div>
            </div>

            <div class="tab-content">
                <div id="reviews" class="tab-pane active show " role="tabpanel">
                    <div class="product-reviews">
                        <div class="product-details-comment-block">
<c:if test="${not empty binhLuanSet}">
                            <c:forEach items="${binhLuanSet}" var="binhluan">
                                <p>-------------------------------------------------------------------------------------</p>
                                <fmt:formatDate value="${binhluan.thoiGian}" pattern="dd/MM/yyyy" var="newdatevar" />

                                <div class="comment-author-infos pt-25">
                                    <span><c:out value="${binhluan.taiKhoan.hoTen}"/></span>
                                    <em><c:out value="${newdatevar}" /></em>
                                </div>

                                <div class="comment-review">
                                    <span>Grade</span>

                                    <ul class="rating">
                                                                            <c:choose>
                                                                                <c:when test="${binhluan.sao > 0}">
                                                                                    <li><i class="fa fa-star-o"></i></li>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                                                </c:otherwise>
                                                                            </c:choose>

                                                                            <c:choose>
                                                                                <c:when test="${binhluan.sao > 1}">
                                                                                    <li><i class="fa fa-star-o"></i></li>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                                                </c:otherwise>
                                                                            </c:choose>

                                                                            <c:choose>
                                                                                <c:when test="${binhluan.sao > 2}">
                                                                                    <li><i class="fa fa-star-o"></i></li>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                                                </c:otherwise>
                                                                            </c:choose>

                                                                            <c:choose>
                                                                                <c:when test="${binhluan.sao > 3}">
                                                                                    <li><i class="fa fa-star-o"></i></li>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                                                </c:otherwise>
                                                                            </c:choose>

                                                                            <c:choose>
                                                                                <c:when test="${binhluan.sao > 4}">
                                                                                    <li><i class="fa fa-star-o"></i></li>
                                                                                </c:when>
                                                                                <c:otherwise>
                                                                                    <li class="no-star"><i class="fa fa-star-o"></i></li>
                                                                                </c:otherwise>
                                                                            </c:choose>


                                </ul>

                                </div>

                            <div class="comment-details">
                                <h4 class="title-block"><c:out value="${binhluan.tieuDe}"/> </h4>
                                <p><c:out value="${binhluan.noiDung}"/> </p>
                            </div>
                            </c:forEach>
</c:if>
                            <div class="review-btn">
                                <a class="review-links" href="${pageContext.request.contextPath}/BinhLuanAddController?maSP=${hangHoa.maSP}">Write Your Review!</a>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!-- Product Area End Here -->
    <!-- Begin Li's Laptop Product Area -->
    <div class="product-area pt-60 pb-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="li-product-tab">
                        <ul class="nav li-product-menu">
                            <li><a class="active" data-toggle="tab" href="#li-new-product"><span>Other Products </span></a></li>
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
                                                    <li><a class="links-details" href="${pageContext.request.contextPath}/YeuThichController?maSP=${hangHoa.maSP}&duongDan=single-product"><i class="fa fa-heart-o"></i></a></li>
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
    <!-- Li's Laptop Product Area End Here -->

    <!-- Footer -->
    <%@ include file="/Client/footer.jsp" %>
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

<!-- single-product31:32-->
</html>