<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link rel="shortcut icon" href="${pageContext.request.contextPath }/Client/images/favicon.png">
    <!-- Material Design Iconic Font-V2.2.0 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/material-design-iconic-font.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/font-awesome.min.css">
    <!-- Font Awesome Stars-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/fontawesome-stars.css">
    <!-- Meanmenu CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/meanmenu.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/owl.carousel.min.css">
    <!-- Slick Carousel CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/slick.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/animate.css">
    <!-- Jquery-ui CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/jquery-ui.min.css">
    <!-- Venobox CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/venobox.css">
    <!-- Nice Select CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/nice-select.css">
    <!-- Magnific Popup CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/magnific-popup.css">
    <!-- Bootstrap V4.1.3 Fremwork CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/bootstrap.min.css">
    <!-- Helper CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/helper.css">
    <!-- Main Style CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/Client/css/responsive.css">
    <!-- Modernizr js -->
    <script src="${pageContext.request.contextPath }/Client/js/vendor/modernizr-2.8.3.min.js"></script>
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
                    <li><a href="${pageContext.request.contextPath }/Client/index.jsp">Home</a></li>
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

                            <c:forEach items="${hangHoaImage }" var="hanghoaimage">
                            <div class="lg-image">
                                <a class="popup-img venobox vbox-item"  data-gall="myGallery">
                                    <img src="data:image/jpg;base64,${hanghoaimage.HinhBu}" alt="product image">
                                </a>
                            </div>
<%--                            <div class="lg-image">--%>
<%--                                <a class="popup-img venobox vbox-item" href="images/product/large-size/2.jpg" data-gall="myGallery">--%>
<%--                                    <img src="images/product/large-size/2.jpg" alt="product image">--%>
<%--                                </a>--%>
<%--                            </div>--%>
<%--                            <div class="lg-image">--%>
<%--                                <a class="popup-img venobox vbox-item" href="images/product/large-size/3.jpg" data-gall="myGallery">--%>
<%--                                    <img src="images/product/large-size/3.jpg" alt="product image">--%>
<%--                                </a>--%>
<%--                            </div>--%>
<%--                            <div class="lg-image">--%>
<%--                                <a class="popup-img venobox vbox-item" href="images/product/large-size/4.jpg" data-gall="myGallery">--%>
<%--                                    <img src="images/product/large-size/4.jpg" alt="product image">--%>
<%--                                </a>--%>
<%--                            </div>--%>
<%--                            <div class="lg-image">--%>
<%--                                <a class="popup-img venobox vbox-item" href="images/product/large-size/5.jpg" data-gall="myGallery">--%>
<%--                                    <img src="images/product/large-size/5.jpg" alt="product image">--%>
<%--                                </a>--%>
<%--                            </div>--%>
<%--                            <div class="lg-image">--%>
<%--                                <a class="popup-img venobox vbox-item" href="images/product/large-size/6.jpg" data-gall="myGallery">--%>
<%--                                    <img src="images/product/large-size/6.jpg" alt="product image">--%>
<%--                                </a>--%>
<%--                            </div>--%>
                            </div>
                            <div class="product-details-thumbs slider-thumbs-1">
                                <div class="sm-image"><img src="data:image/jpg;base64,${hanghoaimage.HinhNho}" alt="product image thumb"></div>

                            </div>
                        </c:forEach>
                    </div>
                    <!--// Product Details Left -->
                </div>




                <div class="col-lg-7 col-md-6">
                    <div class="product-details-view-content pt-60">
                        <div class="product-info">
                            <h2>${hangHoa.TenSP }</h2>
<%--                            <span class="product-details-ref">Reference: demo_15</span>--%>
                            <div class="rating-box pt-20">
                                <ul class="rating rating-with-review-item">
                                    <c:choose>
                                        <c:when test="${sao > 0}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${sao > 1}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${sao > 2}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${sao > 3}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${sao > 4}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                </ul>
                            </div>
                            <div class="price-box pt-20">
                                <span class="new-price new-price-2">${hangHoa.GiaBan }</span>
                            </div>
