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
<%-- <META HTTP-EQUIV="Content-language" CONTENT="vi">--%>

<!doctype html>
<html class="no-js" lang="zxx">

<!-- about-us32:04-->
<head>
    <c:url value="/Client" var="url"></c:url>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>About Us</title>
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
                    <li class="active">About Us</li>
                </ul>
            </div>
        </div>
    </div>
    <!-- Li's Breadcrumb Area End Here -->

    <!-- team area wrapper start -->
    <div class="team-area pt-60 pt-sm-44">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="li-section-title capitalize mb-25">
                        <h2><span>Our team</span></h2>
                    </div>
                </div>
            </div> <!-- section title end -->
            <div class="row">
                <div class="col-lg-3 col-md-6 col-sm-6">
                    <div class="team-member mb-60 mb-sm-30 mb-xs-30">
                        <div class="team-thumb">
                            <img src="${url}/images/team/1.png" alt="Our Team Member">
                        </div>
                        <div class="team-content text-center">
                            <h3>Thong Chu Thanh</h3>
                            <p>Leader</p>
                            <a href="#">thongchuthanh2000@gmail.com</a>
                            <div class="team-social">
                                <a href="https://www.facebook.com/tle121100/"><i class="fa fa-facebook"></i></a>
                                <a href="https://github.com/thongchuthanh2000"><i class="fa fa-github"></i></a>
                                <a href="https://www.youtube.com/channel/UCS3qZrrEvDYZ4ji0rC0sqWg"><i class="fa fa-youtube"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">

                <div class="team-member mb-60 mb-sm-30 mb-xs-30">
                        <div class="team-thumb">
                            <img src="${url}/images/team/4.jpg" alt="Our Team Member">
                        </div>
                        <div class="team-content text-center">
                            <h3>Pham Nhut Truong</h3>
                            <p>Developper</p>
                            <a href="#">phamnhutruong@gmail.com</a>
                            <div class="team-social">
                                <a href="https://www.facebook.com/profile.php?id=100007344551626"><i class="fa fa-facebook"></i></a>
                                <a href=""><i class="fa fa-github"></i></a>
                                <a href=""><i class="fa fa-youtube"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">

                <div class="team-member mb-60 mb-sm-30 mb-xs-30">
                        <div class="team-thumb">
                            <img src="${url}/images/team/3.jpg" alt="Our Team Member">
                        </div>
                        <div class="team-content text-center">
                            <h3>Nguyen Quyet Sinh</h3>
                            <p>Developper</p>
                            <a href="#">sinhnguyen27022000@gmail.com</a>
                            <div class="team-social">
                                <a href="https://www.facebook.com/KaiAkatsuki0/"><i class="fa fa-facebook"></i></a>
                                <a href=""><i class="fa fa-github"></i></a>
                                <a href=""><i class="fa fa-youtube"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 col-sm-6">

                <div class="team-member mb-60 mb-sm-30 mb-xs-30">
                        <div class="team-thumb">
                            <img src="${url}/images/team/2.jpg" alt="Our Team Member">
                        </div>
                        <div class="team-content text-center">
                            <h3>Le Khanh Vinh</h3>
                            <p>Developper</p>
                            <a href="#">lekhanhvinh@gmail.com</a>
                            <div class="team-social">
                                <a href="https://www.facebook.com/profile.php?id=100006565518989"><i class="fa fa-facebook"></i></a>
                                <a href=""><i class="fa fa-github"></i></a>
                                <a href=""><i class="fa fa-youtube"></i></a>
                                <a href="#"><i class="fa fa-google-plus"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                </div> <!-- end single team member -->

            </div>
        </div>
    </div>
    <!-- team area wrapper end -->
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

<!-- about-us32:14-->
</html>
