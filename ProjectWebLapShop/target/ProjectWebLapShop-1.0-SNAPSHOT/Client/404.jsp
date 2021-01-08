<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 26/11/2020
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<META HTTP-EQUIV="Content-language" CONTENT="vi">--%>

<!doctype html>
<html class="no-js" lang="zxx">

<!-- 40432:14-->
<head>
    <c:url value="/Client" var="url"></c:url>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Error</title>
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
    <%@ include file="/Client/header.jsp" %>
    <!-- Begin Li's Breadcrumb Area -->
    <div class="breadcrumb-area">
        <div class="container">
            <div class="breadcrumb-content">
                <ul>
                    <li><a href="${url}/home.jsp">Home</a></li>
                    <li class="active">404 Error</li>
                </ul>
            </div>
        </div>
    </div>
    <!-- Li's Breadcrumb Area End Here -->
    <!-- Error 404 Area Start -->
    <div class="error404-area pt-30 pb-60">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="error-wrapper text-center ptb-50 pt-xs-20">
                        <div class="error-text">
                            <h1>404</h1>
                            <h2>Opps! PAGE NOT BE FOUND</h2>
                            <p>Sorry but the page you are looking for does not exist, have been removed, <br> name changed or is temporarity unavailable.</p>
                        </div>

                        <div class="error-button">
                            <a href="${pageContext.request.contextPath }/WaitingController">Back to home page</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Error 404 Area Start -->
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
<!-- 40432:14-->
</html>