<%--                            <div class="product-desc">--%>
<%--                                <p>--%>
<%--                                        --%>
<%--                                </p>--%>
<%--                            </div>--%>
<%--                            <div class="product-variants">--%>
<%--                                <div class="produt-variants-size">--%>
<%--                                    <label>Dimension</label>--%>
<%--                                    <select class="nice-select">--%>
<%--                                        <option value="1" title="S" selected="selected">40x60cm</option>--%>
<%--                                        <option value="2" title="M">60x90cm</option>--%>
<%--                                        <option value="3" title="L">80x120cm</option>--%>
<%--                                    </select>--%>
<%--                                </div>--%>
<%--                            </div>--%>
                            <div class="single-add-to-cart">
                                <form action="${pageContext.request.contextPath}/GioHangInfoAddController" class="cart-quantity">
                                    <div class="quantity">
                                        <label>Quantity</label>
                                        <div class="cart-plus-minus">
                                            <input class="cart-plus-minus-box" value="1" type="text" name="SoLuong">
                                            <div class="dec qtybutton"><i class="fa fa-angle-down"></i></div>
                                            <div class="inc qtybutton"><i class="fa fa-angle-up"></i></div>
                                        </div>
                                    </div>
                                    <button class="add-to-cart" type="submit">Add to cart</button>
                                </form>
                            </div>

                            <div class="product-additional-info pt-25">
                                <a class="wishlist-btn"
                                   href="${pageContext.request.contextPath}/YeuThichController?MaSP=${hangHoa.maSP}"
                                ><i class="fa fa-heart-o"></i>Add to wishlist</a>
                                <div class="product-social-sharing pt-25">
                                    <ul>
                                        <li class="facebook"><a href="#"><i class="fa fa-facebook"></i>Facebook</a></li>
                                        <li class="twitter"><a href="#"><i class="fa fa-twitter"></i>Twitter</a></li>
                                        <li class="google-plus"><a href="#"><i class="fa fa-google-plus"></i>Google +</a></li>
                                        <li class="instagram"><a href="#"><i class="fa fa-instagram"></i>Instagram</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="block-reassurance">
                                <ul>
                                    <li>
                                        <div class="reassurance-item">
                                            <div class="reassurance-icon">
                                                <i class="fa fa-check-square-o"></i>
                                            </div>
                                            <p>Security policy (edit with Customer reassurance module)</p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="reassurance-item">
                                            <div class="reassurance-icon">
                                                <i class="fa fa-truck"></i>
                                            </div>
                                            <p>Delivery policy (edit with Customer reassurance module)</p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="reassurance-item">
                                            <div class="reassurance-icon">
                                                <i class="fa fa-exchange"></i>
                                            </div>
                                            <p> Return policy (edit with Customer reassurance module)</p>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
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
                            <li><a class="active" data-toggle="tab" href="#description"><span>Description</span></a></li>
                            <li><a data-toggle="tab" href="#product-details"><span>Product Details</span></a></li>
                            <li><a data-toggle="tab" href="#reviews"><span>Reviews</span></a></li>
                        </ul>
                    </div>
                    <!-- Begin Li's Tab Menu Content Area -->
                </div>
            </div>
            <div class="tab-content">
                <div id="description" class="tab-pane active show" role="tabpanel">
                    <div class="product-description">
                        <span>
                                <c:out value = "${hangHoa.MoTa}"/>
                        </span>
                    </div>
                </div>
                <div id="product-details" class="tab-pane" role="tabpanel">
                    <div class="product-details-manufacturer">
<%--                        <a href="#">--%>
<%--                            <img src="images/product-details/1.jpg" alt="Product Manufacturer Image">--%>
<%--                        </a>--%>
                        <p><span>CPU</span> <c:out value = "${hangHoa.CPU}"/></p>
                        <p><span>RAM</span> <c:out value = "${hangHoa.RAM}"/></p>
                        <p><span>OCung</span> <c:out value = "${hangHoa.OCung}"/></p>
                        <p><span>ManHinh</span> <c:out value = "${hangHoa.ManHinh}"/></p>
                        <p><span>PIN</span> <c:out value = "${hangHoa.PIN}"/></p>
                        <p><span>NSX</span> <c:out value = "${hangHoa.NSX.TenNSX}"/></p>

                    </div>
                </div>
                <div id="reviews" class="tab-pane" role="tabpanel">
                    <div class="product-reviews">
                        <div class="product-details-comment-block">
                            <div class="comment-review">
                                <c:forEach items="${binhLuan}" var="binhluan">
                                    <span>Grade</span>

                                <ul class="rating">
                                    <c:choose>
                                        <c:when test="${binhluan.Sao > 0}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${binhluan.Sao > 1}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${binhluan.Sao > 2}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${binhluan.Sao > 3}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                    <c:choose>
                                        <c:when test="${binhluan.Sao > 4}">
                                            <li><i class="fa fa-star-o"></i></li>
                                        </c:when>
                                        <c:otherwise>
                                            <li class="no-star"><i class="fa fa-star-o"></i></li>
                                        </c:otherwise>
                                    </c:choose>

                                </ul>


                            </div>
                            <fmt:formatDate value="${binhluan.ThoiGian}" pattern="MM/yyyy" var="newdatevar" />

                            <div class="comment-author-infos pt-25">
                                <span>Time</span>
                                <em><c:out value="${newdatevar}" /></em>
                            </div>
                            <div class="comment-details">
                                <h4 class="title-block">Content</h4>
                                <p><c:out value="${binhluan.NoiDung}" /></p>
                            </div>
                            </c:forEach>

                            <div class="review-btn">
                                <a class="review-links" href="#" data-toggle="modal" data-target="#mymodal">Write Your Review!</a>
                            </div>
                            <!-- Begin Quick View | Modal Area -->
                            <div class="modal fade modal-wrapper" id="mymodal" >
                                <div class="modal-dialog modal-dialog-centered" role="document">
                                    <div class="modal-content">
                                        <div class="modal-body">
                                            <h3 class="review-page-title">Write Your Review</h3>
                                            <div class="modal-inner-area row">
                                                <div class="col-lg-6">
                                                    <div class="li-review-product">
                                                        <img src="data:image/jpg;base64,${hanghoa.HinhBu}" alt="Li's Product">
                                                        <div class="li-review-product-desc">
                                                            <p class="li-product-name"><c:out value="${hanghoa.tenSP}" /></p>
                                                            <p>
                                                                <span> <c:out value="${hanghoa.MoTa}" /></span>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-lg-6">
                                                    <div class="li-review-content">
                                                        <!-- Begin Feedback Area -->
                                                        <div class="feedback-area">
                                                            <div class="feedback">
                                                                <h3 class="feedback-title">Our Feedback</h3>
                                                                <form action="${pageContext.request.contextPath }/BinhLuanAddController">
                                                                    <p class="your-opinion">
                                                                        <label>Your Rating</label>
                                                                        <span>
                                                                                    <select class="star-rating" name ="sao">
<%--                                                                                      <option value="1">1</option>--%>
<%--                                                                                      <option value="2">2</option>--%>
<%--                                                                                      <option value="3">3</option>--%>
<%--                                                                                      <option value="4">4</option>--%>
<%--                                                                                      <option value="5">5</option>--%>

                                                                                      <c:forEach var="sao" begin="1" end="5">
                                                                                          <option value="${sao}">
                                                                                              <c:out value="${sao}"/>
                                                                                          </option>
                                                                                      </c:forEach>
                                                                                    </select>
                                                                                </span>
                                                                    </p>

                                                                    <div class="feedback-input">
                                                                        <p class="feedback-form-author">
                                                                            <label for="author">Name<span class="required">*</span>
                                                                            </label>
                                                                            <input id="author" name="tieuDe" value="" size="30" aria-required="true" type="text">
                                                                        </p>
<%--                                                                        <p class="feedback-form-author feedback-form-email">--%>
<%--                                                                            <label for="email">Email<span class="required">*</span>--%>
<%--                                                                            </label>--%>
<%--                                                                            <input id="email" name="email" value="" size="30" aria-required="true" type="text">--%>
<%--                                                                            <span class="required"><sub>*</sub> Required fields</span>--%>
<%--                                                                        </p>--%>
                                                                        <div class="feedback-btn pb-15">
                                                                            <a href="#" class="close" data-dismiss="modal" aria-label="Close">Close</a>
                                                                            <a href="#">Submit</a>
                                                                        </div>
                                                                    </div>

                                                                    <p class="feedback-form">
                                                                        <label for="feedback">Your Review</label>
                                                                        <textarea id="feedback" name="NoiDung" cols="45" rows="8" aria-required="true"></textarea>
                                                                    </p>

                                                                </form>
                                                            </div>
                                                        </div>
                                                        <!-- Feedback Area End Here -->
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Quick View | Modal Area End Here -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Product Area End Here -->
    <!-- Begin Li's Laptop Product Area -->
    <section class="product-area li-laptop-product pt-30 pb-50">
        <div class="container">
            <div class="row">
                <!-- Begin Li's Section Area -->
                <div class="col-lg-12">
                    <div class="li-section-title">
                        <h2>
                            <span>5 other products in the same category:</span>
                        </h2>
                    </div>
                    <div class="row">
                        <div class="product-active owl-carousel">
                            <c:forEach items="${sessionScope.hangHoaList}" var="list">
                            <div class="col-lg-12">
                                <!-- single-product-wrap start -->

<%--                                <c:forEach items = "${sessionScope.hangHoaList}" var = "list">--%>
<%--                                    <c:if test = "${list.giaBan-list.giaGoc < 0}">--%>
<%--                                        <!-- Begin Single Slide Area -->--%>
<%--                                        <div class="single-slide align-center-left  animation-style-01 bg-1">--%>
<%--                                            <div class="slider-progress"></div>--%>
<%--                                            <div class="slider-content">--%>
<%--                                                <c:set var = "sale" scope = "session" value = "${(list.giaGoc-list.giaBan)/list.giaBan*100}"/>--%>
<%--                                                <h5>Sale Offer <span><c:out value = "${sale}"/></span></h5>--%>

<%--                                                <h2><c:out value = "${list.tenSP}"/></h2>--%>
<%--                                                <h3>Starting at <span><c:out value = "${list.giaBan}"/></span></h3>--%>
<%--                                                <div class="default-btn slide-btn">--%>
<%--                                                    <a class="links"  href="${pageContext.request.contextPath}/HangHoaChiTietController?MaSP=${list.hangHoa.maSP}">Shopping Now</a>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </c:if>--%>
<%--                                </c:forEach>--%>
<%--                                --%>


                                <div class="single-product-wrap">
                                    <div class="product-image">
                                        <a href="single-product.jsp">
                                            <img src="data:image/jpg;base64,${list.hinh}" alt="Li's Product Image">
                                        </a>
                                        <span class="sticker">New</span>
                                    </div>
                                    <div class="product_desc">
                                        <div class="product_desc_info">
                                            <div class="product-review">
                                                <h5 class="manufacturer">
                                                    <a href="product-details.jsp"><c:out value="${list.tenSP}"></c:out></a>
                                                </h5>

<%--                                                <c:set value="${}"--%>
<%--                                                <div class="rating-box">--%>
<%--                                                    <ul class="rating">--%>

<%--                                                        <c:choose>--%>
<%--                                                            <c:when test="${binhluan.Sao > 0}">--%>
<%--                                                                <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:when>--%>
<%--                                                            <c:otherwise>--%>
<%--                                                                <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:otherwise>--%>
<%--                                                        </c:choose>--%>

<%--                                                        <c:choose>--%>
<%--                                                            <c:when test="${binhluan.Sao > 1}">--%>
<%--                                                                <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:when>--%>
<%--                                                            <c:otherwise>--%>
<%--                                                                <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:otherwise>--%>
<%--                                                        </c:choose>--%>

<%--                                                        <c:choose>--%>
<%--                                                            <c:when test="${binhluan.Sao > 2}">--%>
<%--                                                                <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:when>--%>
<%--                                                            <c:otherwise>--%>
<%--                                                                <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:otherwise>--%>
<%--                                                        </c:choose>--%>

<%--                                                        <c:choose>--%>
<%--                                                            <c:when test="${binhluan.Sao > 3}">--%>
<%--                                                                <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:when>--%>
<%--                                                            <c:otherwise>--%>
<%--                                                                <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:otherwise>--%>
<%--                                                        </c:choose>--%>

<%--                                                        <c:choose>--%>
<%--                                                            <c:when test="${binhluan.Sao > 4}">--%>
<%--                                                                <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:when>--%>
<%--                                                            <c:otherwise>--%>
<%--                                                                <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                            </c:otherwise>--%>
<%--                                                        </c:choose>--%>

<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                    </ul>--%>
<%--                                                </div>--%>
                                            </div>
                                            <h4><a class="product_name"  href="${pageContext.request.contextPath}/HangHoaChiTietController?MaSP=${list.maSP}"><c:out value="${list.tenSP}"></c:out></a></h4>
                                            <div class="price-box">
                                                <span class="new-price">
                                                    <c:out value="${list.giaBan}"></c:out>
                                                </span>
                                            </div>
                                        </div>
                                        <div class="add-actions">
                                            <ul class="add-actions-link">
                                                <li class="add-cart active"><a href="">Add to cart</a></li>
                                                <li><a  href="${pageContext.request.contextPath}/HangHoaChiTietController?MaSP=${list.maSP}" title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><i class="fa fa-eye"></i></a></li>
                                                <li><a class="links-details"  href="${pageContext.request.contextPath}/YeuThichController?MaSP=${list.maSP}"><i class="fa fa-heart-o"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                </c:forEach>
                                <!-- single-product-wrap end -->
                            </div>
<%--                            <div class="col-lg-12">--%>
<%--                                <!-- single-product-wrap start -->--%>
<%--                                <div class="single-product-wrap">--%>
<%--                                    <div class="product-image">--%>
<%--                                        <a href="single-product.jsp">--%>
<%--                                            <img src="images/product/large-size/2.jpg" alt="Li's Product Image">--%>
<%--                                        </a>--%>
<%--                                        <span class="sticker">New</span>--%>
<%--                                    </div>--%>
<%--                                    <div class="product_desc">--%>
<%--                                        <div class="product_desc_info">--%>
<%--                                            <div class="product-review">--%>
<%--                                                <h5 class="manufacturer">--%>
<%--                                                    <a href="product-details.jsp">Studio Design</a>--%>
<%--                                                </h5>--%>
<%--                                                <div class="rating-box">--%>
<%--                                                    <ul class="rating">--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                    </ul>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                            <h4><a class="product_name" href="single-product.jsp">Mug Today is a good day</a></h4>--%>
<%--                                            <div class="price-box">--%>
<%--                                                <span class="new-price new-price-2">$71.80</span>--%>
<%--                                                <span class="old-price">$77.22</span>--%>
<%--                                                <span class="discount-percentage">-7%</span>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="add-actions">--%>
<%--                                            <ul class="add-actions-link">--%>
<%--                                                <li class="add-cart active"><a href="#">Add to cart</a></li>--%>
<%--                                                <li><a href="#" title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><i class="fa fa-eye"></i></a></li>--%>
<%--                                                <li><a class="links-details" href="wishlist.jsp"><i class="fa fa-heart-o"></i></a></li>--%>
<%--                                            </ul>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <!-- single-product-wrap end -->--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-12">--%>
<%--                                <!-- single-product-wrap start -->--%>
<%--                                <div class="single-product-wrap">--%>
<%--                                    <div class="product-image">--%>
<%--                                        <a href="single-product.jsp">--%>
<%--                                            <img src="images/product/large-size/3.jpg" alt="Li's Product Image">--%>
<%--                                        </a>--%>
<%--                                        <span class="sticker">New</span>--%>
<%--                                    </div>--%>
<%--                                    <div class="product_desc">--%>
<%--                                        <div class="product_desc_info">--%>
<%--                                            <div class="product-review">--%>
<%--                                                <h5 class="manufacturer">--%>
<%--                                                    <a href="product-details.jsp">Graphic Corner</a>--%>
<%--                                                </h5>--%>
<%--                                                <div class="rating-box">--%>
<%--                                                    <ul class="rating">--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                    </ul>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                            <h4><a class="product_name" href="single-product.jsp">Accusantium dolorem1</a></h4>--%>
<%--                                            <div class="price-box">--%>
<%--                                                <span class="new-price">$46.80</span>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="add-actions">--%>
<%--                                            <ul class="add-actions-link">--%>
<%--                                                <li class="add-cart active"><a href="#">Add to cart</a></li>--%>
<%--                                                <li><a href="#" title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><i class="fa fa-eye"></i></a></li>--%>
<%--                                                <li><a class="links-details" href="wishlist.jsp"><i class="fa fa-heart-o"></i></a></li>--%>
<%--                                            </ul>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <!-- single-product-wrap end -->--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-12">--%>
<%--                                <!-- single-product-wrap start -->--%>
<%--                                <div class="single-product-wrap">--%>
<%--                                    <div class="product-image">--%>
<%--                                        <a href="single-product.jsp">--%>
<%--                                            <img src="images/product/large-size/4.jpg" alt="Li's Product Image">--%>
<%--                                        </a>--%>
<%--                                        <span class="sticker">New</span>--%>
<%--                                    </div>--%>
<%--                                    <div class="product_desc">--%>
<%--                                        <div class="product_desc_info">--%>
<%--                                            <div class="product-review">--%>
<%--                                                <h5 class="manufacturer">--%>
<%--                                                    <a href="product-details.jsp">Studio Design</a>--%>
<%--                                                </h5>--%>
<%--                                                <div class="rating-box">--%>
<%--                                                    <ul class="rating">--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                    </ul>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                            <h4><a class="product_name" href="single-product.jsp">Mug Today is a good day</a></h4>--%>
<%--                                            <div class="price-box">--%>
<%--                                                <span class="new-price new-price-2">$71.80</span>--%>
<%--                                                <span class="old-price">$77.22</span>--%>
<%--                                                <span class="discount-percentage">-7%</span>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="add-actions">--%>
<%--                                            <ul class="add-actions-link">--%>
<%--                                                <li class="add-cart active"><a href="#">Add to cart</a></li>--%>
<%--                                                <li><a href="#" title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><i class="fa fa-eye"></i></a></li>--%>
<%--                                                <li><a class="links-details" href="wishlist.jsp"><i class="fa fa-heart-o"></i></a></li>--%>
<%--                                            </ul>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <!-- single-product-wrap end -->--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-12">--%>
<%--                                <!-- single-product-wrap start -->--%>
<%--                                <div class="single-product-wrap">--%>
<%--                                    <div class="product-image">--%>
<%--                                        <a href="single-product.jsp">--%>
<%--                                            <img src="images/product/large-size/5.jpg" alt="Li's Product Image">--%>
<%--                                        </a>--%>
<%--                                        <span class="sticker">New</span>--%>
<%--                                    </div>--%>
<%--                                    <div class="product_desc">--%>
<%--                                        <div class="product_desc_info">--%>
<%--                                            <div class="product-review">--%>
<%--                                                <h5 class="manufacturer">--%>
<%--                                                    <a href="product-details.jsp">Graphic Corner</a>--%>
<%--                                                </h5>--%>
<%--                                                <div class="rating-box">--%>
<%--                                                    <ul class="rating">--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                    </ul>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                            <h4><a class="product_name" href="single-product.jsp">Accusantium dolorem1</a></h4>--%>
<%--                                            <div class="price-box">--%>
<%--                                                <span class="new-price">$46.80</span>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="add-actions">--%>
<%--                                            <ul class="add-actions-link">--%>
<%--                                                <li class="add-cart active"><a href="#">Add to cart</a></li>--%>
<%--                                                <li><a href="#" title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><i class="fa fa-eye"></i></a></li>--%>
<%--                                                <li><a class="links-details" href="wishlist.jsp"><i class="fa fa-heart-o"></i></a></li>--%>
<%--                                            </ul>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <!-- single-product-wrap end -->--%>
<%--                            </div>--%>
<%--                            <div class="col-lg-12">--%>
<%--                                <!-- single-product-wrap start -->--%>
<%--                                <div class="single-product-wrap">--%>
<%--                                    <div class="product-image">--%>
<%--                                        <a href="single-product.jsp">--%>
<%--                                            <img src="images/product/large-size/6.jpg" alt="Li's Product Image">--%>
<%--                                        </a>--%>
<%--                                        <span class="sticker">New</span>--%>
<%--                                    </div>--%>
<%--                                    <div class="product_desc">--%>
<%--                                        <div class="product_desc_info">--%>
<%--                                            <div class="product-review">--%>
<%--                                                <h5 class="manufacturer">--%>
<%--                                                    <a href="product-details.jsp">Studio Design</a>--%>
<%--                                                </h5>--%>
<%--                                                <div class="rating-box">--%>
<%--                                                    <ul class="rating">--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                        <li class="no-star"><i class="fa fa-star-o"></i></li>--%>
<%--                                                    </ul>--%>
<%--                                                </div>--%>
<%--                                            </div>--%>
<%--                                            <h4><a class="product_name" href="single-product.jsp">Mug Today is a good day</a></h4>--%>
<%--                                            <div class="price-box">--%>
<%--                                                <span class="new-price new-price-2">$71.80</span>--%>
<%--                                                <span class="old-price">$77.22</span>--%>
<%--                                                <span class="discount-percentage">-7%</span>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="add-actions">--%>
<%--                                            <ul class="add-actions-link">--%>
<%--                                                <li class="add-cart active"><a href="#">Add to cart</a></li>--%>
<%--                                                <li><a href="#" title="quick view" class="quick-view-btn" data-toggle="modal" data-target="#exampleModalCenter"><i class="fa fa-eye"></i></a></li>--%>
<%--                                                <li><a class="links-details" href="wishlist.jsp"><i class="fa fa-heart-o"></i></a></li>--%>
<%--                                            </ul>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <!-- single-product-wrap end -->--%>
<%--                            </div>--%>
                        </div>
                    </div>
                </div>
                <!-- Li's Section Area End Here -->
            </div>
        </div>
    </section>
    <!-- Li's Laptop Product Area End Here -->
    <!-- Footer -->
    <jsp:include page="/Client/footer.jsp" />
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

